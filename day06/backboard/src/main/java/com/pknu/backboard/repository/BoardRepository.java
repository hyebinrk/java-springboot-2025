package com.pknu.backboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pknu.backboard.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
  // JpaRepository를 상속받아 기본적인 CRUD 메서드를 자동으로 제공

  Board findByTitle(String title); // 제목으로 게시글을 조회하는 메서드 선언

  List<Board> findByTitleLike(String title); // 비슷한 제목으로 검색
}
