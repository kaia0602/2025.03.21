package org.zerock.tourist_springboot.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.zerock.tourist_springboot.domain.Board;
import org.zerock.tourist_springboot.dto.BoardDTO;
import org.zerock.tourist_springboot.repository.BoardRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public Board save(BoardDTO dto) {
        return boardRepository.save(dto.toEntity());
    }

    public List<Board> findAll() {
        return boardRepository.findAll();
    }

    public Board findById(Long num) {
        return boardRepository.findById(num).orElseThrow(EntityNotFoundException::new);
    }



}
