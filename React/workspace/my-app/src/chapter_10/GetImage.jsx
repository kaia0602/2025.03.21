import { useState } from "react";
import place01 from "./img/img_place_01.jpg"
import place02 from "./img/img_place_02.jpg"


function GetImage (props) {
    const[image, setImage] = useState(null);
    const onClickBtn = () => {
        setImage(place01);
    }
     const onClickBtn2 = () => {
        setImage(place02);
    }
    return (
    <div>
        <img src={place01} alt="이미지"/>
        <img src="https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpreviews.123rf.com%2Fimages%2Fmofeng%2Fmofeng1603%2Fmofeng160300088%2F53897001-cosmos.jpg&type=a340" />
        <img src="https://ssl.pstatic.net/static/newsstand/2025/0717/koreatimesus/101549/001.jpg"/>
        <img src="https://ssl.pstatic.net/static/newsstand/2025/0717/koreatimesus/101549/001.jpg"/>
        <img src="https://ssl.pstatic.net/static/newsstand/2025/0717/koreatimesus/101549/001.jpg"/>
        <img src="https://ssl.pstatic.net/static/newsstand/2025/0717/koreatimesus/101549/001.jpg"/>
        <img src="https://ssl.pstatic.net/static/newsstand/2025/0717/koreatimesus/101549/001.jpg"/>
        {/* public폴더의 이미지 */}
        <img src="/logo512.png"/>
        <img src={image} alt="이미지"/>
        <button onClick={onClickBtn}>button</button>
        <button onClick={onClickBtn2}>button2</button>
    </div>
    )
}
export default GetImage;