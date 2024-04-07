package pl.coderslab.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class HelloController {

//    // below is replaced by @Slf4j annotation
//    private final static Logger log = LoggerFactory.getLogger(HelloController.class.getName());

    @ResponseBody
    @GetMapping("/hello")
    public String helloWorld(){
        log.info("Request came to /hello endpoint");
        return "Hello World";
    }

    @GetMapping("/helloView")
    public String helloWorldView() {
        log.info("Request came to /helloView endpoint");
        return "home";
    }


}
