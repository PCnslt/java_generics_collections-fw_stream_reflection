package com.pcnslt;

import lombok.Data;

@Data
public class Windows extends AbstractComputer {

    public Windows(String region) {
        super(region);
        setOsName("Windows");
    }

    @Override
    public void boot() {
        System.out.println("Booting Windows...");
    }

    // Windows-specific methods
    public void runPowerShell(String script) {
        System.out.println("Running PowerShell script...");
    }
}