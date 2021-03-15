import React from "react";

const About = () => {
    return (
        <div className="component-wraper" id="about" >
            <br /><br /><br /><br /><br /><br />

            <div className="about-words">              
                <h2>About Me</h2>
            </div>
            <div className="about-words">              
                <p className="about-info" >
                    My name is <a className="text-link" href="https://linkedin.com/in/jakebarber1996" target="_blank">Jake Barber</a> and I am an aspiring software developer, hoping to specialize in blockchain development on Ethereum.
                </p>
            </div>
            <div className="about-words">              
                <p className="about-info">
                    I have a Bachelors degree in Computer Science and Technology, with a concentration in Database Design, as well as an Undergraduate Information Security Certificate recognized by the NSA.  
                </p>
            </div>

            
            
            

            


            <section className="links">


                    <div className="box">
                        <h3>Contact Information</h3>
                        <ul>
                        <li>Jake Barber</li>
                        <li>1800 Killian Lakes Drive, #18106 <br /> Columbia SC, 29203</li>
                        <li>Mobile: (703) 635-8884</li>
                        <li>jabot999@gmail.com</li>
                        
                        </ul>
                        <div className="resumeButton">
                        <a href="https://drive.google.com/file/d/1XqDIdbJ-AOnlPS5ROrAxYglURUrxmAvU/view?usp=sharing" target="_blank" className="contact">RÉsumÉ</a>
                        </div>
                    </div>
                    

                    



            </section>

            
        </div>
        
    )
}

export default About
