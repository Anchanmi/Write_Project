package member;

import java.time.LocalDateTime;

public class Member {

	private String nickname;
	private String id;
	private String password;
	private String name;
	private String email;
	private LocalDateTime register_day;
	
	public Member(String nickname, String id, String password, String name, 
			String email, LocalDateTime register_day) {
		this.nickname = nickname;
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.register_day = register_day;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	public LocalDateTime getRegister_day() {
		return register_day;
	}
}
