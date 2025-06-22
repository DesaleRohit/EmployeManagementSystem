package com.rohit.employemanagementsystem;

import java.io.IOException;
import java.util.Scanner;

public class EmployeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee_Show employeeShow = new Employee_Show();
        MainMenu mainMenu = new MainMenu();
        mainMenu.menu();

        int choice;

        while (true) {
            System.out.println("Please Enter choice : ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input . Please enter a number.");
                continue;
            }
            switch (choice) {
                case 1:
                    new Employe_Add().createFile();
                    break;

                case 2:
                    System.out.println("Enter Employee ID : ");
                    try {
                        employeeShow.viewFile(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Enter Employee ID : ");
                    new Employee_Remove().removeFile(scanner.nextLine());
                    break;

                case 4:
                    System.out.println("Enter Employee ID : ");
                    String id = scanner.nextLine();
                    try {
                        employeeShow.viewFile(id);
                        Employee_update employeeUpdate = new Employee_update();

                        System.out.println("Enter the current detail to update : ");
                        String current = scanner.nextLine();

                        System.out.println("Enter the new value : ");
                        String updated = scanner.nextLine();

                        employeeUpdate.updateFile(id , current , updated);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 5:
                    new CodeExit().out();
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please choose between 1-5... ");
            }
        }
    }
}
