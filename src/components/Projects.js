import React from 'react'
import Zoom from 'react-reveal/Zoom'
import Pulse from 'react-reveal/Pulse';


/**************LINKS**************/
//BarberBucks
const BarberBucksDex = "https://barberbucks-dex.jake-barber.com/"
const BBDGIT = "https://github.com/jbarber13/barberbucks-dex"
const amplify = "https://aws.amazon.com/amplify/"
const redux = "https://redux.js.org/"
const ganache = "https://www.trufflesuite.com/ganache"
const truffle = "https://www.trufflesuite.com/truffle"
const smartContract = "https://en.wikipedia.org/wiki/Smart_contract"
const solidity = "https://docs.soliditylang.org/en/v0.8.2/"
const kovan = "https://faucet.kovan.network/"
const infura = "https://infura.io/"
//BarberBucks SWAP
const BBFSwap = "https://barberbucks-swap.jake-barber.com"
const BBFSwapGIT = "https://github.com/jbarber13/BarberBucks_SWAP"
const rinkeby = "https://www.rinkeby.io/"
//DSM
const dsm = "https://dsm.jake-barber.com"
const ipfs = "https://ipfs.io/"
const rFaucet = "https://faucet.rinkeby.io/"
const DSM_Git = "https://github.com/jbarber13/DSM/tree/master"
//CryptoGram
const cryptogram = "https://cryptogram.jake-barber.com"
const cryptogram_git = "https://github.com/jbarber13/cryptogram"
//PERSONAL WEBSITE
const portfolio = "https://www.jake-barber.com/"
const reactJS = "https://reactjs.org/"
const github = "https://github.com/jbarber13"
const bootstrap = "https://getbootstrap.com/"
//WITTY WEATHER
const ww = "https://github.com/jbarber13/Witty-Weather.git"
const raddy = "https://www.radford.edu/content/radfordcore/home.html"
const studio = "https://developer.android.com/studio"
//AWS
const awsLink = "https://jake-barber-aws-serverless.s3.amazonaws.com/website/index.html"
const awsTutorialLink = "https://aws.amazon.com/getting-started/hands-on/build-serverless-web-app-lambda-apigateway-s3-dynamodb-cognito/"
const cognito = "https://aws.amazon.com/cognito/"
const lambda = "https://aws.amazon.com/lambda/"
const dynamoDB = "https://aws.amazon.com/dynamodb/"
const StaticS3 = "https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html"
const aws = "https://en.wikipedia.org/wiki/Amazon_Web_Services"
const route53 = "https://aws.amazon.com/route53/"
//POWERSHELL - AD
const Add2Group = "https://s3.amazonaws.com/jake-barber.com/projects/powershell/AD_Scripts/Add2Group.ps1"
const AddCarriageReturn = "https://s3.amazonaws.com/jake-barber.com/projects/powershell/AD_Scripts/AddCarriageReturn.ps1"
const ALTaccountMaker = "https://s3.amazonaws.com/jake-barber.com/projects/powershell/AD_Scripts/ALTaccountMaker.ps1"
const BulkDisable = "https://s3.amazonaws.com/jake-barber.com/projects/powershell/AD_Scripts/AddCarriageReturn.ps1"
const GetBitlockerRecoveryKeys = "https://s3.amazonaws.com/jake-barber.com/projects/powershell/AD_Scripts/Get-BitlockerRecoveryKeys.ps1"
const NotInGroup = "https://s3.amazonaws.com/jake-barber.com/projects/powershell/AD_Scripts/NotInGroup.ps1"
const Parse3 = "https://s3.amazonaws.com/jake-barber.com/projects/powershell/AD_Scripts/Parse3_Test.ps1"
const ParseByEmail = "https://s3.amazonaws.com/jake-barber.com/projects/powershell/AD_Scripts/ParseByEmail.ps1"
const ParseNames = "https://s3.amazonaws.com/jake-barber.com/projects/powershell/AD_Scripts/ParseNames.ps1"

