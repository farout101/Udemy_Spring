package net.farout.loggingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.LogManager;

@SpringBootApplication
public class LoggingdemoApplication {

    public static void main(String[] args) {
        LogManager.getLogManager().reset();
        java.util.logging.Logger rootLogger = java.util.logging.LogManager.getLogManager().getLogger("");
        rootLogger.setLevel(java.util.logging.Level.OFF);

        SpringApplication.run(LoggingdemoApplication.class, args);
    }

}
