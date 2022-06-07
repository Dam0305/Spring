package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //localhost:8080으로 접속하면 출력
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
