import { useEffect } from "react";

const styles = {
    wrapper: {
        margin: 8,
        padding: 8,
        display: "flex",
        flexDirection: "row",
        border: "1px solid grey",
        borderRadius: 16,
    },
    messageText: {
        color: "black",
        fontSize: 16,
    },
};
function Notification_useHook(props){
    useEffect(()=>{
            console.log("componentDidMount() called. ");
            
            return ()=>{
                console.log("componentWillUnmount() called.");
            }
        },[])
        useEffect(()=>{
                console.log("componentDidUpdate() called.")
            })
     return (
            <div style={styles.wrapper}>
                <span style={styles.messageText}>
                    {props.message}
                </span>
            </div>
        );
}
export default Notification_useHook;