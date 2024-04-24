import './App.css'

import { Card } from './components/cards/card';


import { useFoodData } from './hooks/useFoodData';

function App() {
  const { data } = useFoodData();

  return (
    <>
      <div className='container'>
        <h1>Nosso cardápio</h1>
        <div className="card-grid">
          {data?.map((foodData: { price: number; title: string; image: string; }) =>
          <Card 
          price={foodData.price} 
          title={foodData.title} 
          image={foodData.image}
          />
          )} 
          
        </div>
      </div>
    </>
  )
}

export default App
