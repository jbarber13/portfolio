import './App.css';
import React from "react";
import "bootstrap/dist/css/bootstrap.min.css"; //node modules/bootstrap
import Particles from "react-particles-js";
import Navbar from './components/Navbar'
import Header from "./components/Header"
import About from "./components/About"
import Portfolio from "./components/Portfolio"



function App() {
  return (
    <>
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
z
      />
      <Navbar className="sticky-=nav" />
      <Header />
      <About />
      <Portfolio />
      
    </>  
  );
}

export default App;
