import { useRef } from "react";

function TextInputWithFocusButton (props) {
    const inputElem = useRef(null); // useRef 선언, 리렌더링시 값이 초기화되지 않음
    // useRef의 값이 변경되도 리렌더링을 발생하지 않는다
    const onButtonClick = () => {
        inputElem.current.focus();
        console.log(inputElem.current.value);
    };

    return(
        <> 
        {/* ref: useRef와 태그를 연결하는 속성 */}
        <input ref={inputElem} type="text" />
        <button onClick={onButtonClick}>Focus the input</button>
        </>
    );
}

export default TextInputWithFocusButton;