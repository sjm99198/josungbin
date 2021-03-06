package com.kite.mm.part.dao;

import java.util.List;
import com.kite.mm.part.domain.PartSelectRequest;
import com.kite.mm.part.domain.PartVo;
import com.kite.mm.part.domain.PartWriteRequest;

public interface PartDao {
	
	// 방명록에 글 데이터 입력
	public int insertArticle(PartWriteRequest request);
	// 게시글의 리스트
	public List<PartVo> selectArticleList(int startRow, int count);
	// 특정검색 리스트
	public int selectCount();
	// idx 값으로 한개의 게시물 받기
	public PartVo selectpartByIdx(int idx);
	
	/* 실험적 */
	// type값으로 한개의 게시물 받기
	public PartVo selectpartBytype(String type);
	public int selectingArticle(PartSelectRequest request);
	public List<PartSelectRequest> selectingList(int startRow, int count);
	// idx로 게시물 삭제select
	public int deleteselect(int idx);
	public int deleteAll();
	
	// idx 값으로 한개의 게시물의 데이터 수정
	public int editArticle(PartWriteRequest request);
	// idx로 게시물 삭제
	public int deleteArticle(int idx);
	
	
}










