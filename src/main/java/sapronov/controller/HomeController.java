package sapronov.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    @PreAuthorize("USER")
    public String home(){
        return "Hello";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Hello Admin";
    }
}
