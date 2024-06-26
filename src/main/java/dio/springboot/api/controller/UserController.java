package dio.springboot.api.controller;

import dio.springboot.api.model.Usuario;
import dio.springboot.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public List<Usuario> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Usuario usuario) {
        userRepository.save(usuario);
    }

    @PutMapping
    public void update(@RequestBody Usuario usuario) {
        userRepository.save(usuario);
    }

    @GetMapping("/{username}")
    public Usuario findUser(@PathVariable("username") String username) {
        return userRepository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        userRepository.deleteById(id);
    }
}
