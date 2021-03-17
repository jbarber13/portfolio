import React from "react";
import blockchain from "../images/blockchain.png"
import cryptography from "../images/cryptography.jpg"
import decentralized from "../images/decentralized.jpg"
import ethereum from "../images/ethereum.png"
import aave from "../images/dapp_logos/aave.png"
import comp from "../images/dapp_logos/comp.png"
import maker from "../images/dapp_logos/maker.png"
import uniswap from "../images/dapp_logos/uniswap.png"
import synthetix from "../images/dapp_logos/synthetix.png"


import Pulse from 'react-reveal/Pulse';


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
                        It is my firm belief that the next major movement in technological innovation will be that of blockchain technological development. In much the same way as the internet changed how people live their lives in the 1990s, blockchain technology will change the way information and transactions are secured in the near future, and can allow people, organizations, and even nations to transact on an equal playing field.
                    </p>
                </div>
                <br /><br />                
                </Pulse> 
                
                <Pulse delay={400}>
                <div className="blockchain-words-paragraph-left">
                    <a className="bimage" href="https://en.wikipedia.org/wiki/Cryptography" target="#_blank">
                        <img className="bimage" src={cryptography} alt="blockchain"></img>
                    </a>
                    <p><br />
                        Blockchain uses cryptography to add additional security to data stored on a network, or “on-chain”. Cryptography is a method of protecting information and communication such that only those intended can view the information. This is achieved via mathematical cryptographic functions, sometimes known as “one way functions”, as it is simple to encrypt data, but extremely difficult or even mathematically impossible to decrypt without the correct key.
                    </p>
                </div>
                <br /><br />
                </Pulse>
                

                <Pulse delay={400}>
                <div className="blockchain-words-paragraph-right">
                    <a className="bimage" href="https://en.wikipedia.org/wiki/Decentralization" target="#_blank">
                        <img className="bimage" src={decentralized} alt="blockchain"></img>
                    </a>
                    <p><br />
                        Using cryptography, a blockchain network can exist publicly, such that all the information and transactions are publicly visible, but no individual entity is able to alter the data, making it immutable and permanent. This lends itself to the idea of decentralization.
                    </p>
                </div>
                <br /><br /><br />
                </Pulse>        



                <Pulse delay={400}>
                <div className="blockchain-words-paragraph-left">
                    
                    <a className="bimage" href="https://ethereum.org/en/" target="#_blank">
                        <img className="bimage" src={ethereum} alt="blockchain"></img>
                    </a>
                    <p><br /><br />
                        The leading public blockchain in terms of value secured on-chain and daily transaction value is the Ethereum network. At this time, Ethereum is also by far the industry standard for a decentralized public blockchain that supports smart contracts.
                    </p>
                    <p>
                        Simply put, an Ethereum smart contract is a computer program that runs on the Ethereum network that allows automated complex exchanges of value between untrusted parties without the need for trusted intermediators and without the costs of enforcement, fraud, or human error. Vending machines are often used as an example of an existing technology that implements the concept of a smart contract.
                    </p>
                </div>
                <br /><br /><br />
                </Pulse>
                


                <Pulse delay={400}>
                <div>
                    <p className="blockchain-words-paragraph">
                        In order to take it upon myself to understand fully how to implement smart contracts on a public blockchain like Ethereum, I have developed and built a decentralized exchange. This program allows the fair exchange of value between untrusted parties wishing to exchange ether for a token of my own design: BarberBucks. The software includes a blockchain back end written in the Solidity programming language and a front end web application written in React JavaScript that uses Redux for state control. It is deployed via AWS Amplify. In the “Projects” section of this website, there is more information on how to interact with the application.
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
