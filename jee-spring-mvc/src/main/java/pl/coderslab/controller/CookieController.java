package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

    @RequestMapping("/setcookie/{value1}/{value2}")
    @ResponseBody
    public String setCookie(HttpServletResponse response, @PathVariable String value1, @PathVariable String value2) {
        Cookie cookie1 = new Cookie("cookie1", value1);
        Cookie cookie2 = new Cookie("cookie2", value2);
        cookie1.setPath("/");
        cookie2.setPath("/");
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        return "setCookies";
    }

    @RequestMapping("/getcookies")
    @ResponseBody
    public String getCookie(@CookieValue("cookie1") String cookie1, @CookieValue("cookie2") String cookie2) {
//        Cookie c1 = WebUtils.getCookie(req, "cookie1");
//        Cookie c2 = WebUtils.getCookie(req, "cookie2");
        return "cookie C1: " + cookie1 + ", cookie C2: " + cookie2;
    }
}
