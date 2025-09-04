import React from "react"

const style = {
    wrapper: {
        padding: 16,
        display: "flex",
        flexDirection: "row",
        borderBottom: "1px solid grey"
    },
    getting: {
        marginRight: 8,
    },
};

function Toolbar(props) {
    const {isLoggedIn, onClickLogin, onClickLogout} = props;

    return(
        <div style={style.wrapper}>
            {/* 조건식 && 실행문: 조건식이 True일때 실핼문이 실해됨 */}
            {isLoggedIn && <span style={style.getting}>Welcome!!</span>}
            {/* 조건식 ? True일때 실행 : False일때 실행 */}
            {isLoggedIn ? (
                <button onClick={onClickLogout}>Logout</button>
            ) : (
                <button onClick={onClickLogin}>Login</button>
            )}
        </div>
    );
}

export default Toolbar;