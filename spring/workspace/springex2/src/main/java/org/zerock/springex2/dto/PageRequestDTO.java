package org.zerock.springex2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.util.Arrays;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageRequestDTO {
    @Builder.Default // 아무것도 설정하지않고 DTO를 만들었을 경우 0이아닌 1이 설정
    @Min(value=1)
    @Positive // 정수 값만 들어갈 수 있도록 설정
    private int page = 1;
    
    @Builder.Default // 최소값은 10 최대값은 100으로 설정
    @Min(value=10)
    @Max(value=100)
    private int size = 10;
    private String link;
    private String[] types; // 제목, 작성자
    private String keyword; // 검색어
    private boolean finished; // 종료 여부
    private LocalDate from; // 검색 시작날짜
    private LocalDate to; // 검색 종료날짜

    public int getSkip() {
        return (page - 1) * 10; // 1 page: 0 / 2 page: 10 / 3 page: 20
    }

    public boolean checkType(String type) {
        if(types == null || types.length == 0){ // types이 하나도 설정이 되지 않을시 false를 반환
            return false;
        }
        // types이 설정되어 있다면 type 안의 데이터가 있는지 확인하여 true나 false를 반환
        return Arrays.stream(types).anyMatch(type::equals);
    }

    public String getLink() {
            StringBuilder builder = new StringBuilder();
            builder.append("page=" + this.page);
            builder.append("&size=" + this.size);
            link = builder.toString();
            if(finished) {
                builder.append("&finished=on"); // checkBox 타입은 on으로 저장해야됨
            }
            if(types != null && types.length > 0) {
                // 제목, 작성자 두개다 설정되어 있다면 반복문을 이용하여 두개 모두 파라미터로 설정
                for(int i = 0; i < types.length; i++) {
                    builder.append("&types=" + types[i]);
                }
            }
            if(keyword != null) {
                try{
                    builder.append("&keyword=" + URLEncoder.encode(keyword, "UTF-8")); // 한글이 깨지지 않도록 URLEncoder 사용
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
             }
            if(from != null) {
                builder.append("&from=" + from.toString());
            }
            if(to != null) {
                builder.append("&to=" + to.toString());
            }
            link = builder.toString();
             return link;

    }
}
