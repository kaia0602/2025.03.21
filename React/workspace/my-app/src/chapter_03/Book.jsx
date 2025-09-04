function Book(props) {
    // 화면에 출력할 내용들을 적는 jsx작성 공간
    return (
        <div>
            <h1>{`이 책의 이름은 ${props.name} 입니다.`}</h1>
            <h2>{`이 책은 총 ${props.numOfPage}페이지로 이뤄져 있습니다.`}</h2>
        </div>
    )
}
// Book.jsx 파일을 불렀을 때 기본으로 Book함수를 돌려주도록 설정
export default Book;