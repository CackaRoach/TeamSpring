package com.test.springboard.services.board.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springboard.dao.user.UserDAO;

import com.test.springboard.services.user.LoginService;

import com.test.springboard.vo.user.UserVO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public UserVO getUser(UserVO userVO) {
		System.out.println(userVO.getUser_id());
		return userDAO.searchUser(userVO);
	}

}
