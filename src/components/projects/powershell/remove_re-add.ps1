#getListOfUsers
#Copy into Exchange Powershell
clear
echo "make sure you are in the correct directory before running...."
$list = Get-Content .\list.txt
$MAILBOX = 'mailbox@domain' #change this
clear-content .\UPN.txt #this will clear the existing UPN.txt so you can write to it again
Get-mailboxpermission $MAILBOX | select User | Out-File -Append -FilePath "./UPN.txt" #Writes UPNs to a local file UPN.txt   


#RemoveUsers - FullAccess Only
#format UPN.txt before running or errors
#Copy into Exchange Powershell
Clear
echo "make sure you are in the correct directory before running...."
$list = Get-Content .\UPN.txt
$MAILBOX = 'mailbox_name' #change this
write-host test
foreach ($item in $list) #where $user is first, last MiddleInitial. 
{
    write-host TEST
    #Remove-MailboxPermission -Identity $MAILBOX -User $item -AccessRights FullAccess -AutoMapping:$false -Confirm:$false
    Write-Host Removed $item from $MAILBOX

}


