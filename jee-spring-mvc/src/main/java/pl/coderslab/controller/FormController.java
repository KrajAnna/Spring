package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.random.RandomGenerator;

@Controller
@RequestMapping("/first")
public class FormController {

    @GetMapping("/form")
    public String hello() {
        return "/form.jsp";
    }

    @PostMapping("/form")
    @ResponseBody
    public String form(@RequestParam String paramName, @RequestParam String paramDate){
        try {
            return paramName + " " + LocalDate.parse(paramDate);
        } catch (Exception e) {
            return "niepoprawny format daty";
        }
    }


}
