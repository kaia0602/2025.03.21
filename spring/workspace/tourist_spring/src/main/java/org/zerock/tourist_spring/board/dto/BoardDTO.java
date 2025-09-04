package org.zerock.tourist_spring.board.dto;

import lombok.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardDTO {
    private int num;
    private String title;
    private String content;
    private String id;
    private LocalDate postDate;
    private int visitCount;
}
