#BULK - ADD USERS TO GROUP
Clear
echo "make sure you are in the correct directory before running...."
$list = Get-Content .\UPN.txt

#"" | Out-File -FilePath ".\out.txt" #this will clear the existing out.txt so you can write to it again

$Group = 'groupName'

foreach($item in $list){
   
Add-ADPrincipalGroupMembership -Identity $item -MemberOf $Group

$output = "$item added to $Group"

Write-Host $output

#$output | Out-File -Append -FilePath "./out.txt" #Writes output file to confirm names are correct

}
