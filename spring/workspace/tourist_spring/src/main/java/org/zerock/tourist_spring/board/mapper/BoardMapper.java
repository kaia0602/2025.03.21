package org.zerock.tourist_spring.board.mapper;

import org.zerock.tourist_spring.board.dto.PageRequestDTO;
import org.zerock.tourist_spring.board.vo.BoardVO;

import java.util.List;

public interface BoardMapper {
    List<BoardVO> selectAll();
    BoardVO selectByNum(int num);
    void updateVisitCount(int num);
    void deleteBoard(int num);
    void updateBoard(BoardVO boardVO);
    List<BoardVO> selectList(PageRequestDTO pageRequestDTO);
    int getCount(PageRequestDTO pageRequestDTO);
    void insertBoard(BoardVO boardVO);
    List<BoardVO> selectSearch(PageRequestDTO pageRequestDTO);
}
