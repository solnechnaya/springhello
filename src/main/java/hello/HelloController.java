package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/xxx")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/yyy")
    public String shmindex() {
        return "Привет from Spring Boot!";
    }
    
}
