#OU Count
Clear
$T2Enabled = 'OU=T2-UA-Enabled Users,OU=Tier 2 User Accounts,DC=sba,DC=gov'
$T2Enabled = (Get-ADUser -Filter * -SearchBase $T2Enabled | where {$_.Enabled -eq $True}).Count

$CapitalAccess = 'OU=Capital Access,OU=Domain Clients,DC=sba,DC=gov'
$CapitalAccess = (Get-ADUser -Filter * -SearchBase $CapitalAccess | where {$_.Enabled -eq $True}).Count

$CFO_DFC = 'OU=Denver Finance Center,OU=Chief Financial Officer,OU=Domain Clients,DC=sba,DC=gov'
$CFO_DFC = (Get-ADUser -Filter * -SearchBase $CFO_DFC | where {$_.Enabled -eq $True}).Count

$Disaster = 'OU=Disaster Assistance,OU=Domain Clients,DC=sba,DC=gov'
$Disaster = (Get-ADUser -Filter * -SearchBase $Disaster | where {$_.Enabled -eq $True}).Count

$Total = $T2Enabled + $CapitalAccess + $CFO_DFC + $Disaster

Write-Host "T2-UA-Enabled Users: $T2Enabled"
Write-Host "Capital Access: $CapitalAccess"
Write-Host "Denver Finance Center: $CFO_DFC"
Write-Host "Disaster Assistance: $Disaster"
Write-Host "Total Combined: $Total"