package org.java_fundamentals._09_composition._06_computerAndComponents;

public class CPU {
    private String cpuInfo;

    public CPU(String cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public String getCpuInfo() {
        return cpuInfo;
    }

    public void setCpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public void showCpuInfo(){
        System.out.println("CPU: " + cpuInfo);

    }
}
