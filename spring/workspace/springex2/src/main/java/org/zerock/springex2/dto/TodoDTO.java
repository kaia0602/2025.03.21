package org.zerock.springex2.dto;

import lombok.*;

import java.time.LocalDate;

@Getter // Getter 메서드 생성
@Setter // Setter 메서드 생성
@NoArgsConstructor // 기본 생성자 생성
@AllArgsConstructor // 모든 데이터를 저장하는 생성자 생성
@ToString // TodoDTO 안에 있는 모든 데이터를 확인 할 수 있는 toString을 생성
@Builder // TodoDTO 생성에 사용되는 메서드
// @Data // @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
public class TodoDTO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
    private String writer;
    // 1번 방법: alt + insert 단축키로 getter, setter, constructor 자동 생성
    // 2번 방법: lombok 라이브러리의 어노테이션을 추가
}

