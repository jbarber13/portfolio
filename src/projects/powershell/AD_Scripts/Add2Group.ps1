#BULK - ADD USERS TO GROUP
Clear
echo "make sure you are in the correct directory before running...."
$list = Get-Content .\output.txt

$GroupName = 'DL0057'
foreach($item in $list){
   
    Add-ADPrincipalGroupMembership -Identity $item -MemberOf $GroupName
    Write-host $item added to $GroupName

}
