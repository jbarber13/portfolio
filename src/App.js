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
      
      <Navbar className="sticky-=nav" />
      <Header />
      <About />
      <Portfolio />
      
    </>  
  );
}

export default App;
