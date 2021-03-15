clear

#application loop control
$isTheBigDone = $false

#voice object
Add-Type -AssemblyName System.speech
$speak = New-Object System.Speech.Synthesis.SpeechSynthesizer
$speak.SelectVoice('Microsoft Zira Desktop')

echo "Hello World!"
$speak.Speak("Hello World!")

echo "I AM A TEXT TO SPEECH ROBOT, BEEP BEEP BOP"
$speak.Speak("I AM A TEXT TO SPEECH ROBOT, BEEP BEEP BOP")

#prints and vocalizes text to speech after prompting user for vocalize speed and M/F voice
function T2S{
    $done = $false
    $exit = "exit"
    $count = 0;

    # Add-Type -AssemblyName System.speech
    #$speak = New-Object System.Speech.Synthesis.SpeechSynthesizer

    $rate = Read-Host "How fast? (10 to -10)"
    $MF = Read-Host "Male(M) or Female(F) voice?"

    if ($MF -eq "M"){$speak.SelectVoice('Microsoft David Desktop')}

    echo "TEXT TO SPEECH, TO EXIT TYPE: $exit  `n`n`n`n"

    $speak.Rate = $rate
    while(! $done){
        $in = Read-Host 
        if($in -eq $exit){
            $done = $true
            $speak.Speak("Das Vedanya")
            break
        }
        $speak.Speak($in)
    # $count = $count + 1
    # echo $count      
    }
    $speak.SelectVoice('Microsoft Zira Desktop')
}

#quote bot, randomly vocalizes and prints a quote from @param $path
function q-bot ($path){
    echo "Q-BOT mk2 `n`n`n`n"
    
    #reset speech object
    Add-Type -AssemblyName System.speech
    $speak = New-Object System.Speech.Synthesis.SpeechSynthesizer
    $speak.rate = -2
    Try{
        $PhraseLocation = "$path"
        $Phrase         = (Get-Content $PhraseLocation) | Get-Random -ErrorAction Ignore

        Write-Host $phrase
        $speak.Speak($phrase)
    }
    Catch{
        Write-Output "RIP"
    }
}

#vocalizes and prints a randoom wrong when incorrect key is entered (error handeling) 
function wrong{
    $wrong = "WRONG", "INCORRECT", "NOT A VALID INPUT", "VERY WRONG", "EXTREEMELY WRONG", "OUTRAGEOUS", "TRY AGAIN", "PLEASE TRY AGAIN", "PLEASE DON'T ENTER ANOTHER WRONG INPUT"
    $ran = get-random -maximum $wrong.Length

    return $wrong[$ran];
}

#finds ISS from API, loads browser with pin at coordinates, gets weather below ISS, and vocalizes/prints all information  
function findISS{
    $resource = "https://api.wheretheiss.at/v1/satellites/25544"

    $req = Invoke-WebRequest $resource | ConvertFrom-Json 
    $lat = $req.latitude
    $long = $req.longitude
    $alt = $req.altitude
    $alt = [math]::Round($alt, 1)
    
    #URL for map with lat/long coordinates, z --> zoom (1-20 where 20 is max zoom (street level))
    $url = "https://maps.google.com/?q=$lat,$long&ll=$lat,$long&z=4"

    $lat = [math]::Round($lat)
    $long = [math]::Round($long)
    $key = "0a27f2baa9c4135a8b5589295ecd4c25"
    #$weatherUrl = "api.openweathermap.org/data/2.5/weather?lat=$lat&lon=$long&APPID={$key}"
    #Write-Host $weatherUrl

    $k = 273.15

    $weatherUrl = "api.openweathermap.org/data/2.5/weather?lat=$lat&lon=$long&APPID=$key"
    $weatherReq = Invoke-WebRequest $weatherUrl | ConvertFrom-Json
    $temp = $weatherReq.main.temp
    $temp = ($temp -  $k)*(9/5)+32 #F conversion
    $temp =[math]::Round($temp)
    $dscr = $weatherReq.weather.description

    Add-Type -AssemblyName System.speech
    $speak = New-Object System.Speech.Synthesis.SpeechSynthesizer
    $speak.SelectVoice('Microsoft Zira Desktop')

    Start-Process "$url"
    Write-Host "ISS IS AT AN ALTITUDE OF $alt KILOMETERS ABOVE THE SURFACE OF EARTH"
    $speak.Speak("ISS IS AT AN ALTITUDE OF $alt KILOMETERS ABOVE THE SURFACE OF EARTH")
    Write-Host("It is currently $dscr below ISS with an air temperature of $temp degrees fahrenheit")
    $speak.Speak("It is currently $dscr below ISS with an air temperature of $temp degrees fahrenheit")
}

