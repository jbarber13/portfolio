import React from "react";

//POWERSHELL
import Add2Group from "../projects/powershell/AD_Scripts/Add2Group.ps1"
import AddCarriageReturn from "../projects/powershell/AD_Scripts/AddCarriageReturn.ps1"
import ALTaccountMaker from "../projects/powershell/AD_Scripts/ALTaccountMaker.ps1"
import BulkDisable from "../projects/powershell/AD_Scripts/BulkDisable.ps1"
import GetBitlockerRecoveryKeys from "../projects/powershell/AD_Scripts/Get-BitlockerRecoveryKeys.ps1"
import NotInGroup from "../projects/powershell/AD_Scripts/NotInGroup.ps1"
import Parse3 from "../projects/powershell/AD_Scripts/Parse3_Test.ps1"
import ParseByEmail from "../projects/powershell/AD_Scripts/ParseByEmail.ps1"
import ParseNames from "../projects/powershell/AD_Scripts/ParseNames.ps1"
import btcChecker from "../projects/powershell/FunProjects/btcChecker.ps1"
import text2speech from "../projects/powershell/FunProjects/text2speech.ps1"

//JAVA ZIPs
import FileReader from "../projects/Java/Zips/FileReader.zip"
import InfectionSim from "../projects/Java/Zips/InfectionSim.zip"
import ListTraverse from "../projects/Java/Zips/ListTraverse.zip"
import Palindrome from "../projects/Java/Zips/Palindrome.zip"

import Zoom from 'react-reveal/Zoom';


const amplify = "https://aws.amazon.com/amplify/"
const BarberBucksDex = "https://barberbucks-dex.jake-barber.com/"
const awsLink = "https://jake-barber-aws-serverless.s3.amazonaws.com/website/index.html"
const awsTutorialLink = "https://aws.amazon.com/getting-started/hands-on/build-serverless-web-app-lambda-apigateway-s3-dynamodb-cognito/"
const cognito = "https://aws.amazon.com/cognito/"
const lambda = "https://aws.amazon.com/lambda/"
const dynamoDB = "https://aws.amazon.com/dynamodb/"
const StaticS3 = "https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html"
const aws = "https://en.wikipedia.org/wiki/Amazon_Web_Services"

