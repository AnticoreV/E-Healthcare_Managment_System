package sapronov.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "Hello";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Hello Admin";
    }
}
