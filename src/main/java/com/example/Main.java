package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExcelReader reader = new ExcelReader();
        String filePath = "C:/Users/barmy/OneDrive/!!!Systementor/Kurser/Data Enginner/Programmering inom Data Platform development - STI\\Dag 13b Datarensning och Transformation med Java TODO/JavaCleaning/demo/src/main/java/com/example/Customer Call List - Cleaned.xlsx";
        List<Customer> customers = reader.readExcelFile(filePath);

        for (Customer customer : customers) {
            System.out.println(customer.getFirstName());
        }
    }
}