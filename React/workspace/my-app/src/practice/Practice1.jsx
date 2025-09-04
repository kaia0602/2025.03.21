import { useEffect, useState } from "react";
import scissors from "./img/0.png"; 
import rock from "./img/1.png";     
import paper from "./img/2.png";    

function Practice1() {
  const [player, setPlayer] = useState(null);
  const [computer, setComputer] = useState(null);
  const [result, setResult] = useState("");
  const[history, setHistory] = useState([]);

  const images = [scissors, rock, paper];


  const resultButton = (playerChoice) => {
    const computerChoice = Math.floor(Math.random() * 3);

    setPlayer(playerChoice);
    setComputer(computerChoice);

    if (playerChoice === computerChoice) {
      setResult("비겼습니다.");
    } else if (
      (playerChoice === 0 && computerChoice === 2) ||
      (playerChoice === 1 && computerChoice === 0) ||
      (playerChoice === 2 && computerChoice === 1)
    ) {
      setResult("이겼습니다.");
    } else {
      setResult("졌습니다.");
    }
    const list = ["✌","✊","✋"]
    setHistory([`${list[player]}vs${list[computer]}${result}`, ...history])
  };

  return (
    <div style={{textAlign: "center"}}>
      <h2>{result}</h2>
      <div>
        <img src={player !== null ? images[player] : images[scissors]} alt="userImage"/>
        <button onClick={() => resultButton(0)}>✌ </button>
        <button onClick={() => resultButton(1)}>✊ </button>
        <button onClick={() => resultButton(2)}>✋ </button>
        <img src={computer !== null ? images[computer] : images[scissors] } alt="computerImage"  />
      </div>
      <div>
        {history.map((data)=> {
           return  <p style={{textAlign:"center"}}>{data}</p>
        })}
      </div>
      <span></span>
    </div>
  );
}

export default Practice1;
