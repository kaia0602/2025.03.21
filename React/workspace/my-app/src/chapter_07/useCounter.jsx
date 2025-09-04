import { useState } from "react";

function useCounter(initialValue) {
    // 인원 수를 확인할 수를 state선언
    const [count, setCount] = useState(initialValue);

    const increaseCount = () => setCount((count) => count +1);
    // Math.max(숫자1, 숫자2): 숫자 1, 2를 비교하여 큰 수를 반환
    const decreaseCount = () => setCount((count) => Math.max(count - 1, 0));

    return [count, increaseCount, decreaseCount];
}

export default useCounter;