import React, { useState } from "react";
import Toolbar from "./Toolbar";

function LandingPage(props) {
    const [isLoggedIn, setIsLoggedIn] = useState(false);

    const onClickLogin = () => {
        setIsLoggedIn(true);
    };

    const onClickLogout = () => {
        setIsLoggedIn(false);
    };

    return (
        <div>
            {/* 컴포넌트에 state와 함수 전달하기 */}
            <Toolbar
                isLoggedIn={isLoggedIn}
                onClickLogin={onClickLogin}
                onClickLogout={onClickLogout}
            />
            <div style={{padding: 16}}>Learn React with Sople!</div>
        </div>
    );
}
export default LandingPage;