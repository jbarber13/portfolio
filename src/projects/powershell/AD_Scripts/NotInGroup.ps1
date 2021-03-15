
echo "make sure you are in the correct directory before running...."
$list = Get-Content .\UPN.txt

#Determine if any of the list of UPNs is NOT in the group $group

$group = "groupName"

#Clear-Content ".\output.txt" #this will clear the existing UPN.txt so you can write to it again

foreach ($item in $list){ #where $user is first, last MiddleInitial

    $members = Get-ADGroupMember -Identity $group -Recursive | Select -ExpandProperty SamAccountName
    if ($members -notcontains $item){
        Write-Host $item is not in $group

        #$item | Out-File -Append -FilePath "./output.txt" #Writes UPNs to a local file UPN.txt
    }
    
}