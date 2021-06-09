package jp.co.sss.training.lesson01_06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller06 {

	@RequestMapping(path = "lesson01_06/form",method = RequestMethod.GET)
	public String form() {
		return "lesson01_06/form";
	}

	@RequestMapping(path = "lesson01_06/doform",method = RequestMethod.POST)
	public String doform(String message) {
		System.out.println("メッセージ："+message);
		return "lesson01_06/form";
	}

}
