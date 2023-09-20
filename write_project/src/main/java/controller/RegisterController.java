package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import javax.validation.Valid;

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
	public String handleRegister(Model model) {
		model.addAttribute("registerRequest", new RegisterRequest());
		return "register/registerPage";
	}
	
	@GetMapping("/registerComplete")
	public String handleComplete(@Valid RegisterRequest regReq, Errors errors) {
		new RegisterRequestValidator().validate(regReq, errors);
		if(errors.hasErrors()) {
			return "register/registerPage";
		}
		try {
			memberRegisterService.regist(regReq);
			return "register/registerComplete";
		} catch(DuplicateMemberException ex) {
			errors.rejectValue("nickname", "duplicate");
			return "register/registerPage";
		}
		
	}
}
