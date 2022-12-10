import React, {useEffect, useState} from 'react';
import axios from 'axios';

function App() {
   

  const [back, setBack] = useState([]);


    useEffect(() => {
        axios.get('/api/data')
        .then(response => {
          console.log(response.data);
          setBack(response.data);
        }) 
        .catch(error => {
          console.log("실패");
          console.log(error);
        })
    }, []);
    
    return (
        <>
          <div> test </div>
          <div key={back[0].num}> </div>
          {/* {back.map(bak => (
          <div key={bak.num}> <span> {bak.hide_2} </span> </div>
          ))} */}
        </>
    );

  }


export default App;