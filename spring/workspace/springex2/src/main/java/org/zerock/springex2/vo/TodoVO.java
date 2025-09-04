package org.zerock.springex2.vo;

import lombok.*;

import java.time.LocalDate;
// VO의 경우 특정 열은 변경하면 안되기 떄문에 @Setter는 설정하지 않는다
@Getter // Getter 메서드 생성
@NoArgsConstructor // 기본 생성자 생성
@AllArgsConstructor // 모든 데이터를 저장하는 생성자 생성
@ToString // TodoDTO 안에 있는 모든 데이터를 확인 할 수 있는 toString을 생성
@Builder // TodoDTO 생성에 사용되는 메서드
public class TodoVO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
    private String writer;

    public void changeTodo(String title, LocalDate dueDate, boolean finished) {
        this.title = title;
        this.dueDate = dueDate;
        this.finished = finished;
    }
}
