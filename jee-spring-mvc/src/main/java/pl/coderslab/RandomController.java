package pl.coderslab;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Slf4j
@Controller
public class RandomController {

    @ResponseBody
    @GetMapping("/show-random")
    public String showRandom(){
        Random random = new Random();
        int rd = random.nextInt(101);
        log.info("Request came to /show-random endpoint");
        return "Wylosowano liczbę: " + rd;
    }
}
