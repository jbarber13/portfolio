import React from "react";
import Typed from 'react-typed'

const Header = () => {
    return (
        <div className="component-wraper" id="header">
            <div className="main-info">
                <br /><br /><br /><br /><br /><br /><br /><br />
                <h1>Welcome to my Personal Website!</h1>
                <p>This website was built by me from scratch using React JavaScript, and will always be a work in progress...</p>
                <p>It may or may not scale to mobile device screen sizes at this time....</p>
                <Typed 
                    className="typed-text"
                    strings={["Blockchain", "Ethereum", "Solidity", "Web3", "React", "Redux", "Truffle", "Ganache"]}
                    typeSpeed={80}
                    backSpeed={100}
                    loop                
                />

                <a href="#contact-info" className="contact"> Contact Me</a>
            </div>            
        </div>
    )
}

export default Header
