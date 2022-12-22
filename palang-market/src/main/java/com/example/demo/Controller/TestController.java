package com.example.demo.Controller;

import ch.qos.logback.classic.Logger;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final ch.qos.logback.classic.Logger logger = (Logger) LoggerFactory.getLogger(TestController.class);

	/*
	 * private final TestService testService;
	 * 
	 * @GetMapping("/test") public String test() { List<TestVo> list =
	 * testService.getAllUserList(); System.out.println(list);
	 * logger.info("{} => {}", "list", list); return "test"; }
	 */

    @GetMapping("/hello")
    public String hello(String name, Model model) {
        //http://localhost:8080/hello?name=karim
        model.addAttribute("name", name);
        logger.info("{} => {}", "name", name);
        //html 이름
        return "hello";
    }
}
