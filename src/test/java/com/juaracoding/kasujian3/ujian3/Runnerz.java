package com.juaracoding.kasujian3.ujian3;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 28/04/2024 22:18
@Last Modified 28/04/2024 22:18
Version 1.0
*/
import org.testng.TestNG;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Runnerz {
    public static void main(String[] args) {
        //Inputan dari user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan banyaknya looping untuk testing: ");
        int looping = scanner.nextInt();
        System.out.print("Masukkan path untuk report Testing Suite: ");
        String reportPath = scanner.next();
        System.out.print("Masukkan path file suite xml: ");
        String suiteFilePath = scanner.next();
        // Proses Testing
        for (int i = 0; i < looping; i++) {
            TestNG runner = new TestNG();
            String outputDirectory = reportPath + "Test ke " + (i + 1);
            runner.setOutputDirectory(outputDirectory);
            List<String> suiteFiles = new ArrayList<>();
            suiteFiles.add(suiteFilePath);
            runner.setTestSuites(suiteFiles);
            runner.run();
        }
        scanner.close(); // Menutup Scanner selesai digunakan
    }
}
