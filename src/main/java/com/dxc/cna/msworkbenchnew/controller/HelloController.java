package $packagename;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/greet")
    public String index() {
        return "Congratulations!! DXC Cloud Native Starter Project is generated successfully!!Click on https://github.com/rituparnacse/Git.git to download your source code and enhance it. "; //"Greetings from Spring Starter Project !";
    }

}
