import './App.css';
import React from "react";
import "bootstrap/dist/css/bootstrap.min.css"; //node modules/bootstrap
import Particles from "react-particles-js";
import Navbar from './components/Navbar'
import Header from "./components/Header"
import About from "./components/About"
import Blockchain from "./components/Blockchain"
import Projects from "./components/Projects"



function App() {
  return (
    <body data-spy="scroll" data-target=".navbar" data-offset="50">
      <meta name="viewport" content="width=device-width, initial-scale=1.0"></meta>
      <Particles 
        className="particles-canvas"
        params={{
          "particles": {
            "number": {
              "value": 15, 
              "density": {
                "enable": true, 
                "value_area": 900
              }
            },//number
            "shape": {
              "type": "circle",
              "stroke": {
                "width": 5,
                "color": "#FF9900" //bitcoin orange hex
              }
            },//shape
          },//particles
          "interactivity": {
            "events": {
                "onhover": {
                    "enable": true,
                    "mode": "repulse"
                  }
              }
          }
        }}

      />
      <Navbar className="sticky-=nav" />
      <Header />
      <About />
      <Blockchain />
      <Projects />
    </body>
  );
}

export default App;
