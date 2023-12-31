package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.*;

@Configuration
public class ControllerConfig {
	
	@Bean
	public MainController mainController() {
		return new MainController();
	}

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
	
	@Bean
	public BoardController boardController() {
		return new BoardController();
	}
}
