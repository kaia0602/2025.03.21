import { useEffect, useState } from "react";
import useCounter from "./useCounter";

const MAX_CAPACITY = 10;

function Accommodate(props) {
    // 정원초과 문구를 출력하는 값, 화면갱신이 필요하기에 state로 저장
    const [ isFull, setIsFull] = useState(false);
    // 커스텀 훅을 이용하여 함수를 저장
    const [count, increaseCount, decreaseCount] = useCounter(0);

    useEffect(() => {
        console.log("=================");
        console.log("useEffect() is called");
        console.log(`isFull: ${isFull}`);
    });

    useEffect(() => {
        setIsFull(count >= MAX_CAPACITY); 
        console.log(`Current count value: ${count}`);
    }, [count]);

    return (
        // stlye을 직접 사용 시 {}로 감싸서 작성, 자바스크립트 객체 형식으로
        <div style={{padding: 16}}>
            <p>{`총 ${count}명 수용했습니다.`}</p>
            <button onClick={increaseCount} disabled={isFull}>
                입장
            </button>
            <button onClick={decreaseCount}>퇴장</button>
            {/* 조건식 && 실행문 */}
            {isFull && <p style={{color: "red"}}>정원이 가득찼습니다.</p>}
        </div>
    );
}

export default Accommodate;