package com.pcnslt;

import lombok.Data;

import java.util.UUID;


@Data
public abstract class AbstractComputer implements Computer {
    private final UUID compId;
    private String region;
    private String osName;
    private double ramSize;
    private double cpuSize;

    public AbstractComputer(String region) {
        this.compId = UUID.randomUUID();
        this.region = region;
    }

//    // Getters and setters
//    @Override
//    public String getRegion() {
//        return region;
//    }
//
//    @Override
//    public UUID getCompId() {
//        return compId;
//    }
//
//    public String getOsName() {
//        return osName;
//    }
//
//    public void setOsName(String osName) {
//        this.osName = osName;
//    }
//
//    public double getRamSize() {
//        return ramSize;
//    }
//
//    public void setRamSize(double ramSize) {
//        this.ramSize = ramSize;
//    }
//
//    public double getCpuSize() {
//        return cpuSize;
//    }
//
//    public void setCpuSize(double cpuSize) {
//        this.cpuSize = cpuSize;
//    }
//
//    public void setRegion(String region) {
//        this.region = region;
//    }

    // Abstract method for OS-specific behavior
    public abstract void boot();
}