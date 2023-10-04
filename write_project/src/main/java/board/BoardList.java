package board;

import java.time.LocalDateTime;

public class BoardList { //글 목록 객체

	private int id;
	private String subject;
	private String content;
	private String nickname;
	private int views;
	private LocalDateTime write_time;
	
	public BoardList(int id, String subject, String content, String nickname, int views, LocalDateTime write_time) {
		this.id = id;
		this.subject = subject;
		this.content = content;
		this.nickname = nickname;
		this.views = views;
		this.write_time = write_time;
	}
	
	public int getId() {
		return id;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public int getViews() {
		return views;
	}
	
	public LocalDateTime getWrite_time() {
		return write_time;
	}
}
