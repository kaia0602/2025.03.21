package org.zerock.springex2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.zerock.springex2.dto.PageRequestDTO;
import org.zerock.springex2.dto.PageResponseDTO;
import org.zerock.springex2.vo.TodoVO;
import org.zerock.springex2.dto.TodoDTO;
import org.zerock.springex2.mapper.TodoMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 비즈니스 로직: DTO를 VO로 변환하거나 VO를 DTO로 변환하는 코드
         // 비즈니스 로직의 코드를 작성하는 Service 클래스
@Service // 계산이나 데이터 변경 및 추가하는 등의 처리를 작성하는 클래스
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    private final TodoMapper todoMapper; // 의존성 주입의 종류: 생성자 주입 방식 (최근 권장 방식)
                                         // RequiredArgsConstructor, final을 함께 사용하면 Autowired를 사용하지 않고 주입가능

    @Override
    public void register(TodoDTO todoDTO) {
        // 등록의 경우 화면에서 가지고온 데이터인 DTO를 VO로 변경하여
        TodoVO todoVO = TodoVO.builder()
                .title(todoDTO.getTitle())
                .dueDate(todoDTO.getDueDate())
                .writer(todoDTO.getWriter())
                .build();
        // Mapper를 이용해 insert문을 실행
        todoMapper.insertTodo(todoVO);
    }

    @Override
    public PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO) {
        List<TodoVO> voList = todoMapper.selectSearch(pageRequestDTO);
        List<TodoDTO> dtoList = voList.stream()
                .map(vo -> TodoDTO.builder()
                        .tno(vo.getTno())
                        .title(vo.getTitle())
                        .dueDate(vo.getDueDate())
                        .finished(vo.isFinished())
                        .writer(vo.getWriter())
                        .build())
                .collect(Collectors.toList());
        int total = todoMapper.getCount(pageRequestDTO);
        return PageResponseDTO.<TodoDTO>withAll()
                .pageRequestDTO(pageRequestDTO)
                .dtoList(dtoList)
                .total(total)
                .build();
    }

    @Override
    public List<TodoDTO> getAll() {
        // db에서 전체 데이터를 받아놔 voList에 저장
        List<TodoVO> voList = todoMapper.selectAll();
        // vo 로 되어있는 리스트를 dto 리스트로 변경
        List<TodoDTO> dtoList = new ArrayList<>();
        for (TodoVO todoVO  : voList) {
            TodoDTO dto = new TodoDTO();
            dto.setTitle(todoVO.getTitle());
            dto.setTno(todoVO.getTno());
            dto.setTitle(todoVO.getTitle());
            dto.setDueDate(todoVO.getDueDate());
            dto.setFinished(todoVO.isFinished());
            dto.setWriter(todoVO.getWriter());
            dtoList.add(dto);

        }



        return dtoList;
        // stream과 builder를 사용한 vo를 dto로 변경하는 방식
//        List<TodoDTO> dtoList2 = todoMapper.selectAll().stream().map(vo -> TodoDTO.builder()
//                .tno(vo.getTno())
//                .title(vo.getTitle())
//                .dueDate(vo.getDueDate())
//                .finished(vo.isFinished())
//                .writer(vo.getWriter())
//                .build()
//        ).collect(Collectors.toList());
    }

    @Override
    public TodoDTO getOne(Long tno) {
        TodoVO todoVO = todoMapper.selectOne(tno); // DB에서 tno와 일치하는 데이터 저장
        TodoDTO dto = TodoDTO.builder() // VO를 DTO로 변경
                .tno(todoVO.getTno())
                .title(todoVO.getTitle())
                .dueDate(todoVO.getDueDate())
                .finished(todoVO.isFinished())
                .writer(todoVO.getWriter())
                .build();
        // 완성된 DTO를 Controller로 반환
        return dto;
    }

    @Override
    public void removeTodo(Long tno) {
        todoMapper.deleteTodo(tno);
    }

    @Override
    public String editTodo(TodoDTO todoDTO) {
            TodoVO todoVO = todoMapper.selectOne(todoDTO.getTno()); // 데이터가 존재하는지 확인
        if (todoVO != null) {
            todoVO.changeTodo(todoDTO.getTitle(), todoDTO.getDueDate(), todoDTO.isFinished()); // 있으면 변경가능한 데이터를 변경
            todoMapper.updateTodo(todoVO); // update문 실행
            return "수정실행";
        } else {
            return "수정처리 중 예외발생";
        }

    }

//        return dtoList2;
}
