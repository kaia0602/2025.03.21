package org.zerock.tourist_spring.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageRequestDTO {
    @Builder.Default
    @Min(value = 1)
    @Positive
    private int page = 1;

    @Builder.Default
    @Min(value = 10)
    @Max(value = 100)
    private int size = 10;
    private String link;
    private String titles;
    private String keyword;


    public int getSkip() {
        return (page - 1) * size;
    }


    public String getLink() {
        StringBuilder builder = new StringBuilder();
        builder.append("page=" + this.page);
        builder.append("&size=" + this.size);
        link = builder.toString();
        if(titles != null && !titles.isEmpty()) {
            builder.append("&titles=" + titles);
        }
        if(keyword != null && !keyword.isEmpty()) {
            try {
                builder.append("&keywords=" + URLEncoder.encode(keyword, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        link = builder.toString();
        return link;
    }
}
