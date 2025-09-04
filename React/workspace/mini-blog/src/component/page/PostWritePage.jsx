import styled from "styled-components";
import React, { useState } from "react";
import {data, useNavigate} from "react-router-dom"
import Button from "../ui/Button"
import TextInput from "../ui/TextInput"


const Wrapper = styled.div`
    padding: 16px;
    width: calc(100% - 32px);
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
`;

const Container = styled.div`
    width: 100%;
    max-width: 720px;

    :not(:last-child) {
    margin-bottom: 16px;
    }
`;

function PostWritePage(props) {
    const navigate = useNavigate();

    const[title, setTitle] = useState("");
    const[content, setContent] = useState("");
    const handleWrite = () => {
        const data = JSON.parse(localStorage.getItem("blog")); // 원본데이터를 변수에 저장

            const lastId = Math.max(...data.map(item => item.id));
            const post = {
                id: lastId + 1,
                title: title,
                content: content,
                comments: []
            } // 원본 데이터에 post를 추가하여 새 객체 생성
            const saveData = [post, ...data];
            const jsonSaveData = JSON.stringify(saveData); // json 데이터로 변환
            localStorage.setItem("blog", jsonSaveData)
            navigate("/"); // main으로 이동
    }

    return (
        <Wrapper>
            <Container>
                <TextInput
                    height={20}
                    value={title}
                    onChange={(event) => {
                        setTitle(event.target.value);
                    }}
                />
                <TextInput
                    height={480}
                    value={content}
                    onChange={(event) => {
                        setContent(event.target.value);
                    }}
                />
                <Button
                    title="글 작성하기"
                    onClick={handleWrite}
                />
            </Container>
        </Wrapper>
    )
}
export default PostWritePage;