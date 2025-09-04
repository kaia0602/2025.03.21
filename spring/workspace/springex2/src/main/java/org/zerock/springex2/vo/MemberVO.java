package org.zerock.springex2.vo;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class MemberVO {
    private String id;
    private String pw;
    private String email1;
    private String email2;
    private LocalDateTime regidate;
}
