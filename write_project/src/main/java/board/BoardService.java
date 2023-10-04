package board;

import java.time.LocalDateTime;
import java.util.List;

public class BoardService {
	
	private BoardDao boardDao;
	
	public BoardService(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	public void regist(BoardRequest br) {
		
		Board newBoard = new Board(br.getSubject(), br.getContent(), br.getNickname(),
									0, LocalDateTime.now());
		boardDao.insert(newBoard);
		
	}
	
	public List<BoardList> list(){ //글 목록 보여주는 메소드
		List<BoardList> liB = boardDao.selectAll();
		return liB;
		
	}
	
	public List<Board> content(Board board){ //글 내용 보여주는 메소드
		List<Board> list = boardDao.selectById(board.getId());
		return list;
	}
}
