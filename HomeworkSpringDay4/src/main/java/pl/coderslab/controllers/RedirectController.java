package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {

    @GetMapping("/first")
    public String first(){
        return "first";
    }

    @GetMapping("/third")
    public String third(){
        return "third";
    }

    @GetMapping("/second")
    public String second(){
        return "redirect:/third";
    }
}
