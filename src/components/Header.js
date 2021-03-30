import React from "react";
import Typed from 'react-typed'

const Header = () => {
    return (
        <div className="component-wraper" id="header">
            <div className="main-info">
                <br /><br /><br /><br /><br /><br /><br /><br />
                <h1>Blockchain is the future!</h1>
                <br />
                <p>My name is Jake Barber, and I am an expierenced Software Developer and IT Proffesional, specializing in blockchain technology.</p>
                <p>Scroll down to learn more!</p>
                <div className="typed">
                <Typed 
                    className="typed-text"
                    strings={["Blockchain", "Ethereum", "Solidity", "Web3", "React", "Redux", "Truffle", "Ganache"]}
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
