import "./card.css"

interface CardProps {
    price: number,
    title: string,
    image: string
}

export function Card({price, image, title} : CardProps){
    return(
        <div className="card">
            <img src="" alt="" />
            <h2></h2>
            <p><b>R$</b></p>
        </div>
    )
}