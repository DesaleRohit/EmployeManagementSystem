package com.rohit.employemanagementsystem;

import java.io.File;
import java.util.Scanner;

public class Employee_Show {
    public void viewFile(String s) throws Exception{
        File file = new File("file"+s+".txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine())
        {
            System.out.println(scanner.nextLine());
        }
    }
}
