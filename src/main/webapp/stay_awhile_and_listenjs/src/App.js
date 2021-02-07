import React, {Component} from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
    state = {
        isLoading: true,
        Diablo2Characters: []
    };

    async componentDidMount() {
        const options = {
            headers: {
                method: "GET"
            }
        }
        const response = await fetch('http://localhost:8080/stayAwhile/test', options);
        const body = await response.json();
        this.setState({Diablo2Character: body, isLoading: false});
    }

    render() {
        const {Diablo2Character, isLoading} = this.state;
        if (isLoading) {
            return <p>Loading...</p>;
        }
            return (
                <div className="App">
                    <header className="App-header">
                        <img src={logo} className="App-logo" alt="logo"/>
                        <div className="App-intro">
                            <h2>JESTĘ PROGRAMISTĄ</h2>
                            <div>
                                {Diablo2Character.description}
                                {Diablo2Character.name}
                            </div>
                        </div>
                    </header>
                </div>
            );
        return <div>madzia to swietna przyjaciolka</div>
    }
}
export default App;