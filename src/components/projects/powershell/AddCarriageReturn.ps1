#Add carriage return after ';'

clear
echo "make sure you are in the correct directory before running...."
$list = Get-Content .\list2.txt



$testString = "Select; words" #...

$testString = $testString.Replace(";", "`n")
$list = $list.Replace(">>", "`r`n")

#write-host $list
# 

Function writeOutput($out){    
    $out | Out-File -Append -FilePath "./list.txt" #Writes UPNs to a local file UPN.txt    
}

#clear-content .\list.txt #this will clear the existing UPN.txt so you can write to it again
foreach ($item in $list) 
{
  $item = $item.Trim()
  #WriteOutput($item.Substring(2))
}