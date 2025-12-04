package org.java_fundamentals._09_composition._06_computerAndComponents;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CPU info: ");
        String cpuInfo = sc.nextLine();
        CPU cpu = new CPU(cpuInfo);

        System.out.print("Enter RAM info: ");
        String ramInfo = sc.nextLine();
        RAM ram = new RAM(ramInfo);

        System.out.print("Enter Graphics card info: ");
        String graphicsCardInfo = sc.nextLine();
        GraphicsCard graphicsCard = new GraphicsCard(graphicsCardInfo);

        Computer computer = new Computer(cpu,ram,graphicsCard);

        computer.displaySpecs();
    }
}
