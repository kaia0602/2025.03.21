package org.zerock.tourist_springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.zerock.tourist_springboot.domain.Board;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BoardDTO {
    private Long num;
    private String title;
    private String content;
    private String id;
    private LocalDateTime postdate;
    private Long visitcount;

    public Board toEntity() {
        return Board.builder()
                .num(this.num)
                .title(this.title)
                .content(this.content)
                .id(this.id)
                .postdate(this.postdate)
                .visitcount(this.visitcount)
                .build();
    }


}
