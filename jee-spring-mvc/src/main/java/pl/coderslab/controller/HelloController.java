package pl.coderslab.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalTime;

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
    public String helloWorldView(Model model) {
        log.info("Request came to /helloView endpoint");

        LocalTime now = LocalTime.now();

        boolean isDaytime = now.isAfter(LocalTime.of(8, 0)) &&
                now.isBefore(LocalTime.of(20, 0));

//        // Use the following to test color change:
//        isDaytime = RandomGenerator.getDefault().nextBoolean();

        model.addAttribute("fontColor", isDaytime ? "black" : "white");
        model.addAttribute("backgroundColor", isDaytime ? "red" : "black");
        return "home";
    }


}
