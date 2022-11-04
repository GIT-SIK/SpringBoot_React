import React, {useEffect, useState} from 'react';
import axios from 'axios';

function App() {
   

  const [back, setBack] = useState('');

    useEffect(() => {
        axios.get('/api/data')
        .then(response => {
          console.log(response.data);
          setBack(response.data);
        }) // setBack(response.data))
        .catch(error => {
          console.log("실패");
          console.log(error);
        })
    }, []);

    


    return (
        <div>

          Data : {back}
                        {/* {back.map(item => (
      <div key={item.hide_1}>{item.hide_2}</div>
                        ))} */}
        </div>
    );
}

export default App;