//POWERSHELL - API
const btcChecker = "https://s3.amazonaws.com/jake-barber.com/projects/powershell/FunProjects/btcChecker.ps1"
const text2speech = "https://s3.amazonaws.com/jake-barber.com/projects/powershell/FunProjects/text2speech.ps1"
//JAVA
const FileReader = "https://s3.amazonaws.com/jake-barber.com/projects/Java/Zips/FileReader.zip"
const InfectionSim = "https://s3.amazonaws.com/jake-barber.com/projects/Java/Zips/InfectionSim.zip"
const ListTraverse = "https://s3.amazonaws.com/jake-barber.com/projects/Java/Zips/ListTraverse.zip"
const Palindrome = "https://s3.amazonaws.com/jake-barber.com/projects/Java/Zips/Palindrome.zip"
const Game = "https://s3.amazonaws.com/jake-barber.com/projects/Java/Zips/Game.zip"

const Projects = () => {
    return (
        <div className="projects" id="projects" >
            <br /><br /><br /><br /><br /><br />
            <h2>Projects</h2>
            <br />

            <Pulse>
                <div className="links" id="barberbucks-dex">
                    <h2>
                        <a className="text-link" href={BarberBucksDex} target="_blank" rel="noreferrer">BarberBucks DEX</a>
                    </h2>
                    <p>
                        <a className="text-link" href={BarberBucksDex} target="_blank" rel="noreferrer">BarberBucks DEX</a> is a decentralized token exchange that allows users to trade test ETH for the Barber Buck token (BB).
                        This application is connected
                        to the <a className="text-link" href={kovan} target="_blank" rel="noreferrer">Kovan Testnet</a>. As it is for learning, testing, and demonstration purposes only,
                        no true value is exchanged via the application.
                        This application is what is known as a decentralized exchange, or a <a className="text-link" href="https://en.wikipedia.org/wiki/Decentralized_exchange"> DEX</a>
                        , and thus falls into a category of applications known as <a className="text-link" href="https://en.wikipedia.org/wiki/Decentralized_application" target="_blank" rel="noreferrer">DAPP</a>s.
                        The front end application was developed in <a className="text-link" href={reactJS}> React JavaScript</a>, uses <a className="text-link" href={redux}>Redux</a> for state control, and 
                        is hosted and deployed via <a className="text-link" href={amplify} target="_blank" rel="noreferrer">AWS Amplify</a>.
                        The <a className="text-link" href={smartContract}> smart contract</a> for this DAPP was developed in <a className="text-link" href={solidity}> Solidity</a> and
                         was rigorously tested and deployed using <a className="text-link" href={ganache}> ganache</a> and <a className="text-link" href={truffle}> truffle</a>.
                        The connection to the blockchain is achieved using an API from <a className="text-link" href={infura}>Infura</a>.
                        This DAPP requires the browser extension <a className="text-link" href="https://metamask.io/" target="_blank" rel="noreferrer">MetaMask</a> in
                        order to identify and authenticate users, funds, and transactions.
                        This is an Ethereum wallet and is the industry standard for interacting with decentralized applications at this time.
                        You will need to switch the network in MetaMask to the Kovan Testnet.
                        If you would like to receive some test ETH to interact with the DAPP, please use the <a className="text-link" href={kovan} target="_blank" rel="noreferrer">faucet</a>.
                        Simply log in with a valid <a className="text-link" href="https://github.com/">GitHub</a> account and paste your wallet address from MetaMask (Kovan Testnet) in the chat and you will be sent some test ETH.
                        The source code is available <a className="text-link" id="barberbucks-swap" href={BBDGIT}>here</a>.
                    </p>
                </div>
            </Pulse>
            <Pulse>
                <div className="links" >
                    <h2>
                        <a className="text-link" href={BBFSwap} target="_blank" rel="noreferrer">BarberBucks SWAP</a>
                    </h2>
                    <p>
                        <a className="text-link" href={BBFSwap} target="_blank" rel="noreferrer">BarberBucks SWAP</a> is a decentralized token exchange that allows users to swap test ETH for Barber Buck Fixed (BBF) tokens at a fixed price in ETH.
                        The token for this DAPP is separate from <a className="text-link" href={BarberBucksDex} target="_blank" rel="noreferrer">BarberBucks DEX</a> as the price is set to a fixed value in ETH.
                        This application is connected
                        to the <a className="text-link" href={kovan} target="_blank" rel="noreferrer">Kovan Testnet</a>. As it is for learning, testing, and demonstration purposes only,
                        no true value is exchanged via the application.
                        This application is what is known as a decentralized exchange, or a <a className="text-link" href="https://en.wikipedia.org/wiki/Decentralized_exchange"> DEX</a>
                        , and thus falls into a category of applications known as <a className="text-link" href="https://en.wikipedia.org/wiki/Decentralized_application" target="_blank" rel="noreferrer">DAPP</a>s.
                        The front end application was developed in <a className="text-link" href={reactJS}> React JavaScript</a>, uses react native state control, and
                        is hosted and deployed via <a className="text-link" href={amplify} target="_blank" rel="noreferrer">AWS Amplify</a>.
                        The <a className="text-link" href={smartContract}> smart contract</a> for this DAPP was developed in <a className="text-link" href={solidity}> Solidity</a>                      and was rigorously tested and deployed using <a className="text-link" href={ganache}> ganache</a> and <a className="text-link" href={truffle}> truffle</a>.
                        The connection to the blockchain is achieved using an API from <a className="text-link" href={infura}>Infura</a>.
                        This DAPP requires the browser extension <a className="text-link" href="https://metamask.io/" target="_blank" rel="noreferrer">MetaMask</a> in
                        order to identify and authenticate users, funds, and transactions.
                        This is an Ethereum wallet and is the industry standard for interacting with decentralized applications at this time.
                        You will need to switch the network in MetaMask to the Kovan Testnet.
                        If you would like to receive some test ETH to interact with the DAPP, please use the <a className="text-link" href={kovan} target="_blank" rel="noreferrer">faucet</a>.
                        Simply log in with a valid <a className="text-link" href="https://github.com/">GitHub</a> account and paste your wallet address from MetaMask (Kovan Testnet) in the chat and you will be sent some test ETH.
                        The source code is available <a className="text-link" id="DSM" href={BBFSwapGIT}>here</a>.
                    </p>
                </div>
            </Pulse>

            <Pulse>
                <div className="links" >
                    <h2>
                        <a className="text-link" href={dsm} target="_blank" rel="noreferrer">Decentralized Social Media</a>
                    </h2>
                    <p>
                        <a className="text-link" href={dsm} target="_blank" rel="noreferrer">Decentralized Social Media (DSM)</a> is a decentralized social media platform that uses a user's blockchain address to authenticate rather than a traditional login and runs and stores images in a decentralzied fashion.
                        This application requires the browser extension <a className="text-link" href="https://metamask.io/" target="_blank" rel="noreferrer">MetaMask</a> in
                        order to connect to the blockchain, retreive the images stored there, and allow the user to log in.
                        This is an Ethereum wallet and is the industry standard for interacting with decentralized applications at this time.
                        This application is connected
                        to the <a className="text-link" href={rinkeby} target="_blank" rel="noreferrer">Rinkeby Testnet</a>. As it is for learning, testing, and demonstration purposes only,
                        no true value is exchanged via the application.
                        You will need to switch the network in MetaMask to the Rinkeby Testnet.                  
                        Images are hosted using <a className="text-link" href={ipfs} target="_blank" rel="noreferrer">IPFS</a>, which is a distributed file hosting protocol.               
                        Once images are stored on IPFS, a hash value is returned to represent that image, which is then stored on the <a className="text-link" href={smartContract}> smart contract</a> for this project.                
                        As always, the smart contract was developed in <a className="text-link" href={solidity}> Solidity</a> and was rigorously tested and deployed using <a className="text-link" href={ganache}> ganache</a> and <a className="text-link" href={truffle}> truffle</a>.
                        If you would like to receive some test ETH to interact with the DAPP, please use the <a className="text-link" href={rFaucet} target="_blank" rel="noreferrer">faucet</a>. 
                        The source code is available <a className="text-link" id="cryptogram" href={DSM_Git}>here</a>.
                    </p>
                </div>
            </Pulse>

            <Pulse>
                <div className="links" >
                    <h2>
                        <a className="text-link" href={cryptogram} target="_blank" rel="noreferrer">CryptoGram</a>
                    </h2>
                    <p>
                        <a className="text-link" href={cryptogram} target="_blank" rel="noreferrer">CryptoGram</a> is an upgraded decentralized social media platform that uses a user's blockchain address to authenticate in a similar way to <a className="text-link" href={dsm} target="_blank" rel="noreferrer">Decentralized Social Media (DSM)</a>.
                        CryptoGram includes a large amount of added functionality over the original DSM. Users can make comments on posts, and these comments can be tipped by other participants, highest tipped comments and posts are shown first. 
                        Users can make their own accounts with customizable data, 
                        such as a profile picture, User Name, Bio, Occupation, and Location.
                        All of these data fields can be updated at any time by the user, and the data is written to the blockchain. 
                        If a user has not made an account, their posts and comments will appear to have come from their wallet address, rather than their custom user name.
                        If a user has made an account, they may also see their own post and comment history. The user can then delete any existing posts or comments they have made, as well as their whole account if desired.
                        
                        <br /><br />

                        This application is a proof-of-concept for a decentralized social media platform. As such, Images are hosted using <a className="text-link" href={ipfs} target="_blank" rel="noreferrer">IPFS</a>, which is a distributed file hosting protocol.               
                        Once images are stored on IPFS, a hash value is returned to represent that image, which is then stored on the <a className="text-link" href={smartContract}> smart contract</a> for this project.                
                        
                        <br /><br />
                        This application requires the browser extension <a className="text-link" href="https://metamask.io/" target="_blank" rel="noreferrer">MetaMask</a> in
                        order to connect to the blockchain, retreive the images stored there, and allow the user to log in.
                        This is an Ethereum wallet and is the industry standard for interacting with decentralized applications at this time.
                        This application is connected
                        to the <a className="text-link" href={rinkeby} target="_blank" rel="noreferrer">Rinkeby Testnet</a>. As it is for learning, testing, and demonstration purposes only,
                        no true value is exchanged via the application.
                        You will need to switch the network in MetaMask to the Rinkeby Testnet.     
                        <br /><br />     
                        The front end application was developed in <a className="text-link" href={reactJS}> React JavaScript</a>, uses <a className="text-link" href={redux}>Redux</a> for state control, and 
                        is hosted and deployed via <a className="text-link" href={amplify} target="_blank" rel="noreferrer">AWS Amplify</a>.     
                        As always, the smart contract was developed in <a className="text-link" href={solidity}> Solidity</a> and was rigorously tested and deployed using <a className="text-link" href={ganache}> ganache</a> and <a className="text-link" href={truffle}> truffle</a>.
                        If you would like to receive some test ETH to interact with the DAPP, please use the <a className="text-link" href={rFaucet} target="_blank" rel="noreferrer">faucet</a>. 
                        The source code  form this application is available <a className="text-link" id="about-website" href={cryptogram_git}>here</a>.
                    </p>
                </div>
            </Pulse>


            <Pulse>
                <div className="links"  >
                    <h2>
                        <a className="text-link" href={portfolio} target="_blank" rel="noreferrer">About This Website</a>
                    </h2>
                    <p>
                        I built this personal website to exercise my web development skills and to demonstrate the projects I have made in my software development and IT career. Any and all future projects will be added here when possible.
                        This website was created using <a className="text-link" href={reactJS} target="_blank" rel="noreferrer">React JavaScript</a> and
                        includes elements that utilize the <a className="text-link" href={bootstrap} target="_blank" rel="noreferrer">Bootstrap Framework</a>.
                        This website was deployed using <a className="text-link" href={amplify} target="_blank" rel="noreferrer">AWS Amplify</a> and
                        allows for continuous changes and updates through my <a className="text-link" id="WittyWeather" href={github} target="_blank" rel="noreferrer">git repository</a>.
                        The domain is hosted on <a className="text-link" href={route53} target="_blank" rel="noreferrer">AWS Route 53</a>.
                    </p>

                </div>
            </Pulse>

            <Pulse>
                <div className="links">
                    <h2>
                        Witty Weather
                    </h2>
                    <p>
                        Witty Weather is an Android App that was developed by myself and a small team of students
                        at <a className="text-link" href={raddy} target="_blank" rel="noreferrer">Radford University</a> in a Software Engineering course.
                        This app has never been deployed to a public marketplace and there is no intention to do so as it was an exercise in learning to implement APIs into an Android App.
                        The git repository can be found <a className="text-link" href={ww} target="_blank" rel="noreferrer">here</a>.
                        To get the build working correctly, clone a copy of this respository to your desktop and save all build files to a single folder.
                        Open <a className="text-link" id="wildrydes" href={studio} target="_blank" rel="noreferrer">android studio</a> and click file &gt; open project and select the folder you put the build files in.
                    </p>
                

                </div>
            </Pulse>

            <Pulse>
                <div className="links">
                    <h2>
                        <a className="text-link" href={awsLink} target="_blank" rel="noreferrer">Wild Rydes</a>
                    </h2>
                    <p>
                        <a className="text-link" href={awsLink} target="_blank" rel="noreferrer">Wild Rydes</a> is an application where users can create an account, log in, and then summon unicorns to any point on a global map.
                        This app was developed with the aid of a <a className="text-link" href={awsTutorialLink} target="_blank" rel="noreferrer">tutorial</a> provided
                        by <a className="text-link" href={aws} target="_blank" rel="noreferrer">AWS</a> and was a great exercise for me to learn how to implement
                        a serverless back end
                        for <a className="text-link" href={cognito} target="_blank" rel="noreferrer">user access control</a>
                        , <a className="text-link" href={lambda} target="_blank" rel="noreferrer">serverless computation</a>
                        , <a className="text-link" href={StaticS3} target="_blank" rel="noreferrer">static website hosting</a>
                        , and <a className="text-link" id="powershell" href={dynamoDB} target="_blank" rel="noreferrer">database storage</a>, all powered by AWS.
                    </p>
                </div>
            </Pulse>


            <div className="links" >
                <Pulse>
                    <h2>Powershell Scripts</h2>
                    <p>These are PowerShell scripts I made and used in a previous position to automate changes to production Active Directory environments in a U.S. Government contracting role.</p>
                </Pulse>
                <div className="table-shrink">
                    <table className="table table-dark table-responsive">
                        <thead>
                            <Zoom>
                                <tr>
                                    <th scope="col">Project</th>
                                    <th scope="col">Description</th>
                                    <th scope="col">Link</th>
                                </tr>
                            </Zoom>
                        </thead>
                        <tbody>
                            <Zoom>
                                <tr>
                                    <td>Add2Group</td>
                                    <td>Adds Active Directory users to a group in bulk, needs text file of UPNs in the same directory</td>
                                    <td><a className="text-link" href={Add2Group} target="#_blank">Add2Group.ps1</a></td>
                                </tr>
                            </Zoom>

                            <Zoom>
                                <tr>
                                    <td>AddCarriageReturn</td>
                                    <td>Add carriage return after ';', useful for formatting text</td>
                                    <td><a className="text-link" href={AddCarriageReturn} target="#_blank">AddCarriageReturn.ps1</a></td>
                                </tr>
                            </Zoom>

                            <Zoom>
                                <tr>
                                    <td>ALTaccountMaker</td>
                                    <td>Used to quickly make alternate accounts in AD, with the naming format prefix.UPN, and copies X509 certificates from the original account</td>
                                    <td><a className="text-link" href={ALTaccountMaker} target="#_blank">ALTaccountMaker.ps1</a></td>
                                </tr>
                            </Zoom>

                            <Zoom>
                                <tr>
                                    <td>BulkDisable</td>
                                    <td>Used to disable AD accounts in bulk, needs text file of UPNs in the same directory</td>
                                    <td><a className="text-link" href={BulkDisable} target="#_blank">BulkDisable.ps1</a></td>
                                </tr>
                            </Zoom>

                            <Zoom>
                                <tr>
                                    <td>Get-BitlockerRecoveryKeys</td>
                                    <td>Generate a list of Bitlocker recovery keys and display them at the command prompt</td>
                                    <td><a className="text-link" href={GetBitlockerRecoveryKeys} target="#_blank">Get-BitlockerRecoveryKeys.ps1</a></td>
                                </tr>
                            </Zoom>

                            <Zoom>
                                <tr>
                                    <td>NotInGroup</td>
                                    <td>Takes a list of uers and determines if they are in a given group in AD</td>
                                    <td><a className="text-link" href={NotInGroup} target="#_blank">NotInGroup.ps1</a></td>
                                </tr>
                            </Zoom>

                            <Zoom>
                                <tr>
                                    <td>Parse3_Test</td>
                                    <td>This is intended to parse an input format of John Doe or Doe, John A. into a UPN such as JADoe, still a work in progress...</td>
                                    <td><a className="text-link" href={Parse3} target="#_blank">Parse3_Test.ps1</a></td>
                                </tr>
                            </Zoom>

                            <Zoom>
                                <tr>
                                    <td>ParseByEmail</td>
                                    <td>Parse by EMAIL with john.doe@domain.tld into UPN such as JADoe</td>
                                    <td><a className="text-link" href={ParseByEmail} target="#_blank">ParseByEmail.ps1</a></td>
                                </tr>
                            </Zoom>

                            <Zoom>
                                <tr>
                                    <td>ParseNames</td>
                                    <td>This is intended to parse an input format of John Doe or Doe, John A. into a UPN such as JADoe</td>
                                    <td><a className="text-link" href={ParseNames} target="#_blank">ParseNames.ps1</a></td>
                                </tr>
                            </Zoom>

                        </tbody>
                    </table>
                </div>
                <Pulse><p>Below are some fun scripts I wrote for myself to in order to learn to use API data and text to speech in PowerShell.</p></Pulse>
                <div className="table-shrink">
                    <table className="table table-dark table-responsive">
                        <thead>
                            <Zoom>
                                <tr>
                                    <th scope="col">Project</th>
                                    <th scope="col">Description</th>
                                    <th scope="col">Link</th>
                                </tr>
                            </Zoom>

                        </thead>
                        <Zoom>
                            <tbody>
                                <tr>
                                    <td>btcChecker</td>
                                    <td>Prompts user for how long to run checks for, then checks BTC every 15 mins at <a className="text-link" href="https://blockchain.info/ticker">API</a></td>
                                    <td><a className="text-link" href={btcChecker} target="#_blank">btcChecker.ps1</a></td>
                                </tr>
                                <tr>
                                    <td>text2speech</td>
                                    <td>A simple script I wrote to learn how to use text to speech and get API data</td>
                                    <td><a className="text-link" id="java" href={text2speech} target="#_blank">text2speech.ps1</a></td>
                                </tr>
                            </tbody>
                        </Zoom>
                    </table>
                </div>
            </div>


            <div className="links">
                <Pulse>
                    <h2>Java Projects</h2>
                    <p>These are some small projects I wrote in Java while at University studying computer science.</p>
                </Pulse>

                <div className="table-shrink">
                    <table className="table table-dark table-responsive">
                        <Zoom>
                            <thead>
                                <tr>
                                    <th scope="col">Project</th>
                                    <th scope="col">Description</th>
                                    <th scope="col">Link</th>
                                </tr>
                            </thead>
                        </Zoom>

                        <tbody>
                            <Zoom>
                                <tr>
                                    <td>FileReader</td>
                                    <td>Reads and parses a file, and returns info about the file</td>
                                    <td><a className="text-link" href={FileReader} target="#_blank">FileReader.zip</a></td>
                                </tr>
                            </Zoom>

                            <Zoom>
                                <tr>
                                    <td>InfectionSim</td>
                                    <td>Visually simulates the exponential spread of infection in a petri dish; prints data about sim to console</td>
                                    <td><a className="text-link" href={InfectionSim} target="#_blank">InfectionSim.zip</a></td>
                                </tr>
                            </Zoom>

                            <Zoom>
                                <tr>
                                    <td>ListTraverse</td>
                                    <td>Allows the user to enter data, then retrieve in various ways, built as an exercise to traverse linked lists</td>
                                    <td><a className="text-link" href={ListTraverse} target="#_blank">ListTraverse.zip</a></td>
                                </tr>
                            </Zoom>

                            <Zoom>
                                <tr>
                                    <td>isPalindrome</td>
                                    <td>Checks if a given string is a palendrome</td>
                                    <td><a className="text-link" href={Palindrome} target="#_blank">Palindrome.zip</a></td>
                                </tr>
                            </Zoom>

                            <Zoom>
                                <tr>
                                    <td>Game</td>
                                    <td>A simple game developed in Java, plays similarly to the infamous "Flappy Bird", but is a bit less pretty and more difficult...<br />Compile Game.java last!</td>
                                    <td><a className="text-link" href={Game} target="#_blank">Game.zip</a></td>
                                </tr>
                            </Zoom>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    )
}

export default Projects
