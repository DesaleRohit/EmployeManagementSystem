package com.rohit.employemanagementsystem;

import java.io.File;

public class Employee_Remove {
    public void removeFile(String ID) {
        File file = new File("file"+ID+".txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Employee has been removed Successfully");
            }
        } else {
            System.out.println("Employee does not exists :( ");
        }
    }
}
