package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.RegisterController;
import controller.LoginController;
import controller.LogoutController;

@Configuration
public class ControllerConfig {

	@Bean
	public RegisterController registerController() {
		return new RegisterController();
	}
	
	@Bean
	public LoginController loginController() {
		return new LoginController();
	}
	
	@Bean
	public LogoutController logoutController() {
	return new LogoutController();
	}
}
