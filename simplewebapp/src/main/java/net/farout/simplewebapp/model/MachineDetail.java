package net.farout.simplewebapp.model;

// MachineDetails.java
public class MachineDetail {
    private String os;
    private String architecture;
    private int availableProcessors;
    private long freeMemory;
    private long totalMemory;
    private String hostname;
    private String ip;

    // Getters and setters
    // Constructor with all fields


    public MachineDetail(String os, String architecture, int availableProcessors, long freeMemory, long totalMemory, String hostname, String ip) {
        this.os = os;
        this.architecture = architecture;
        this.availableProcessors = availableProcessors;
        this.freeMemory = freeMemory;
        this.totalMemory = totalMemory;
        this.hostname = hostname;
        this.ip = ip;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public int getAvailableProcessors() {
        return availableProcessors;
    }

    public void setAvailableProcessors(int availableProcessors) {
        this.availableProcessors = availableProcessors;
    }

    public long getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory(long freeMemory) {
        this.freeMemory = freeMemory;
    }

    public long getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(long totalMemory) {
        this.totalMemory = totalMemory;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
