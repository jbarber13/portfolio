#MAKE SURE YOU RUN IN CORRECT INSTANCE OF POWERSHELL (ALT, T2, ETC)
#Moves X509 certs and mirrors permissions 
clear

#CHANGE THESE VALUES ONLY
$Account2Mirror = ""   #Account to mirror
$prefix = ""                    #Account prefix (i.e. csc., cio., bsc., etc.)
$UPN = ""                  #New ALT user's regular UPN


#New username should equal $prefix.$upn --> PRE.Username

echo "make sure you are in the correct directory before running...."

$NewAccount = "$prefix.$UPN"
Get-ADUser -Identity $UPN -Properties altSecurityIdentities | Select -ExpandProperty altSecurityIdentities | Out-File .\CERTS.TXT
Write-Host Got X509 Certs for $UPN

$certs = get-content .\CERTS.txt
foreach($item in $certs){
   set-ADUser -Identity "$prefix.$upn" -add @{'altSecurityIdentities'= "$item"}
}
Write-Host Set X509 Certs for "$prefix.$UPN"

$groups = (Get-ADUser -Identity $Account2Mirror -properties memberof).memberof
foreach($item in $groups){
  Add-ADPrincipalGroupMembership -Identity $NewAccount -MemberOf "$item" #un-comment this line and run when ready to commit change
 }

 Write-Host Mirrored AD permissions for "$prefix.$UPN" to $Account2Mirror