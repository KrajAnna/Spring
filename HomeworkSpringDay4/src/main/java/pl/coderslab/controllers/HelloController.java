package pl.coderslab.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
public class HelloController {
    private String filePath = "Workers.txt";

    @GetMapping("/workers")
    public String workersAction(Model model) {
        Random random = new Random();
        int rd = random.nextInt(30) + 1;
        model.addAttribute("worker", findName(rd));
        model.addAttribute("number", rd);
        return "workers";
    }

    public Map<Integer, String> readFile() {
        Map<Integer, String> namesList = new HashMap<>();
        try {
            Files.lines(Path.of(filePath))
                    .map(line -> line.split(", "))
                    .filter(lineParts -> lineParts.length == 2)
                    .forEach(lineParts -> {
                        int number = Integer.parseInt(lineParts[0]);
                        String name = lineParts[1];

                        namesList.put(number, name);
                    });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return namesList;
    }

    public String findName(int number) {
        return readFile().get(number);
    }
}
