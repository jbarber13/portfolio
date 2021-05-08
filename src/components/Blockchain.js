import React from "react";
import blockchain from "../images/blockchain.png"
import cryptography from "../images/cryptography.jpg"
import bitcoin from "../images/Bitcoin.png"
import ethereum from "../images/ethereum.png"
import aave from "../images/dapp_logos/aave.png"
import comp from "../images/dapp_logos/comp.png"
import maker from "../images/dapp_logos/maker.png"
import uniswap from "../images/dapp_logos/uniswap.png"
import synthetix from "../images/dapp_logos/synthetix.png"
import Pulse from "react-reveal/Pulse";

const stateMachine = "https://en.wikipedia.org/wiki/Finite-state_machine"
const whitePaper = "https://bitcoin.org/bitcoin.pdf"
const evm = "https://ethereum.org/en/developers/docs/evm/"
const machineCode = "https://en.wikipedia.org/wiki/Machine_code"
const smartContract = "https://en.wikipedia.org/wiki/Smart_contract"
const github = "https://github.com/jbarber13"
const peer = "https://en.wikipedia.org/wiki/Peer-to-peer"
const pow = "https://en.wikipedia.org/wiki/Proof_of_work#:~:text=Proof%20of%20work%20(PoW)%20is,minimal%20effort%20on%20their%20part."
const double = "https://en.wikipedia.org/wiki/Double-spending#:~:text=Double%2Dspending%20is%20a%20potential,be%20spent%20more%20than%20once.&text=As%20with%20counterfeit%20money%2C%20such,that%20did%20not%20previously%20exist."
const sat = "https://en.wikipedia.org/wiki/Satoshi_Nakamoto#:~:text=Satoshi%20Nakamoto%20is%20the%20name,devised%20the%20first%20blockchain%20database."



