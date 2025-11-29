package org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._02_library;

import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._02_library.controller.BorrowController;
import org.java_fundamentals._11_layeredArchitecture._01_mvcFileBasedArchitecture._02_library.service.BorrowService;

public class Main {
    public static void main(String[] args) {
        BorrowController borrowController = new BorrowController();

        borrowController.menu();
    }
}
