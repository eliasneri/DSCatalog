import React, { useState } from 'react';


const App = () => {
    const [counter, setCounter] = useState(0);
    return (
        <div className="container mt-5">
           <button
                className="btn btn-primary mr-5"
                onClick={() => setCounter(counter + 1) }
                >
                +
            </button>
           <span>
               {counter}
            </span>
           <button 
                className="btn btn-primary ml-5"
                onClick={() => setCounter(counter - 1) }
                >
                -
            </button>
            <button
                className="btn btn-primary ml-5"
                onClick={() => setCounter(0)}
                >
                Zerar
                </button>
            {counter >= 5 && <h1>O Valor é maior que 5</h1>}
        </div>
    );
}

export default App;