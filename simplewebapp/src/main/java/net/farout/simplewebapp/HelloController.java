package net.farout.simplewebapp;

import net.farout.simplewebapp.model.MachineDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    @GetMapping("")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/machine-info")
    public MachineDetail getMachineDetails() {
        Runtime runtime = Runtime.getRuntime();
        String os = System.getProperty("os.name");
        String architecture = System.getProperty("os.arch");
        int processors = runtime.availableProcessors();
        long freeMemory = runtime.freeMemory();
        long totalMemory = runtime.totalMemory();
        String hostname = "unknown";
        String ip = "unknown";

        try {
            InetAddress addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
            ip = addr.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace(); // optional logging
        }

        return new MachineDetail(
                os,
                architecture,
                processors,
                freeMemory,
                totalMemory,
                hostname,
                ip
        );
    }

}
