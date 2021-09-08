import React from "react";
import Typed from 'react-typed'

const Header = () => {
    return (
        <div className="component-wraper" id="header">
            <div className="main-info">
                <br /><br /><br /><br /><br /><br /><br /><br />
                <h1>
                    <Typed
                        className="typed-text"
                        strings={["Blockchain Technology is the future!"]}
                        typeSpeed={100}                        
                    />
                </h1>
                <br />
                
                
                <p>Scroll down to learn more about me!</p>
                <div className="typed">
                    <Typed
                        className="typed-text"
                        strings={["Blockchain", "Ethereum", "Solidity", "Web3", "Ethers.js", "Hardhat", "React", "Redux", "Truffle", "Ganache"]}
                        typeSpeed={80}
                        backSpeed={100}
                        loop
                        shuffle
                    />
                </div>
                <a href="#contact-info" className="contact"> Contact Me</a>
            </div>
        </div>
    )
}

export default Header
