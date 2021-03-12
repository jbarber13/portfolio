clear

#Init Voice Object
Add-Type -AssemblyName System.speech
$speak = New-Object System.Speech.Synthesis.SpeechSynthesizer

$speak.Speak("How long to scan BTC in minutes?")
$count = Read-Host "How long to scan BTC in minutes?"

$speak.Speak("CHECKING BTC EVERY 15 MINUTES")
Write-Host "CHECKING BTC EVERY 15 MINUTES `n`n`n"

#Fetch API call
function fetch{
    [Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
    #web request, update last fetch, print
    $url = "https://blockchain.info/ticker"
    $btc = Invoke-WebRequest $url | ConvertFrom-Json
    return $btc.USD.last
}

#print output
function printOut($value){
    $timestamp = Get-Date
    #print
    Write-Host "BTC is at $value as of $timestamp"
}

#log to file given @param $path
function log($value){    
    
    $timestamp = Get-Date
    $log = "$value,$timestamp"

    #append to file
    $log | Out-File C:\Users\jake.barber\Documents\BTC_DATA.csv -Append -Encoding UTF8  
}

#2 new lines
function gap{
    Write-Host "`n`n"
}

#sleep for 15 mins (900 seconds)
function sleepF{
    Start-Sleep -Seconds 900
}

#iterate count and print remaining iterations
$innerCount = 0
function loopsRemaining{ 
    $iterations = $count-$innerCount
    $round =  [math]::Round($iterations)  
    Write-Host "$round checks remaining"
}


#Get initial data for BTC before loop 
#Initialize $last to compare to $current in loop
function init{
    Write-Host "Initial BTC: "
    $last = fetch
    printOut($last)
    log($last)
    gap
    sleepF
}

#Application loop
init
$count = $count / 15
$count = $count - .5
$done = $false
while(! $done){  

    $current = fetch
    printOut($current)
    log($current)
    #decision for BTC trend
    if($last -gt $current){
        Write-Host "BITCOIN IS GOING DOWN, BUY NOW"       
        $speak.Speak("BITCOIN IS GOING DOWN, BUY NOW") 
    }elseif($last -lt $current){
        Write-Host "BITCOIN IS GOING UP, HODL"
        $speak.Speak("BITCOIN IS GOING UP, hodl!")
    }else{
        Write-Host "EQUAL?"
        $speak.Speak("EQUAL?")
    }
    #print loops remaining
    loopsRemaining

    #add new lines for formatting 
    gap

    #set last to current to compare new current next loop
    $last = $current

    #iterate loop
    $innerCount = $innerCount + 1      

    #check loop, redundant loop termination
    if($innerCount -gt $count){
        $done = $true
        break
    }

    #sleep application for 15 mins before next loop
    sleepF
}

Write-Host "SCAN COMPLETE"
$speak.Speak("SCAN COMPLETE")
