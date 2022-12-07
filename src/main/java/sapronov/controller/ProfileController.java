package sapronov.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sapronov.repository.AccountRepository;

@RestController
@RequestMapping("profile")
public class ProfileController {
    AccountRepository accountRepository;

    @GetMapping("main-info")
    public String getInfo(){
        accountRepository.findByLogin()
    }
}
