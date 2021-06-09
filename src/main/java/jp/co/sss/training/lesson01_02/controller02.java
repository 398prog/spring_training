package jp.co.sss.training.lesson01_02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller02 {

	@RequestMapping("lesson01_02/before")
    public String before() {
        return "lesson01_02/before";
    }

	@RequestMapping("lesson01_02/forward")
    public String after() {
        return "lesson01_02/after";
    }

}
