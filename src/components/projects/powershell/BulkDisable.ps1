
clear
echo "make sure you are in the correct directory before running...."
$list = Get-Content .\exact.txt

foreach ($item in $list) 
{
  $user = get-aduser -Identity $item
  if($user -eq $null){
    Write-Host "No user found for $item" 
  }else{
    Disable-ADAccount -Identity $user
    Write-Host Disabled $user.UserPrincipalName
  }

}