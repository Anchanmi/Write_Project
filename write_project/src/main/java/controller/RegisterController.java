package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import member.*;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private MemberRegisterService memberRegisterService;
	
	public void setMemberRegisterService(MemberRegisterService memberRegisterService) {
		this.memberRegisterService = memberRegisterService;
	}

	@GetMapping("/registerPage")
	public String handleRegister() {
		return"register/registerPage";
	}
	
	@GetMapping("/registerComplete")
	public String handleComplete(RegisterRequest regReq) {
		try {
			memberRegisterService.regist(regReq);
			return "register/registerComplete";
		} catch(DuplicateMemberException ex) {
			return "register/registerPage";
		}
		
	}
}
