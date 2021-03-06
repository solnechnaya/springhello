package hello;

import hello.model.User;
import hello.model.Username;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @CrossOrigin(origins = "*")
    @RequestMapping("/user")
    public User index() {
        return new User();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/username")
    public Username name() {
        return new Username();

    }
    
}
