package jp.co.sss.training.lesson01_05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller05 {

	@RequestMapping(path = "lesson01_05/form",method = RequestMethod.GET)
	public String form() {
		return "lesson01_05/form";
	}

	@RequestMapping(path = "lesson01_05/doform",method = RequestMethod.GET)
	public String doform(String message) {
		System.out.println("メッセージ："+message);
		return "lesson01_05/form";
	}

}
