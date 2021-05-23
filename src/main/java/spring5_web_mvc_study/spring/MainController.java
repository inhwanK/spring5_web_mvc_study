package spring5_web_mvc_study.spring;

import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {
	@RequestMapping
	public String main() {
		return "main";
	}
}
