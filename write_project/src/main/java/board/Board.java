package board;

import java.time.LocalDateTime;

public class Board {

	private int id;
	private String subject;
	private String content;
	private String nickname;
	private int views;
	private LocalDateTime write_time;
	
	public Board(String subject, String content, String nickname, int views, LocalDateTime write_time) {
		this.subject = subject;
		this.content = content;
		this.nickname = nickname;
		this.views = views;
		this.write_time = write_time;
	}
	
	public void setId(int id) {
		this.id = id;
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
