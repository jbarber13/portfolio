#NEW ACCOUNT
#RUN IN T2 POWERSHELL

#Sets the following for ODA Surge users April 2020
#DC address, 4/30 expiration, standard t2 permissions, capital accesss everyone group, and ZScaler POC Users group
clear

$UPN = "laskabowski"#Replace with username, i.e. jabarber

Add-ADPrincipalGroupMembership -Identity $UPN  -MemberOf 'SBA All Employee Distribution List','sba all hands','Office 365 In Place Hold','ocaeveryone','ZScaler POC Users'
Set-ADUser -Identity $UPN -AccountExpirationDate "5/01/2022 12:00:00 AM" #SET ONE DAY AFTER THE REQUESTED DATE

$StreetAddress = "409 3rd Street SW"
$City = "Washington"
$State = "D.C."
$PostalCode = 20416
$Country = "US"

$Title = "Surge Loan Specialist"
$Department = "OFPO COVID-19 SURGE"
$Compny = "Highlight Technologies"
$Manager = "clthomas" 

 
Set-ADUser -Identity $UPN -StreetAddress $StreetAddress -City $City -State $State -PostalCode $PostalCode -Country $Country -Title $Title -Department $Department -Company $Compny -Manager $Manager
