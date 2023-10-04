package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import java.util.List;

import board.*;

@Controller
public class MainController {
	
	@Autowired
	private BoardService boardService;
	
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@RequestMapping("/main")
	public String main(Model model) {
		List<BoardList> boardList = boardService.list();
		model.addAttribute("boardList", boardList);
		return "main";
	}

}
