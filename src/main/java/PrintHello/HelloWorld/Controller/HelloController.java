package PrintHello.HelloWorld.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String PrintStatement(){
       return "hello spring boot";
    }
}
