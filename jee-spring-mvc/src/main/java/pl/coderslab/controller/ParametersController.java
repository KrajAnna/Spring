package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.random.RandomGenerator;

@Controller
public class ParametersController {
    @GetMapping("random/{max}")
    @ResponseBody
    public String randomMax(@PathVariable int max) {
        int random = RandomGenerator.getDefault().nextInt(1, max);
        return "Użytkownik podał wartość %s. Wylosowano liczbę: %s".formatted(max, random);
    }

    @GetMapping("random/{min}/{max}")
    @ResponseBody
    public String randomMinMax(@PathVariable int min, @PathVariable int max) {
        int random = RandomGenerator.getDefault().nextInt(min, max + 1);
        return "Użytkownik podał wartość %s. Wylosowano liczbę: %s".formatted(max, random);
    }

}
