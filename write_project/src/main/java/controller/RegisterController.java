package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@GetMapping("/registerPage")
	public String handleRegister() {
		return"register/registerPage";
	}
}
