package com.pknu.backboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pknu.backboard.entity.Board;
import com.pknu.backboard.repository.BoardRepository;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class BackboardApplicationTests {

	@Autowired
	private BoardRepository boardRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testInsertJpa() {
		Board board1 = new Board();
		board1.setTitle("첫번째 게시글입니다."); // @Setter에서 자동으로 생성해주는 메서드
		board1.setContent("내용은 없습니다.");
		board1.setCreateDate(LocalDateTime.now()); // @CreatedDate에서 자동으로 생성해주는 메서드

		Board board2 = new Board();
		board2.setTitle("두번째 게시글입니다.");
		board2.setContent("내용은 또 없습니다.");
		board2.setCreateDate(LocalDateTime.now());

		this.boardRepository.save(board1); // save() 메서드를 통해 Board 엔티티를 저장 (INSERT실행)
		this.boardRepository.save(board2); // save() 메서드를 통해 Board 엔티티를 저장 (INSERT실행)
	}

	@Test // Select * 테스트
	void testSelectJpa() {
		List<Board> all = this.boardRepository.findAll(); // findAll() 메서드를 통해 모든 게시글을 조회
		// 테스트시 내가 기대하는 값과 현재 값이 같은지 확인메서드
		assertEquals(2, all.size()); // 게시글이 2개가 저장되어 있어야 함

		Board board = all.get(0); // 첫번째 게시글을 가져옴
		assertEquals("첫번째 게시글입니다.", board.getTitle()); // 첫번째 게시글의 제목이 맞는지 확인
	}

	@Test // SELECT FROM WHERE 테스트
	void testSelectOneJpa() {
		// Optional -> Null을 허용하는 객체
		Optional<Board> opBoard = this.boardRepository.findById(2L);
		if (opBoard.isPresent()) {
			Board board = opBoard.get();
			assertEquals("내용은 또 없습니다.", board.getContent()); // 게시글의 내용이 맞는지 확인
		}
	}

	@Test
	void testSelectByTitle() {
		Board board = this.boardRepository.findByTitle("두번째 게시글입니다.");
		assertEquals(2L, board.getBno()); // 게시글 번호가 2번인지 확인
	}

	@Test // SELECT FROM LIKE
	void testSelectByTitleLike() {
		List<Board> boards = this.boardRepository.findByTitleLike("%게시글%");
		assertEquals(6, boards.size()); // 제목이 "첫번째 게시글"로 시작하는 게시글이 1개인지 확인

		Board board = boards.get(0); // 첫번째 게시글을 가져옴
		assertEquals("첫번째 게시글입니다.", board.getTitle()); // 첫번째 게시글
	}

	@Test // 삭제
	void testDeleteLastOne() {
		assertEquals(4, boardRepository.count()); // 삭제 전 게시글 수 확인
		Optional<Board> opBoard = this.boardRepository.findById(1L);
		assertTrue(opBoard.isPresent()); // 게시글이 존재하는지 확인

		Board board = opBoard.get();
		this.boardRepository.delete(board); // 게시글 삭제
		assertEquals(4, boardRepository.count()); // 삭제 후 게시글 수 확인
	}
}
