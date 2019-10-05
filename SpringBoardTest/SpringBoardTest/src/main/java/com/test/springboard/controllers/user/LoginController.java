package com.test.springboard.controllers.user;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.test.springboard.services.user.LoginService;

import com.test.springboard.vo.user.UserVO;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/login.do")
@SessionAttributes({"user_id", "user_passwd"})
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;

	
	@RequestMapping(method = RequestMethod.GET)
	public String getHome(Model model) {
		logger.info("Login.do Called : GET");
		
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String postHome(UserVO userVO, Model model) {
		logger.info("Login.do Called : Post" + userVO.getUser_id() + userVO.getUser_name());
		loginService.getUser(userVO);
		

		return "login";
	}
	
}
