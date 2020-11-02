package kr.co.june.eatgo.interfaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(value = "/t1", method = RequestMethod.GET)
    public String testJSP() {
        System.out.println(">>>>> controller");
        return "/admin/201834-364669";
    }

    @RequestMapping(value = "/t2", method = RequestMethod.GET)
    public String testRun() {
        System.out.println("테스트 RUN");
        return "Hello";
    }

}
