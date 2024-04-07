package pl.coderslab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@SessionAttributes("loginStart")
public class SessionController {
    @GetMapping("/checkSession")
    public String checkSession(HttpSession session){
        LocalDateTime loginStart = (LocalDateTime) session.getAttribute("loginStart");

        if (loginStart == null){
            session.setAttribute("loginStart", LocalDateTime.now());
            return "session start time set to now";
        }
        return "Session start time: " + loginStart;

    }

}
