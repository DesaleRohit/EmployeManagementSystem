package com.rohit.employemanagementsystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Employe_Add {

    public void createFile() {
        EmployDetail emp = new EmployDetail();
        emp.getInfo(); // Gather employee details

        String fileName = "file" + emp.employ_id + ".txt";
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("\nEmployee already exists :)");
            System.out.println("\nPress Enter to Continue...");
            try {
                System.in.read(); // simple way to pause until Enter is pressed
            } catch (IOException ignored) {}
            return;
        }

        // File creation and writing using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Employee ID       : " + emp.employ_id + "\n");
            writer.write("Employee Name     : " + emp.name + "\n");
            writer.write("Father's Name     : " + emp.father_name + "\n");
            writer.write("Contact Number    : " + emp.employ_contact + "\n");
            writer.write("Email             : " + emp.email + "\n");
            writer.write("Position          : " + emp.position + "\n");
            writer.write("Salary            : " + emp.employ_salary + "\n");

            System.out.println("Employee file created successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }
    }
}
