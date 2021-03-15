clear
echo "make sure you are in the correct directory before running...."
$certs = get-content .\CERTS.txt
foreach($item in $certs){
   #set-ADUser -Identity "UPN" -add @{'altSecurityIdentities'= "$item"}
}
#(get-aduser -Identity UPN -Properties altsecurityidentities).altsecurityidentities