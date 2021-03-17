import React, {forwardRef, useRef} from "react";
import logo from "../images/logo.jpg"
import { animateScroll as scroll} from 'react-scroll'

// /<a  className="nav-link" onClick={() => scroll.scrollTo(0)}>Home</a >





const Navbar = () => {
    
    
    return (
        <nav className="navbar navbar-expand-lg navbar-dark bg-dark sticky-nav">
            <div className="container">
                <a className="navbar-brand" href="https://linkedin.com/in/jakebarber1996" target="_blank" rel="noreferrer"><img className="logo" src={logo} alt="logo" /></a>

                <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>

                <div className="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul className="navbar-nav ml-auto">
                        <li className="nav-item active">
                            <a  className="nav-link" onClick={() => scroll.scrollTo(0)}>Home</a >
                        </li>
                        <li className="nav-item">
                            <a className="nav-link" onClick={() => scroll.scrollTo(950)}>About Me</a>
                        </li>    
                        <li className="nav-item">
                            <a className="nav-link" onClick={() => scroll.scrollTo(1800)}>Blockchain</a>
                        </li>   
                        <li className="nav-item">
                            <a className="nav-link" onClick={() => scroll.scrollTo(3775)}>Projects</a>
                        </li>          
                    </ul>                
                </div>               
            </div>
        </nav>

        
    )
}

export default Navbar
