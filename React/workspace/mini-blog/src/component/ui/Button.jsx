import styled from "styled-components";
import React from "react";

const StyledButton = styled.button`
    padding: 8px 16px;
    font-size: 16px'
    border-width: 1px;
    border-radius: 8px;
    cursor: pointer;
`;

function Button(props)  {
    const {title, onClick} = props; // title: 버튼의 이름, onClick: 버튼이 실행할 함수를 props로 받아옴

    return <StyledButton onClick={onClick}>{title || "button"}</StyledButton>
}

export default Button;