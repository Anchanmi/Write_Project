package member;

public class AuthInfo {
	private String id;
	private String nickname;
	private String name;
	
	public AuthInfo(String id, String nickname, String name) {
		this.id = id;
		this.nickname = nickname;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public String getName() {
		return name;
	}
}
