package org.java_fundamentals._08_exceptions._01_concepts;

public class _07_FileReaderSimulation {
    public static void main(String[] args) {
        try {
            System.out.println("Opening file....");
            throw new Exception("File cannot be found.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("File closed.");
        }
    }
}
