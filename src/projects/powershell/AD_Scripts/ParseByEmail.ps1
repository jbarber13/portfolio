#Parse by EMAIL with first.last@org.domain

clear
echo "make sure you are in the correct directory before running...."

$list = Get-Content .\list.txt
#"" | Out-File -FilePath ".\UPN.txt" #this will clear the existing UPN.txt so you can write to it again
[int]$global:errorCount = 0
[int]$global:totalIterations = 0

Function CleanUPN ($user){
    $UPN = $User.UserPrincipalName | Out-String   
    $at = $UPN.IndexOf('@')
    $UPN = $UPN.Substring(0, ($at))
      
    Return $UPN
}
foreach ($i in $list) #where $user is first, last MiddleInitial. 
{
    $U = Get-ADUser -Filter "mail -like '$i'"

    if($U -eq $null){
        $U = "NO USER FOUND for $i"
        $global:errorCount++
    }else{
        $U = CleanUPN($U)
    } 
    $global:totalIterations++
    Write-Host $U
    #$UPN | Out-File -Append -FilePath "./UPN.txt" #Writes UPNs to a local file UPN.txt
}
Write-Host $errorCount users not found
Write-Host $totalIterations total iterations