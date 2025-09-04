import React from "react";
import {useNavigate} from "react-router-dom"
import styled from "styled-components";
import PostList from "../list/PostList";
import Button from "../ui/Button"
// import data from '../../data.json'; // 로컬스토리지로 변경

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

function MainPage(props) {
    const {} = props;

    const navigate = useNavigate(); // a태그 대신 사용하는 useNavigate
    // 페이지 이동시 새로고침이 일어나지 않음

    const jsonData = localStorage.getItem("blog");
    // 로컬 스토리지 저상시 사용한 key를 이용하여 데이터를 저장
    const data = JSON.parse(jsonData);
    // json 데이터를 자바스크립트 데이터로 변경
 
    // 최신 아이디를 저장
    return (
        <Wrapper>
            <Container>
                <Button
                    title="글 작성하기"
                    onClick={()=> {
                        navigate("/post-write");
                    }}
                />

                <PostList
                    posts={data}
                    onClickItem={(item) => {
                        navigate(`/post/${item.id}`)
                    }}
                />
            </Container>
        </Wrapper>
    );
}
export default MainPage;