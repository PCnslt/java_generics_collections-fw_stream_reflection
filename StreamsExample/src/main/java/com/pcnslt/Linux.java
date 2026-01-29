package com.pcnslt;

import lombok.Data;

@Data
public class Linux extends AbstractComputer {

    public Linux(String region) {
        super(region);
        setOsName("Linux");
    }

    @Override
    public void boot() {
        System.out.println("Booting Linux with systemd...");
    }

    // Linux-specific methods
    public void runBashCommand(String command) {
        System.out.println("Executing: " + command);
    }
}