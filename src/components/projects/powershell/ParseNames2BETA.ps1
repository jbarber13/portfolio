#This is how to parse a list of names from a list.txt file located in the directory notated in line 2
#This can parse names in the following formats: 
#John Doe
#Doe, John A. 
#Any other format as long as the first and last name are separated by a space and are the first 2 tokens in a line on the .txt file
#Errors will come from names that produce more than 1 UPN, such as generic names, or users with multiple accounts
#Will print NO USER FOUND if the name is not found at all, check console output 

#initializes $user to each line item in list.txt to do things to inside loop, use $user.UserPrincipleName

#Tailored  for SBA


clear
echo "make sure you are in the correct directory before running...."
$list = Get-Content .\list.txt

Clear-Content ".\UPN.txt" #this will clear the existing UPN.txt so you can write to it again

foreach ($item in $list) #where $user is first, last MiddleInitial. 
{
  $first = ($item.Split(" "))[0]
  $second = ($item.Split(" "))[1]
  $first = $first.Substring(0,($first.length - 1))

  $first = $first.Trim()
  $second = $second.Trim()

  $User= Get-ADUser -Filter "Name -like '*$first*' -and Name -like '*$second*'";  

 if($user -eq $null){
    $User= Get-ADUser -Filter "Name -like '*$first*'";
    write-host POTENTIAL ERROR $first $second RESOLVED TO NAME BELOW
 }
 if($user -eq $null){
    $UPN = "NO USER FOUND"
 }else{
    $UPN =  $User.UserPrincipalName | Out-String   
    $at = $UPN.IndexOf('@')
    $UPN = $UPN.Substring(0, ($at))
 } 
 
  Write-Host $UPN #this just prints the UPNs so you can see which ones fail

  
  $UPN | Out-File -Append -FilePath "./UPN.txt" #Writes UPNs to a local file UPN.txt
  
}
