package org.zerock.springex2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDTO {
    private String id;
    private String pw;
    private String email1;
    private String email2;
    private LocalDateTime regidate;
}
