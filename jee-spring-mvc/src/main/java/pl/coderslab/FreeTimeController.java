package pl.coderslab;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

@Slf4j
@Controller
public class FreeTimeController {

    @ResponseBody
    @GetMapping("/free-time")
    public String freeTime() {
        log.info("Request came to /free-time endpoint");
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        //LocalDateTime localDateTime = LocalDateTime.of(2024,4,30,10,0,0);
        Random random = new Random();
        int randomDays = random.nextInt(1000);
        int randomSeconds = random.nextInt(86400);
        LocalDateTime localDateTime = localDateTimeNow.plusDays(randomDays).plusSeconds(randomSeconds);
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        LocalTime timeNow = localDateTime.toLocalTime();


        if (dayOfWeek == DayOfWeek.SUNDAY || dayOfWeek == DayOfWeek.SATURDAY) {
            return localDateTime + ": Wolne";
        } else if (timeNow.isAfter(LocalTime.of(9, 0)) && timeNow.isBefore(LocalTime.of(17, 0))) {
            return localDateTime + ": Pracuje, nie dzwon";
        } else {
            return localDateTime + ": Po pracy";
        }

    }


}
