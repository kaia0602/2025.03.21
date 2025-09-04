import Comment from "./Comment";

const comments = [
    {name:"이인제", comment:"안녕하세요, 소플입니다."},
    {name:"유재석", comment:"리엑트 재미있어요~!"},
    {name:"강민경", comment:"저도 리엑트 배워 보고 싶어요!!"}
]
function CommentList(props){
    return(
        <div>
            <Comment name="이인제" comment="제가 만든 첫 컴포넌트 입니다."/>
            <Comment name="유재석" comment="리엑트 재미있어요~!"/>
            {comments.map((comment)=>{ // comments 배열을 map을 이용하여 반복 , comment 컴포넌트를 반환
                return <Comment name={comment.name} comment={comment.comment}/>
            })}
        </div>
    );
}
export default CommentList;