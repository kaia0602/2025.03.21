package org.zerock.tourist_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.tourist_springboot.domain.Board;

public interface BoardRepository extends JpaRepository<Board,Long> {
}
