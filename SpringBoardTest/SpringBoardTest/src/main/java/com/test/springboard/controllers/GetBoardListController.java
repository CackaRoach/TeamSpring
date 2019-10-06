package com.test.springboard.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.test.springboard.services.BoardService;
import com.test.springboard.vo.UserVO;


@Controller
@RequestMapping("/getBoardList.do")
@SessionAttributes({"userVO"})
public class GetBoardListController {
	
	private static final Logger logger = LoggerFactory.getLogger(GetBoardListController.class);
	
	@Autowired
	private BoardService boardService;

	@ModelAttribute("userVO")
	public UserVO userVO() {
		UserVO userVO = new UserVO();
		return userVO;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String showGetBoardList(@ModelAttribute("userVO") UserVO userVO, Model model) {
		logger.info("Call : GetBoardList - GET NAME: " + userVO.getName());
		
		if(userVO.getId() == null) {
			return "redirect:login.do";
		} else {
			model.addAttribute("boardList", boardService.getBoardList());
		}
		
		
		return "boardList";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String getBoardList(@ModelAttribute("userVO") UserVO userVO, Model model) {
		logger.info("Call : GetBoardList - POST");

		
		return "boardList";
	}
}
