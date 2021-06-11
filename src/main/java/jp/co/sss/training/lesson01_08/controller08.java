package jp.co.sss.training.lesson01_08;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.training.form.LoginForm;

@Controller
public class controller08 {

	@RequestMapping("/lesson01_08/login")
	public String login() {
		return "lesson01_08/login";
	}

	@RequestMapping(path = "/lesson01_08/login", method = RequestMethod.POST)
	public String doLogin(LoginForm loginForm) {
		String userId = loginForm.getUserId();
		String password = loginForm.getPassword();
		if (userId != null && userId.length() > 0 && userId.equals(password)) {
			return "lesson01_08/top";
		} else {
			return "lesson01_08/login";
		}
	}

	@RequestMapping("/lesson01_08/top")
	public String top() {
		return "lesson01_08/top";
	}
}
