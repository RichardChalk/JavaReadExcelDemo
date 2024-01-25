package com.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {

  public List<Customer> readExcelFile(String filePath) {
    List<Customer> dataList = new ArrayList<>();

    try (FileInputStream fis = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fis)) {

      Sheet sheet = workbook.getSheetAt(0);

      for (Row row : sheet) {
        // Skapa ett objekt av Customer för varje rad och lägg till i dataList
        Customer customer = new Customer();
        customer.setFirstName(row.getCell(1).getStringCellValue());
        // customer.setEmail(row.getCell(1).getStringCellValue());
        // Sätt andra fält baserat på cellvärden
        dataList.add(customer);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    return dataList;
  }
}
