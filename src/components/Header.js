import React from "react";
import Typed from 'react-typed'

const Header = () => {
    return (
        <div className="component-wraper" id="header">
            <div className="main-info">
                <h1>Welcome to my Website!</h1>
                <p>This website is still under construction and is a work in progress....</p>
                <Typed 
                    className="typed-text"
                    strings={["Blockchain", "Ethereum", "Solidity", "Web3", "React", "Truffle", "Ganache"]}
                    typeSpeed={80}
                    backSpeed={100}
                    loop                
                />

                <a href="#about" className="contact"> Contact Me</a>
            </div>            
        </div>
    )
}

export default Header
