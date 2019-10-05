package com.test.springboard.services.user;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;

import com.test.springboard.vo.user.UserVO;

public interface LoginService {
	
	Log LOGGER = LogFactory.getLog(LoginService.class);
	
	public UserVO getUser(UserVO userVo);
}
