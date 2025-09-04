import { useEffect, useState } from "react";
import "./Practice2.css";

function Practice2() {
  const [id, setId] = useState("");
  const [pw, setPw] = useState("");
  const [confirmPw, setConfirmPw] = useState("");
  const [errorMsg, setErrorMsg] = useState("빈 칸을 모두 입력하세요.");
  let testID = "test"; 

  useEffect(() => {
    if (id==="" || pw==="" || confirmPw==="") {
      setErrorMsg("빈 칸을 모두 입력하세요.");
    } else if (id === testID) {
      setErrorMsg("이미 존재하는 계정입니다.");
    } else if (pw !== confirmPw) {
      setErrorMsg("비밀번호가 일치하지 않습니다.");
    } else {
      setErrorMsg("");
    }
  }, [id, pw, confirmPw]);

  const handleSubmit = (e) => {
    e.preventDefault();
    
      alert(`id: ${id}\npassword: ${pw}`);
    
  };

  return (
    <div className="container">
      <h3>REACTERS</h3>
      <h4 style={{float:"left"}}>회원가입</h4>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={id}
          onChange={(e) => setId(e.target.value)}
          placeholder="아이디"
        /><br /><br />
        <input
          type="password"
          value={pw}
          onChange={(e) => setPw(e.target.value)}
          placeholder="비밀번호"
        /><br /><br />
        <input
          type="password"
          value={confirmPw}
          onChange={(e) => setConfirmPw(e.target.value)}
          placeholder="비밀번호 확인"
        />
        <p className="error">{errorMsg}</p>
        <button type="submit">
          회원가입
        </button>
      </form>
    </div>
  );
}

export default Practice2;
