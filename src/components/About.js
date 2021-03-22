import React from "react";
import Zoom from 'react-reveal/Zoom';

const raddy = "https://www.radford.edu/content/radfordcore/home.html"

const About = () => {
    return (
        <div className="about" id="about" >
            <br /><br /><br />


            <Zoom delay={200}>
            <h2>About Me</h2>
                <div className="about-words">       
                    <p className="about-info" >
                        My name is <a className="text-link" href="https://linkedin.com/in/jakebarber1996" target="_blank" rel="noreferrer">Jake Barber</a> and I am an aspiring software developer, hoping to specialize in blockchain development on Ethereum.
                    </p>
                    <p className="about-info" id="contact-info">
                        I graduated from <a className="text-link" href={raddy} target="_blank" rel="noreferrer">Radford University</a> in 2018 with a Bachelor of Science Degree in Computer Science and Technology, with a concentration in Database Design, as well as an Undergraduate Information Security Certificate recognized by the NSA.
                    </p>
                    <p className="about-info" >
                        I have a rich educational background in software development, data management, and information security. In addition, I have extensive professional experience implementing those core skills as an IT contractor for the United States Federal Government. As I continued to rapidly take on more responsibility within the company, I consistently demonstrated my ambition and desire for excellence in my work, my aptitude to learn at an accelerated pace, and my enthusiasm to communicate that knowledge to my peers.
                    </p>
                    <p>
                        At this time, I am eager to specialize further in the field of software development and I am excited to do so in the realm of blockchain technology.
                    </p>       
                    
                </div>
            </Zoom>
            <br />
            <Zoom delay={200}>
                <div className="links" >
                    
                    <div>
                        <h1 className="about-header">Contact Information</h1>

                        <p>Jake Barber</p>
                        <p>Mobile: (703) 635-8884</p>
                        <p>jabot999@gmail.com</p>
                        <p><a className="text-link" href="https://www.linkedin.com/in/jakebarber1996/" target="_blank" rel="noreferrer">My LinkedIn</a></p>

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
