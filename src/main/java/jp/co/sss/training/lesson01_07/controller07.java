package jp.co.sss.training.lesson01_07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller07 {

	@RequestMapping(path = "lesson01_07/login",method = RequestMethod.GET)
	public String login() {
		return "lesson01_07/login";
	}

	@RequestMapping(path = "lesson01_07/doLogin",method = RequestMethod.POST)
	public String doLogin(String userId,String password) {
		if(userId.equals("123") && password.equals("123")) {
			return "lesson01_07/success";
		}else {
			return "lesson01_07/error";
		}
	}

}
