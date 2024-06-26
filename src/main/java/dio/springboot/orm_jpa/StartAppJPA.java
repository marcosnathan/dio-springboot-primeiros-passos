package dio.springboot.orm_jpa;

import dio.springboot.orm_jpa.model.User;
//import dio.springboot.orm_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class StartAppJPA  implements CommandLineRunner {

    //@Autowired
    //private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        //List<User> users1 = userRepository.findByNameContaining("NATHAN");
       // List<User> users = userRepository.filtrarPorNome("NATHAN");
      /*  for (User u : users1) {
            System.out.println(u);
        }
        for (User u : users) {
            System.out.println(u);
        }*/
    }
}
