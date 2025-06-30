package com.pknu.backboard.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter // Lombok을 사용하여 Getter와 Setter 메서드를 자동 생성
@Entity // JPA 엔티티로 지정(Board 테이블과 매핑)
public class Board {

  @Id // JPA에서 기본 키로 지정
  @GeneratedValue(strategy = GenerationType.SEQUENCE) // 기본 키 생성 전략을 시퀀스로 설정
  private Long bno; // Board 테이블의 PK, bno

  @Column(length = 250)
  private String title; // 게시글 제목

  @Column(length = 8000)
  private String content; // 게시글 내용

  @CreatedDate // JPA에서 엔티티 생성 시 자동으로 현재 시간을 설정
  @Column(updatable = false) // 수정 불가능한 컬럼으로 설정
  private LocalDateTime createDate; // 게시글 작성일

  @LastModifiedDate // JPA에서 엔티티 수정 시 자동으로 현재 시간을 설정
  private LocalDateTime modifyDate; // 게시글 수정일
}
