import React, { useState } from 'react';
import './App.css'; // Import your CSS file

function App() {
  const [name, setName] = useState('');
  const [time, setTime] = useState('');
  const [result, setResult] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await fetch('http://localhost:8080/predict', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({ nom: name, time: parseInt(time) })
      });

      if (!response.ok) {
        throw new Error('Network response was not ok.');
      }

      const data = await response.text();
      setResult(data);
    } catch (error) {
      console.error('Error:', error);
      setResult('Failed to fetch data from the server.');
    }
  };

  return (
    <div className="get-in-touch"> {/* Use your defined class */}
      <section> 
        <h1 className="title">Get in touch</h1>
        <form className="contact-form row" id="predictForm" onSubmit={handleSubmit}>
          <div className="form-field col-lg-6"> {/* Use your defined class */}
            <input
              id="name"
              className="input-text js-input"
              type="text"
              value={name}
              onChange={(e) => setName(e.target.value)}
              required
              
            />
            <label className="label" htmlFor="name">
              Name
            </label>
          </div>
          <div className="form-field col-lg-6"> {/* Use your defined class */}
            <input
              id="tem"
              className="input-text js-input"
              type="number"
              value={time}
              onChange={(e) => setTime(e.target.value)}
              required
              
            />
            <label className="label" htmlFor="tem">
              Time
            </label>
          </div>

          <div className="form-field col-lg-12"> {/* Use your defined class */}
            <input className="submit-btn" type="submit" value="Submit" />
          </div>
        </form>
      </section>
      <div>{result && <p>{result}</p>}</div>
    </div>
  );
}

export default App;
