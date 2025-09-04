package org.zerock.tourist_spring.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.zerock.tourist_spring.board.dto.BoardDTO;
import org.zerock.tourist_spring.board.dto.PageRequestDTO;
import org.zerock.tourist_spring.board.dto.PageResponseDTO;
import org.zerock.tourist_spring.board.mapper.BoardMapper;
import org.zerock.tourist_spring.board.vo.BoardVO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getAll() {
        List<BoardVO> voList = boardMapper.selectAll();
        List<BoardDTO> dtoList = new ArrayList<>();
        for(BoardVO boardVO : voList){
            BoardDTO dto = new BoardDTO();
            dto.setNum(boardVO.getNum());
            dto.setTitle(boardVO.getTitle());
            dto.setContent(boardVO.getContent());
            dto.setId(boardVO.getId());
            dto.setPostDate(boardVO.getPostDate());
            dto.setVisitCount(boardVO.getVisitCount());
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public BoardDTO getByNum(int num) {
        boardMapper.updateVisitCount(num); // 조회수 증가 SQL 실행
        BoardVO vo = boardMapper.selectByNum(num);
        BoardDTO dto = BoardDTO.builder()
                .num(vo.getNum())
                .title(vo.getTitle())
                .content(vo.getContent().replaceAll("(\r\n|\r|\n)", "<br/>"))  // 모든 엔터키를 <br/> 태그로 변경
                .id(vo.getId())
                .postDate(vo.getPostDate())
                .visitCount(vo.getVisitCount())
                .build();
        return dto;
    }

    @Override
    public void removeBoard(int num) {
        boardMapper.deleteBoard(num);
    }

    @Override
    public String editBoard(BoardDTO boardDTO) {
        BoardVO vo = boardMapper.selectByNum(boardDTO.getNum());
        if(vo != null){
            vo.setContent(boardDTO.getContent());
            vo.setTitle(boardDTO.getTitle());
            boardMapper.updateBoard(vo);
            return "edit board successfully!";
        } else {
            return "failed to edit board!";
        }

    }

    @Override
    public PageResponseDTO<BoardDTO> getList(PageRequestDTO pageRequestDTO) {
        List<BoardVO> voList = boardMapper.selectSearch(pageRequestDTO);
        List<BoardDTO> dtoList = voList.stream()
                .map(vo -> BoardDTO.builder()
                        .num(vo.getNum())
                        .title(vo.getTitle())
                        .content(vo.getContent())
                        .id(vo.getId())
                        .postDate(vo.getPostDate())
                        .visitCount(vo.getVisitCount())
                        .build())
                .collect(Collectors.toList());
        int total = boardMapper.getCount(pageRequestDTO);
        PageResponseDTO<BoardDTO> pageResponseDTO = PageResponseDTO.<BoardDTO>withAll()
                .pageRequestDTO(pageRequestDTO)
                .dtoList(dtoList)
                .total(total)
                .build();
        return pageResponseDTO;
    }

    @Override
    public int addBoard(BoardDTO boardDTO) {
        BoardVO boardVO = BoardVO.builder()
                .title(boardDTO.getTitle())
                .content(boardDTO.getContent())
                .id(boardDTO.getId())
                .postDate(boardDTO.getPostDate())
                .visitCount(boardDTO.getVisitCount())
                .build();
        boardMapper.insertBoard(boardVO);
        return boardVO.getNum();

    }
}
