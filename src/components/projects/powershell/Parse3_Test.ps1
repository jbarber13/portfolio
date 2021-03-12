clear
echo "make sure you are in the correct directory before running...."
$list = Get-Content .\list.txt

#This is intended to parse an input format of John Doe or Doe, John A into a UPN such as JADoe

#Transforms username@domain.tld to username
Function CleanUPN ($user){
    $UPN = $User.UserPrincipalName | Out-String   
    $at = $UPN.IndexOf('@')
    $UPN = $UPN.Substring(0, ($at))
    
    Return $UPN
}

#Transforms input string into 2 separate tokens and removes whitespace, returns array of 2 tokens for the two names
Function CleanName([string]$Input){
    $first = ($item.Split(" "))[0]
    $second = ($item.Split(" "))[1]
    #$first = $first.Substring(0,($first.length - 1)) #remove comma for last, first
    $first = $first.Trim()
    $second = $second.Trim()

    [array]$out = $first, $Second
    write-host $out

    return $out
}

#Gathers UPN based on the two tokens of input from array $n, attempts multiple ways to get an exact match or a close match 
Function getUPN([array]$n){
    
    [string]$n0 = $n[0]
    [string]$n1 = $n[1]

    #initial test, checks for exact match to provided name in format: last, first MI or first last or even last first
    $User= Get-ADUser -Filter "Name -like '*$n0*' -and Name -like '*$n1*'";  
    
    #check for mis-spelled lastname - lastname, first
    if($user -eq $null){
        $lastInitial = $n0.Substring(0,1)
        $User= Get-ADUser -Filter "SN -like '$lastInitial*' -and GivenName -like '$n1*' ";
        
        Write-Host check for mis-spelled lastname - lastname, first
    }

    #check for mis-spelled firstname - lastname, first
    if($user -eq $null){
        $firstInitial = $n1.Substring(0,1)
        $User= Get-ADUser -Filter "SN -like '$n0*' -and GivenName -like '$firstInitial*' ";
        
        #Write-Host $n0 $firstInitial
        Write-Host check for mis-spelled firstname - lastname, first
    }

    #check for mis-spelled lastname - firstname lastname
    if($user -eq $null){
        $lastInitial = $n1.Substring(0,1)
        $User= Get-ADUser -Filter "GivenName -like '$n0*' -and SN -like '$lastInitial*'";        

        Write-Host check for mis-spelled lastname - firstname lastname
    }

    #check for mis-spelled firstname - firstname lastname
    if($user -eq $null){
        $firstInitial = $n0.Substring(0,1)
        $User= Get-ADUser -Filter "Name -GivenName '$firstInitial*' -and SN -like '$n1*'";

        Write-Host check for mis-spelled firstname - firstname lastname
    }

    $User = CleanUPN($User)
    Return $User
}

#appends $out to .\UPN.txt
Function writeOutput($out){    
    $out | Out-File -Append -FilePath "./UPN.txt" #Writes UPNs to a local file UPN.txt    
}


#Main / Driver
clear-content .\UPN.txt #this will clear the existing UPN.txt so you can write to it again
foreach ($item in $list) 
{
  $names = CleanName($item)
  #Write-Host $names
  $FinalUPN = getUPN($names)
  Write-Host $FinalUPN
  writeOutput($FinalUPN)
}

