package sapronov.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sapronov.entity.SecurityAccount;
import sapronov.repository.AccountRepository;

@Service
public class JpaUserDetailsService implements UserDetailsService {
    private final AccountRepository accountRepository;

    public JpaUserDetailsService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        return accountRepository.findByLogin(login)
                .map(SecurityAccount::new)
                .orElseThrow(()-> new UsernameNotFoundException("Account with this login not found"));
    }
}