const Blockchain = () => {
    return (
        <div className="blockchain" id="blockchain" >
            <br /><br /><br /><br /><br /><br />
            <h2>Blockchain</h2><br />
            <div className="blockchain-words">

                <Pulse>
                    <div className="blockchain-words-paragraph-right">
                        <a className="bimage" href="https://en.wikipedia.org/wiki/Blockchain" target="#_blank">
                            <img className="bimage" src={blockchain} alt="blockchain"></img>
                        </a>
                        <p><br />
                        It is my firm belief that the next major movement in technological innovation will be that of blockchain technology. In much the same way as the internet changed how people lived their lives in the 1990s, blockchain technology will change the way information and transactions are secured in the near future, and can allow people, organizations, and nations to transact on an equal playing field. 
                        </p>
                    </div>
                    <br />
                </Pulse>

                <Pulse delay={400}>
                    <div className="blockchain-words-paragraph-left">
                        <a className="bimage" href="https://en.wikipedia.org/wiki/Cryptography" target="#_blank">
                            <img className="bimage" src={cryptography} alt="blockchain"></img>
                        </a>
                        <p><br />
                        Blockchain uses cryptography to secure data stored on a public network. Cryptography is a method of protecting information and communication such that only those intended can view the information. This is achieved via mathematical cryptographic functions, sometimes known as “one way functions”, as it is simple to encrypt data, but mathematically infeasible to decrypt without the correct key. 
                        </p>
                    </div>
                    <br />
                </Pulse>


                <Pulse delay={400}>
                    <div className="blockchain-words-paragraph-right">
                        <a className="bimage" href="https://bitcoin.org/en/" target="#_blank">
                            <img className="bimage" src={bitcoin} alt="blockchain"></img>
                        </a>
                        <p><br />
                        Using this cryptographic technology, a method for storing and transferring value <a className="text-link" href={peer} target="_blank" rel="noreferrer">peer-to-peer</a> was devised by the anonymous <a className="text-link" href={sat} target="_blank" rel="noreferrer">Satoshi Nakamoto</a> when they solved the <a className="text-link" href={double} target="_blank" rel="noreferrer">double-spend</a> problem, thus creating the first public blockchain, known as Bitcoin. Previously, when attempting to create a peer-to-peer electronic cash, a third party (such as a bank) was required to prevent double-spending. Bitcoin solves this problem using a distributed and decentralized network of individual computers that are incentivised to help secure the network and to prevent any double-spending or any other invalid behavior by any network participants. The computers in the network add transactions to the chain using a cryptographic <a className="text-link" href={pow} target="_blank" rel="noreferrer">proof-of-work</a> function, forming a record that cannot be changed without redoing the proof-of-work. As long as more than half of the participants are acting honestly, they will outpace attackers and secure the network. I would encourage anyone to read the <a className="text-link" href={whitePaper} target="_blank" rel="noreferrer">Bitcoin white paper</a> for more information on how this works in detail.
                        </p>
                    </div>

                </Pulse>

                <br /><br />


                <Pulse delay={400}>
                    <div className="blockchain-words-paragraph-left">


                        <p>
                        Ethereum is an additional and entirely separate blockchain network from Bitcoin, but operates in an entirely different way. Ethereum allows for a decentralized peer-to-peer exchange of value (using its native token "Ether") in a similar way to Bitcoin (using proof-of-work), however Ethereum also has the ability to act as a decentralized <a className="text-link" href={stateMachine} target="_blank" rel="noreferrer">state machine</a>. This is known as the Ethereum Virtual Machine (<a className="text-link" href={evm} target="_blank" rel="noreferrer">EVM</a>). In this way, the state of the Ethereum network not only includes accounts and balances (like Bitcoin), but also includes a machine state which can execute <a className="text-link" href={machineCode} target="_blank" rel="noreferrer">machine code</a>. This code can be made into complicated software allowing for a complex exchange of value to occur. This software is known as a <a className="text-link" href={smartContract} target="_blank" rel="noreferrer">Smart Contract</a>.
                        </p>
                        <a className="bimage" href="https://ethereum.org/en/" target="#_blank">
                            <img className="bimage" src={ethereum} alt="blockchain"></img>
                        </a>
                        <p>
                        An Ethereum smart contract is a computer program that runs on the Ethereum network. It allows automated complex exchanges of value between untrusted parties without the need for trusted intermediators and without the costs of enforcement, fraud, or human error. Vending machines are often used as an example of an existing technology that implements the concept of a smart contract. When using a vending machine, there are no human intermediary parties involved in the sale and the user can feel safe about inputting their funds into the machine knowing they will pay only the expected amount for the product of their choosing and will receive change if extra funds are present. At the bottom of this section, I have added the logos for some of the industry leading decentralized applications on the Ethereum blockchain and each image is a link to their respective website which goes into detail about how each one works.
                        </p>
                        <p>
                        At this time, the Ethereum blockchain is the industry leading solution for a secure, scalable, and decentralized blockchain network that supports smart contract development. Additionally, any competing networks that support smart contracts must sacrifice one of those three aspects in order to compete with Ethereum. For that reason, Ethereum has the first mover advantage for the smart contract market and is likely to remain the industry leading smart contract platform for the foreseeable future. 
                        </p>
                    </div>
                    <br /><br />
                </Pulse>



                <Pulse delay={400}>
                    <div>
                        <p className="blockchain-words-paragraph">
                        In order to take it upon myself to understand fully how to implement smart contracts on a public blockchain like Ethereum, I have been working on a number of various decentralized applications, each with their own specific technology that I have aimed to learn more about in practice. Please see below in the “Projects” section to read specific details about each project, and feel free to visit my public <a className="text-link" href={github} target="_blank" rel="noreferrer">GitHub</a> as I am constantly adding more projects.
                    </p>
                        <div className="row">
                            <div className="column">
                                <a href="https://aave.com/" target="#_blank">
                                    <img className="dappImage" src={aave} alt="aave"></img>
                                </a>
                            </div>
                            <div className="column">
                                <a href="https://compound.finance/" target="#_blank">
                                    <img className="dappImage" src={comp} alt="comp"></img>
                                </a>
                            </div>
                            <div className="column">
                                <a href="https://makerdao.com/en/" target="#_blank">
                                    <img className="dappImage" src={maker} alt="maker"></img>
                                </a>
                            </div>
                            <div className="column">
                                <a href="https://uniswap.org/" target="#_blank">
                                    <img className="dappImage" src={uniswap} alt="uni"></img>
                                </a>
                            </div>
                            <div className="column">
                                <a href="https://synthetix.io/" target="#_blank">
                                    <img className="dappImage" src={synthetix} alt="synx"></img>
                                </a>
                            </div>
                        </div>
                    </div>
                </Pulse>

            </div>
        </div>
    )
}

export default Blockchain
