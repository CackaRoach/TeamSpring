package com.test.springboard.services;


import java.util.ArrayList;

import com.test.springboard.vo.BoardVO;

public interface BoardService {
	public void addBoard(BoardVO boardVO);
	public void deleteBoard(BoardVO boardVO);
	public ArrayList<BoardVO> getBoardList();
	public BoardVO getBoardDetail(int idx);
	public void updateBoard(BoardVO boardVO);
}
