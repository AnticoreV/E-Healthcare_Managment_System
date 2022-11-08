//package sapronov.security;
//
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//
//@Service
//public class UserDetailServiceImpl implements UserDetailsService {
//    PatientService userService = new PatientService();
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        for(int i = 0; i < patientService.getUsersCount(); i++){
//            if(userService.findUser(i).getUser_name() == username){
//                //new ArrayList : roles with permissions
//                return new User(username, userService.findUser(i).getPassword(), new ArrayList<>());
//            }
//        }
//        throw new UsernameNotFoundException(username);
//    }
//}
