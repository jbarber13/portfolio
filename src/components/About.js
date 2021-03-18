import React from "react";
import Zoom from 'react-reveal/Zoom';
const About = () => {
    return (
        <div className="about" id="about" >
            <br /><br /><br />

            
            <Zoom delay={400}>
            <div className="about-words">              
                <h2>About Me</h2>
            </div>
            <div className="about-words">              
                <p className="about-info" >
                    My name is <a className="text-link" href="https://linkedin.com/in/jakebarber1996" target="_blank" rel="noreferrer">Jake Barber</a> and I am an aspiring software developer, hoping to specialize in blockchain development on Ethereum.
                </p>
            </div>
            <div className="about-words">              
                <p className="about-info">
                    I have a Bachelors degree in Computer Science and Technology, with a concentration in Database Design, as well as an Undergraduate Information Security Certificate recognized by the NSA.  
                </p>
            </div>
            </Zoom>            

            

            <Zoom delay={400}>
            <div className="links">
                <div>
                    <h1 className="about-header">Contact Information</h1>
                    
                        <p>Jake Barber</p>
                        <p>Mobile: (703) 635-8884</p>
                        <p>jabot999@gmail.com</p>
                        <p><a className="text-link" href="https://www.jake-barber.com/" target="_blank" rel="noreferrer">Personal Website</a></p>                    
                    
                    <div className="resumeButton">
                    <a href="https://drive.google.com/file/d/1XqDIdbJ-AOnlPS5ROrAxYglURUrxmAvU/view?usp=sharing" target="_blank" rel="noreferrer" className="contact">RÉsumÉ</a>
                    </div>
                </div>       
            </div>
            </Zoom>
            

            
        </div>
        
    )
}

export default About
