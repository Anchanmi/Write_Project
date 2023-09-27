package board;

public class BoardRequest { //커맨드 객체

	private String subject;
	private String content;
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
}
