package com.test.springboard.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.test.springboard.vo.BoardVO;

@Mapper
public interface BoardDAO {
	// Board CRUD
	public void addBoard(BoardVO boardVO);
	public void deleteBoard(BoardVO boardVO);
	public ArrayList<BoardVO> getBoardList();
	public BoardVO getBoardDetail(int idx);
	public void updateBoard(BoardVO boardVO);
}
