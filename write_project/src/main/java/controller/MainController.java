package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/main/{id}") //글 내용 보기
	public String content(@PathVariable("id") int id, Model model) {
		Board board = boardService.content(id);
		model.addAttribute("board", board);
		return "main/content";
	}

}
