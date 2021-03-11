import React from "react";
import Typed from 'react-typed'

const Header = () => {
    return (
        <div className="component-wraper">
            <div className="main-info">
                <h1>Welcome to my Website!</h1>
                <p>This website is still under construction....</p>
                <Typed 
                    className="typed-text"
                    strings={["Blockchain", "Ethereum", "Solidity", "Web3", "React"]}
                    typeSpeed={80}
                    backSpeed={100}
                    loop                
                />

                <a href="https://www.linkedin.com/in/jakebarber1996/" target="_blank" className="contact"> Contact Me</a>
            </div>            
        </div>
    )
}

export default Header
