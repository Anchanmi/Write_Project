package board;

import java.time.LocalDateTime;
import member.AuthInfo;
import javax.servlet.http.HttpSession;

public class BoardService {
	
	private BoardDao boardDao;
	public HttpSession session;
	
	public BoardService(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	public void regist(BoardRequest br) {
		AuthInfo authInfo = (AuthInfo) session.getAttribute("authInfo");
		
		if(authInfo == null) {
			throw new NoAuthInfoException();
		}
		
		Board newBoard = new Board(br.getSubject(), br.getContent(), authInfo.getNickname(),
									0, LocalDateTime.now());
		boardDao.insert(newBoard);
		
	}
}
