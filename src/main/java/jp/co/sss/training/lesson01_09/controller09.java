package jp.co.sss.training.lesson01_09;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.training.form.LoginForm;

@Controller
public class controller09 {

	@RequestMapping("/lesson01_09/login")
	public String login() {
		return "lesson01_09/login";
	}

	@RequestMapping(path = "/lesson01_09/dologin", method = RequestMethod.POST)
	public String doLogin(LoginForm loginForm,HttpSession session) {
		String userId = loginForm.getId();
		String password = loginForm.getPass();

		if (userId.equals("taro") && password.equals("123")) {
			session.setAttribute("userId", userId);
			return "redirect:/lesson01_09/top";
		} else {
			return "lesson01_09/login";
		}
	}

	@RequestMapping("/lesson01_09/top")
	public String top() {
		return "lesson01_09/top";
	}

	@RequestMapping("/lesson01_09/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "lesson01_09/top";
	}
}
