package member;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

public class RegisterRequest {

	@NotBlank
	@Size(min = 2)
	private String nickname;
	
	@NotBlank
	@Size(min = 6)
	private String id;
	
	@NotBlank
	@Size(min = 6)
	private String password;
	private String confirmPassword;
	private String name;
	private String email;
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	public String getConfirmPassword() {
		return confirmPassword;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public boolean isPasswordEqualToConfirmPassword() {
		return password.equals(confirmPassword);
	}
}

