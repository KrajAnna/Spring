package pl.coderslab.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.random.RandomGenerator;

@Slf4j
@Controller
public class MultiplyController {

    @GetMapping("/multiply")
    public String multiply(@RequestParam(defaultValue="10") String size, Model model) {
        log.info("Request came to /multiply endpoint");
        int sizeAtt = Integer.parseInt(size);
        model.addAttribute("rows", sizeAtt);
        model.addAttribute("cols", sizeAtt);

        return "table";
    }

    @GetMapping("/paramMultiply/{rows}/{cols}")
    public String multiply(Model model, @PathVariable String rows, @PathVariable String cols) {
        log.info("Request came to /paramMultiply/{rows}/{cols} endpoint");
        int rowsAtt = Integer.parseInt(rows);
        int colsAtt = Integer.parseInt(cols);
        model.addAttribute("rows", rowsAtt);
        model.addAttribute("cols", colsAtt);

        return "table";
    }
}
