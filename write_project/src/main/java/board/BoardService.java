package board;

import java.time.LocalDateTime;

public class BoardService {
	
	private BoardDao boardDao;
	
	public BoardService(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	public void regist(BoardRequest br) {
		
		if(br.getNickname() == null) {
			throw new NoAuthInfoException();
		}
		
		Board newBoard = new Board(br.getSubject(), br.getContent(), br.getNickname(),
									0, LocalDateTime.now());
		boardDao.insert(newBoard);
		
	}
}
