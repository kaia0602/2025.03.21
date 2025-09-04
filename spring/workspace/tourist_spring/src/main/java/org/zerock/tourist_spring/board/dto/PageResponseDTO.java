package org.zerock.tourist_spring.board.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class PageResponseDTO<E> {
    private int page; // 현재 선택한 페이지
    private int size; // 한번에 출력할 데이터의 갯수
    private int total; // 총 데이터의 갯수
    private int start; // 시작 페이지의 번호
    private int end; // 끝 페이지의 번호
    private boolean prev; // 지난 페이지의 존재 여부
    private boolean next; // 다음 페이지의 존재 여부
    private int last;
    private List<E> dtoList; // 게시글의 데이터 리스트

    @Builder(builderMethodName = "withAll")
    public PageResponseDTO(PageRequestDTO pageRequestDTO, List<E> dtoList, int total) {
        this.page = pageRequestDTO.getPage();
        this.size = pageRequestDTO.getSize();
        this.total = total;
        this.dtoList = dtoList;

        // 1 / 10 => 0.1 올림 => 1 * 10 => 10
        // 5 / 10 => 0.5 올림 => 1 * 10 => 10
        // 15 / 10 => 1.5 올림 => 2 * 10 => 20
        this.end = (int)(Math.ceil(this.page / 10.0)) * 10; // page를 10으로 나눈값을 올림한 후 곱하기 10
        this.start = this.end - 9; // 현재 페이지에 해당하는 첫번째 페이지
        // 123 / 10 = 12.3 올림 => 13
        // 100 / 10 = 10.0 올림 => 10
        // 75 / 10 = 7.5 올림 => 8
        this.last = (int)(Math.ceil((total/(double)size)));
        this.end = end > last ? last : end; // 끝 페이지(10)가 마지막 페이지(?)보다 클 경우 마지막 페이지가 끝 페이지로 변경
        this.prev = this.start > 1; // 첫 페이지가 1 보다 크면 true
        this.next = total > this.end * this.size; // 다음 페이지가 있을 경우 true
    }
}
