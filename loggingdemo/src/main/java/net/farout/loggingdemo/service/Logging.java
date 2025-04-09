package net.farout.loggingdemo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class Logging {
    private static final Logger log = LogManager.getLogger(Logging.class);

    public void doSomething() {
        log.info("Service method started.");
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            log.error("Something went wrong!", e);
        }
        log.info("Service method finished.");
    }
}
