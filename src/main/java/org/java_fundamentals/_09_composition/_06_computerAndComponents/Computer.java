package org.java_fundamentals._09_composition._06_computerAndComponents;

public class Computer {
    CPU cpu;
    RAM ram;
    GraphicsCard graphicsCard;

    public Computer(CPU cpu, RAM ram, GraphicsCard graphicsCard) {
        this.cpu = cpu;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
    }

    public void displaySpecs(){
        System.out.println("Computer Specifications:");
        cpu.showCpuInfo();
        ram.showRamInfo();
        graphicsCard.showGraphicsCardInfo();
    }
}
