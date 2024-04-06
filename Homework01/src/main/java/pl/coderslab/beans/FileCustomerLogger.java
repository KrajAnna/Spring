package pl.coderslab.beans;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.coderslab.CustomerLogger;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Component
@Primary
public class FileCustomerLogger implements CustomerLogger {

    private String filename = "log.txt";

//    public FileCustomerLogger(String filename){
//        this.filename = filename;
//    }

    @Override
    public void log() {
        String logMessage = LocalDateTime.now() + ": customer operation logged";
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.write(logMessage + "\n");
            writer.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void log(String operation, boolean success) {

    }
}
