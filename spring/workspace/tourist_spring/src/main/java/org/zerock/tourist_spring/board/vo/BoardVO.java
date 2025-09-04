package org.zerock.tourist_spring.board.vo;

import lombok.*;

import javax.swing.text.StringContent;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BoardVO {
    private int num;
    @Setter
    private String title;
    @Setter
    private String content;

    private String id;
    private LocalDate postDate;
    private int visitCount;

}
