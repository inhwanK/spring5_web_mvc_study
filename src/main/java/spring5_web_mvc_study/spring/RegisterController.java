package spring5_web_mvc_study.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private MemberRegisterService memberRegisterService;
	
	@RequestMapping("/step1")
	public String handleStep1() {
		return "register/step1";
	}

	@PostMapping("/step2")
	public String handleStep2(@RequestParam(value = "agree", defaultValue = "false") Boolean agree, Model model) {
		if (!agree) {
			return "register/step1";
		}
		model.addAttribute("registerRequest", new RegisterRequest());
		return "register/step2";
	}
	
//	@GetMapping("/step3")
//	public String handleStep2Get() {
//		return "redirect:/register/step3";
//	}
	
	@PostMapping("/step3")
	public String handleStep3(@ModelAttribute("registerRequest") RegisterRequest regReq) {
		try {
		memberRegisterService.regist(regReq);
		return "register/step3";
		} catch (DuplicateMemberException ex) {
			return "register/step2";
		}
	}

}
