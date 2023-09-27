package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import javax.servlet.http.HttpSession;

import board.*;
import member.AuthInfo;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@GetMapping("/boardForm")
	public String handleBoardRegister(Model model, HttpSession session) {
		model.addAttribute("boardRequest", new BoardRequest());
		return "board/boardForm";
	}
	
	@PostMapping("/boardSuccess")
	public String hadleBoardSuccess(BoardRequest br, Errors errors) {
		new BoardRequestValidator().validate(br, errors);
		if(errors.hasErrors()) {
			return "board/boardForm";
		}
		try {
			boardService.regist(br);
			return "board/boardSuccess";
		} catch(NoAuthInfoException en) {
			errors.reject("NoAuthInfo");
			return "redirect:/login/loginForm";
		}
	}
}
