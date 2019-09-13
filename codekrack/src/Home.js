import React from 'react';
import Question from './components/Question';
import Code from './components/Code';
import Header from './components/Header';
import { Link } from "react-router-dom";

class Home extends React.Component {
    render() {
      return (
        <div className='body'>
            <Header />
            <div className="container">
                <div className="toprow">
                    <div className="Column questionasnwer">
                        <h3 className='get-krackin'>Get Krackin</h3>
                        <div><Question question={"in"}/></div>
                        <div className="answers"> 
                        <Link to="/quiz" >
                            <div className="button">
                            <button onClick={this.props.action}>
                                Java
                            </button>
                            </div>
                        </Link>
                        <Link to="/quiz" >
                            <div className="button">
                            <button onClick={this.props.action}>
                                C#
                            </button>
                            </div>
                        </Link>
                        <Link to="/quiz" >
                            <div className="button">
                            <button onClick={this.props.action}>
                                Python
                            </button>
                            </div>
                        </Link>
                        <Link to="/quiz" >
                            <div className="button">
                            <button onClick={this.props.action}>
                                JavaScript
                            </button>
                            </div>
                        </Link>  
                        </div>
                    </div>                        
                    <div className="Column">
                        <h3>Code</h3>
                        <Code code={'So you think you can code...\n\nTake the CodeKrack challenge to find out\n\n<<=Choose Your Language'}/>
                    </div>
                     
                </div>
                                   
            </div>     
        </div>
      );
        
    }
  }

export default Home;