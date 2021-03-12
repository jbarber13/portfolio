import React from "react";

const Projects = () => {
    return (
        <div className="projects" id="projects" >
            <br /><br /><br /><br /><br /><br />
            
            <h2>Projects</h2>
            <br />

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

export default Projects