const Projects = () => {
    return (
        <div className="projects" id="projects" >
            <br /><br /><br /><br /><br /><br />

            <h2>Projects</h2>
            <br />

            <Zoom>
                <div className="links">
                    <h2>
                        <a className="text-link" href={BarberBucksDex} target="_blank" rel="noreferrer">BarberBucks DEX</a>
                    </h2>
                    <p><a className="text-link" href={BarberBucksDex} target="_blank" rel="noreferrer">BarberBucks DEX</a> is a decentralized application that is connected
                 to the Kovan test network that allows users to trade test ETH for BarberBucks.
                </p>
                    <p>No true value is exchanged via the app, it is for testing and demonstration purposes only.</p>
                    <p>This application is hosted and deployed via <a className="text-link" href={amplify} target="_blank" rel="noreferrer">AWS Amplify</a></p>
                    <p>
                        This <a className="text-link" href="https://en.wikipedia.org/wiki/Decentralized_application" target="_blank" rel="noreferrer">DAPP</a> is
                    a <a className="text-link" href="https://en.wikipedia.org/wiki/Decentralized_exchange"> DEX</a> and
                    requires a browser extension: <a className="text-link" href="https://metamask.io/" target="_blank" rel="noreferrer">MetaMask</a>
                    , this is an Ethereum wallet.
                </p>
                    <p>You will need to switch the network in MetaMask to the Kovan test network.</p>
                    <p>If you would like to receive some test ETH to interact with the app, please use the <a className="text-link" href="https://gitter.im/kovan-testnet/faucet" target="_blank" rel="noreferrer">faucet.</a></p>
                    <p>This will require a <a className="text-link" href="https://github.com/">GitHub</a> account, simply log in and paste your wallet address from metamask (Kovan test network) in the chat and you will be sent some test ETH.</p>
                    
                </div>
            </Zoom>
            <Zoom>
                <div className="links">
                    <h2>
                        <a className="text-link" href={awsLink} target="_blank" rel="noreferrer">Wild Rydes</a>
                    </h2>
                    <p><a className="text-link" href={awsLink} target="_blank" rel="noreferrer">Wild Rydes</a> is an application where users can create an account, log in, and then summon unicorns to any point on a global map
                    </p>                    
                    <p>This app was developed with the aid of a <a className="text-link" href={awsTutorialLink} target="_blank" rel="noreferrer">tutorial</a> provided
                    by <a className="text-link" href={aws} target="_blank" rel="noreferrer">AWS</a> and was a great exercise for me to learn to use
                    a serverless back end 
                    for <a className="text-link" href={cognito} target="_blank" rel="noreferrer">user access control</a>
                    , <a className="text-link" href={lambda} target="_blank" rel="noreferrer">serverless computation</a>
                    , <a className="text-link" href={StaticS3} target="_blank" rel="noreferrer">static website hosting</a>
                    , and <a className="text-link" href={dynamoDB} target="_blank" rel="noreferrer">database storage</a>, all powered by AWS.
                    </p>
                </div>
            </Zoom>


            <div className="links">
                <h2>Powershell Scripts</h2>
                <p>These are PowerShell scripts I made and used in a previous position to automate changes to production Active Directory environments in a U.S. Government contracting role</p>
                <table class="table table-dark">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Project</th>
                            <th scope="col">Description</th>
                            <th scope="col">Link</th>
                        </tr>
                    </thead>
                    <tbody>
                        <Zoom>
                            <tr>
                                <th scope="row">1</th>
                                <td>Add2Group</td>
                                <td>Adds Active Directory users to a group in bulk, needs text file of UPNs in the same directory</td>
                                <td><a className="text-link" href={Add2Group} target="#_blank">Add2Group.ps1</a></td>
                            </tr>
                        </Zoom>

                        <Zoom>
                            <tr>
                                <th scope="row">2</th>
                                <td>AddCarriageReturn</td>
                                <td>Add carriage return after ';', usefull for formatting text</td>
                                <td><a className="text-link" href={AddCarriageReturn} target="#_blank">AddCarriageReturn.ps1</a></td>
                            </tr>
                        </Zoom>

                        <Zoom>
                            <tr>
                                <th scope="row">3</th>
                                <td>ALTaccountMaker</td>
                                <td>Used to quickly make alternate accounts in AD, with the naming format prefix.UPN, and copies X509 certificates from the original account</td>
                                <td><a className="text-link" href={ALTaccountMaker} target="#_blank">ALTaccountMaker.ps1</a></td>
                            </tr>
                        </Zoom>

                        <Zoom>
                            <tr>
                                <th scope="row">4</th>
                                <td>BulkDisable</td>
                                <td>Used to disable AD accounts in bulk, needs text file of UPNs in the same directory</td>
                                <td><a className="text-link" href={BulkDisable} target="#_blank">BulkDisable.ps1</a></td>
                            </tr>
                        </Zoom>

                        <Zoom>
                            <tr>
                                <th scope="row">5</th>
                                <td>Get-BitlockerRecoveryKeys</td>
                                <td>Generate a list of Bitlocker recovery keys and display them at the command prompt</td>
                                <td><a className="text-link" href={GetBitlockerRecoveryKeys} target="#_blank">Get-BitlockerRecoveryKeys.ps1</a></td>
                            </tr>
                        </Zoom>

                        <Zoom>
                            <tr>
                                <th scope="row">6</th>
                                <td>NotInGroup</td>
                                <td>Takes a list of uers and determines if they are in a given group in AD</td>
                                <td><a className="text-link" href={NotInGroup} target="#_blank">NotInGroup.ps1</a></td>
                            </tr>
                        </Zoom>

                        <Zoom>
                            <tr>
                                <th scope="row">7</th>
                                <td>Parse3_Test</td>
                                <td>This is intended to parse an input format of John Doe or Doe, John A. into a UPN such as JADoe, still a work in progress...</td>
                                <td><a className="text-link" href={Parse3} target="#_blank">Parse3_Test.ps1</a></td>
                            </tr>
                        </Zoom>

                        <Zoom>
                            <tr>
                                <th scope="row">8</th>
                                <td>ParseByEmail</td>
                                <td>Parse by EMAIL with john.doe@org.domain into UPN such as JADoe</td>
                                <td><a className="text-link" href={ParseByEmail} target="#_blank">ParseByEmail.ps1</a></td>
                            </tr>
                        </Zoom>

                        <Zoom>
                            <tr>
                                <th scope="row">9</th>
                                <td>ParseNames</td>
                                <td>This is intended to parse an input format of John Doe or Doe, John A. into a UPN such as JADoe</td>
                                <td><a className="text-link" href={ParseNames} target="#_blank">ParseNames.ps1</a></td>
                            </tr>
                        </Zoom>

                    </tbody>
                </table>
                <p>Below are some fun scripts I wrote for myself to in order to learn to use API data and text to speech in PowerShell</p>
                <table class="table table-dark">
                    <thead>
                        <Zoom>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Project</th>
                                <th scope="col">Description</th>
                                <th scope="col">Link</th>
                            </tr>
                        </Zoom>

                    </thead>
                    <Zoom>
                        <tbody>
                            <tr>
                                <th scope="row">1</th>
                                <td>btcChecker</td>
                                <td>Prompts user for how long to run checks for, then checks BTC every 15 mins at <a className="text-link" href="https://blockchain.info/ticker">API</a></td>
                                <td><a className="text-link" href={btcChecker} target="#_blank">btcChecker.ps1</a></td>
                            </tr>
                            <tr>
                                <th scope="row">2</th>
                                <td>text2speech</td>
                                <td>A simple script I wrote to learn how to use text to speech and get API data</td>
                                <td><a className="text-link" href={text2speech} target="#_blank">text2speech.ps1</a></td>
                            </tr>
                        </tbody>
                    </Zoom>
                </table>
            </div>


            <div className="links">
                <h2>Java Projects</h2>
                <p>These are some small projects I wrote in Java while at University studying computer science</p>

                <table class="table table-dark">
                    <Zoom>
                        <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Project</th>
                                <th scope="col">Description</th>
                                <th scope="col">Link</th>
                            </tr>
                        </thead>
                    </Zoom>

                    <tbody>
                        <Zoom>
                            <tr>
                                <th scope="row">1</th>
                                <td>FileReader</td>
                                <td>Reads and parses a file, and returns info about the file</td>
                                <td><a className="text-link" href={FileReader} target="#_blank">FileReader.zip</a></td>
                            </tr>
                        </Zoom>

                        <Zoom>
                            <tr>
                                <th scope="row">2</th>
                                <td>InfectionSim</td>
                                <td>Visually simulates the exponential spread of infection in a petri dish; prints data about sim to console</td>
                                <td><a className="text-link" href={InfectionSim} target="#_blank">InfectionSim.zip</a></td>
                            </tr>
                        </Zoom>

                        <Zoom>
                            <tr>
                                <th scope="row">3</th>
                                <td>ListTraverse</td>
                                <td>Allows the user to enter data, then retrieve in various ways, built as an exercise to traverse linked lists.</td>
                                <td><a className="text-link" href={ListTraverse} target="#_blank">ListTraverse.zip</a></td>
                            </tr>
                        </Zoom>

                        <Zoom>
                            <tr>
                                <th scope="row">4</th>
                                <td>isPalindrome</td>
                                <td>Checks if a given string is a palendrome</td>
                                <td><a className="text-link" href={Palindrome} target="#_blank">Palindrome.zip</a></td>
                            </tr>
                        </Zoom>

                    </tbody>
                </table>

            </div>
        </div>
    )
}

export default Projects
