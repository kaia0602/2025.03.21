package org.zerock.tourist_spring.board.service;

import org.zerock.tourist_spring.board.dto.BoardDTO;
import org.zerock.tourist_spring.board.dto.PageRequestDTO;
import org.zerock.tourist_spring.board.dto.PageResponseDTO;

import java.util.List;

public interface BoardService {
    List<BoardDTO> getAll();
    BoardDTO getByNum(int num);
    void removeBoard(int num);
    String editBoard(BoardDTO boardDTO);
    PageResponseDTO<BoardDTO> getList(PageRequestDTO pageRequestDTO);
    int addBoard(BoardDTO boardDTO);
}