#vocalizes wrongs randomly from array @param $howMany times
function wrongLoop($howMany){
    $wrong = "wrong", "QUITE WRONG", "WRONG, DINGUS", "CORRECT, I MEAN WRONG, DEFINITELY WRONG", "WRONG", "INCORRECT", "NOT A VALID INPUT", "VERY WRONG", "EXTREEMELY WRONG", "OUTRAGEOUS", "TRY AGAIN", "PLEASE TRY AGAIN", "PLEASE DON'T ENTER ANOTHER WRONG INPUT"
    
    for($i=1; $i -le $howMany; $i++){
        $ran = get-random -maximum $wrong.Length
        #reset speech object
        $speak = New-Object System.Speech.Synthesis.SpeechSynthesizer
        $out = $wrong[$ran] 
        Write-Host $out
        $speak.rate = -2
        $speak.Speak($out)
    }
  }
  
  #Plays Airhorn.mp3 because ¯\_(ツ)_/¯ 
  #@param $vol --> 0-1
function airhorn($vol){
    add-type -assembly presentationcore 
    $player = new-object system.windows.media.mediaplayer
    $player.Volume = $vol

    $file = "C:\Users\jake.barber\Documents\Airhorn.mp3"

    $player.open($file)
    # start-sleep -m 100 # a little pause, just in case
    $player.play()
}

  #Allows a variety of given inputs @param $test to exit the applicaiton
  function validExit($test){
    $isValid =  $false
    $exits = @("exit", "0", "goodbye", "k bai", "bai", "bye", "cya", "later", "go away", "begone")    
    foreach ($i in $exits){
       if($test -eq $i){$isvalid = $true}
    }
    return $isValid
  }

#Application loop
while(!$isTheBigDone){

    $select = Read-Host "Free T2S(1) or WHERE_IS_ISS?(2) or WRONGs(3) or go away(0)?"
    
    #application decision
    if($select -eq "1"){
        T2S      
    }elseif($select -eq "hidden"){
        $speak = New-Object System.Speech.Synthesis.SpeechSynthesizer
        q-bot("C:\Users\jake.barber\Desktop\msc\BigT.txt")
        $speak.SelectVoice('Microsoft Zira Desktop')
    }elseif($select -eq "2"){
        #reset speech object
        $speak = New-Object System.Speech.Synthesis.SpeechSynthesizer
        $speak.Speak("THE INTERNATIONAL SPACE STATION IS HERE")        
        $_alt = findISS
    }elseif($select -eq "3"){
        $speak.Speak("How many wrongs would you like?")
        $many = Read-Host "How many wrongs would you like?"
        wrongLoop($many)
    }elseif($select -eq "hidden"){
        airhorn .5
    }elseif($select -eq "hidden"){
        $speak = New-Object System.Speech.Synthesis.SpeechSynthesizer
        q-bot("C:\Users\jake.barber\Desktop\msc\BigW.txt")
        $speak.SelectVoice('Microsoft Zira Desktop')
    }else{
        #reset speech object
        $speak = New-Object System.Speech.Synthesis.SpeechSynthesizer       

        if(validExit($select)){
            $speak.Speak("k bai")
            Write-Host "k bai"
            $isTheBigDone = $true
            break
        }else{
            $out = wrong 
            Write-Host $out
            $speak.rate = -2
            $speak.Speak($out)
        }
    }#end else
  }#end loop