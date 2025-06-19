package com.rohit.employemanagementsystem;

import java.util.Scanner;

public class EmployDetail {
    String name;
    String father_name;
    String employ_id;
    String email;
    String position;
    String employ_contact;
    String employ_salary;

    public void getInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee's name : ");
        name = scanner.nextLine();

        System.out.println("Enter Employee's Father name : ");
        father_name = scanner.nextLine();

        System.out.println("Enter Employee's ID : ");
        employ_id = scanner.nextLine();

        System.out.println("Enter Employee's Em@il : ");
        email = scanner.nextLine();

        System.out.println("Enter Employee's Position : ");
        position = scanner.nextLine();

        System.out.println("Enter Employee's contact : ");
        employ_contact = scanner.nextLine();

        System.out.println("Enter Employee;s Salary : ");
        employ_salary = scanner.nextLine();
    }
}
