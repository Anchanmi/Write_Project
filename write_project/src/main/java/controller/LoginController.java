package controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;

import member.*;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private AuthService authService;
	
	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}
	
	@GetMapping
	public String form(LoginCommand loginCommand) {
		return "login/loginForm";
	}
	
	@PostMapping
	public String submit(LoginCommand loginCommand, Errors errors, HttpSession session) {
		new LoginCommandValidator().validate(loginCommand, errors);
		if(errors.hasErrors()) {
			return "login/loginForm";
		}
		try {
			AuthInfo authInfo = authService.authenticate(loginCommand.getId(), loginCommand.getPassword());
			session.setAttribute("authInfo", authInfo);
			return "login/loginSuccess";
		}catch(WrongIdPasswordException e) {
			errors.reject("passwordNotMatching");
			return "login/loginForm";
		}catch(NotMemberException e) {
			errors.reject("NoMember");
			return "login/loginForm";
		}
	}
}
