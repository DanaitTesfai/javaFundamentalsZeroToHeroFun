package org.java_fundamentals._09_composition._06_computerAndComponents;

public class RAM {
    private String ramInfo;

    public RAM(String ramInfo) {
        this.ramInfo = ramInfo;
    }

    public void showRamInfo(){
        System.out.println("RAM: " + ramInfo);
    }
}
