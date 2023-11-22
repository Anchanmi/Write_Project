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
import member.*;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@GetMapping("/boardForm")
	public String handleBoardRegister(Model model) {
		model.addAttribute("boardRequest", new BoardRequest());
		return "board/boardForm";
	}
	
	@PostMapping("/boardSuccess")
	public String hadleBoardSuccess(BoardRequest br, Errors errors, HttpSession session) {
		new BoardRequestValidator().validate(br, errors);
		AuthInfo authInfo = (AuthInfo) session.getAttribute("authInfo");
		
		if(authInfo == null) {
			return "redirect:/login";
		}
		
		br.setNickname(authInfo.getNickname());
		
		if(errors.hasErrors()) {
			return "board/boardForm";
		}
		
		boardService.regist(br);
		return "board/boardSuccess";
		
	}
	
	@RequestMapping("/delete")
	public String handleDelete(Board board) {
		boardService.delete(board.getId());
		return "redirect:/main";
	}
}
