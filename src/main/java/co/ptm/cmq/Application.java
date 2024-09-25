package co.ptm.cmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    static final String qName = "DEV.QUEUE.1"; // A queue from the default MQ Developer container config


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
