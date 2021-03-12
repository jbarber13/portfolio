import React from "react";

const Blockchain = () => {
    return (
        <div className="portfolio" id="portfolio" >
            <br /><br /><br /><br /><br /><br />
            <h2>Blockchain</h2><br />
            <div className="blockchain-words"> 
                <p className="blockchain-words-paragraph">
                It is my firm belief that the next major movement in technological innovation will be that of blockchain technological development. In much the way the internet changed the way people live their lives in the 1990s, blockchain technology will change the way information and transactions are secured in the near future, and can allow people, organizations and even nations to transact on an equal playing field. 
                </p>
                <p className="blockchain-words-paragraph">
                Blockchain uses cryptography to add additional security to data stored on the network, or ‘on-chain’. Cryptography is a method of protecting information and communication such that only those intended can view the information. This is achieved via mathematical cryptographic functions, sometimes known as ‘one way functions’, as it is simple to encrypt data, but extremely difficult or even mathematically impossible to decrypt without the key. 
                </p>
                <p className="blockchain-words-paragraph">
                Using cryptography, a blockchain network can exist publicly, such that all the information and transactions are public, but no individual entity is able to alter the data, making it immutable and permanent. This lends itself to the idea of decentralization. 
                </p>
                <p className="blockchain-words-paragraph">
                The leading public blockchain in terms of value secured on chain, daily transaction value is the Ethereum network. At this time, Ethereum is also by far the industry standard for a decentralized public blockchain that supports smart contracts. 
                </p>
                <p className="blockchain-words-paragraph">
                An Ethereum smart contract simply put is a computer program that runs Ethereum network, that allows automated complex exchanges of value between untrusted parties without the need for trusted intermediators and without the costs of enforcement, fraud or human error. Vending machines are often used as an example of existing technology that implements the concept of a smart contract. 
                </p>
                <p className="blockchain-words-paragraph">
                In order to take it upon myself to understand fully how to implement smart contracts on a public blockchain like Ethereum, I have developed and built a decentralized exchange. This program allows the fair exchange of value between untrusted parties wishing to exchange ether for a token of my own design: BarberBucks. The software includes a blockchain back end written in solidity, and a front end web application written in React JavaScript, using Redux for state control. It is deployed via AWS Amplify. More information below on how to interact with the application.  
                </p>       
            </div>

            <div className="links">
                <h2>
                    <a className="text-link" href="https://barberbucks-dex.jake-barber.com/" target="_blank">BarberBucks DEX</a>
                </h2>
                <p><a className="text-link" href="https://barberbucks-dex.jake-barber.com/" target="_blank">BarberBucks DEX</a> is a decentralized application deployed
                 to the Kovan test network where you can trade test ETH for BarberBucks.
                </p>
                <p>No true value is exchanged via the app, it is for testing and demonstration purposes only.</p> 
                <p>
                    This <a className="text-link" href="https://en.wikipedia.org/wiki/Decentralized_application" target="_blank">DAPP</a> is
                    a <a className="text-link" href="https://en.wikipedia.org/wiki/Decentralized_exchange"> DEX</a> and
                    requires a browser extension: <a className="text-link" href="https://metamask.io/" target="_blank">MetaMask</a>
                    , this is an Ethereum wallet.
                </p>
                <p>You will need to switch the network in MetaMask to the Kovan test network.</p>
                <p>If you would like to receive some test ETH to interact with the app, please use the <a className="text-link" href="https://gitter.im/kovan-testnet/faucet" target="_blank">faucet.</a></p>
                <p>This will require a <a className="text-link" href="https://github.com/">GitHub</a> account, simply log in and paste your wallet address from metamask (Kovan test network) in the chat and you will be sent some test ETH.</p>
            </div> 

                      
        </div>
    )
}

export default Blockchain
