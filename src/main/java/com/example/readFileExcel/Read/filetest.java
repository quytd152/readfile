package com.example.readFileExcel.Read;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class filetest {
    public static void main(String[] args) throws IOException {

        String fileName = "fromtmp/MAUHD - Copy.xls";
        FileInputStream excelFile = new FileInputStream(new File(fileName));
        Workbook workbook = new HSSFWorkbook(excelFile);
        Sheet datatypeSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = datatypeSheet.iterator();
//        System.out.println(datatypeSheet.getRow(2).getCell(4).getStringCellValue().replace("Địa chỉ (Address): ",""));
//        System.out.println(datatypeSheet.getRow(3).getCell(4).getStringCellValue().substring(17,35));
//        System.out.println(datatypeSheet.getRow(3).getCell(4).getStringCellValue().indexOf(" - Website:"));
//        System.out.println(datatypeSheet.getRow(3).getCell(4).getStringCellValue().substring(43,62));
//        System.out.println(datatypeSheet.getRow(3).getCell(4).getStringCellValue().substring(72,84));
//        DataInformation dataInformation = new DataInformation(datatypeSheet.getRow(0).getCell(4).getStringCellValue(),
//                datatypeSheet.getRow(1).getCell(4).getStringCellValue(),
//                datatypeSheet.getRow(2).getCell(4).getStringCellValue().replace("Địa chỉ (Address): ",""),
//                datatypeSheet.getRow(3).getCell(4).getStringCellValue().substring(17,35),
//                datatypeSheet.getRow(3).getCell(4).getStringCellValue().substring(43,62),
//                datatypeSheet.getRow(3).getCell(4).getStringCellValue().substring(72,84),
//                datatypeSheet.getRow(4).getCell(4).getStringCellValue().replace("Mã số thuế (Tax code): ","")
//        );


//        DataTitle dataTitle = new DataTitle(datatypeSheet.getRow(5).getCell(12).getStringCellValue().replace("Mẫu số (Book No.): ",""),
//                datatypeSheet.getRow(6).getCell(12).getStringCellValue().replace("Ký hiệu (Serial No.): ",""),
//                datatypeSheet.getRow(6).getCell(7).getStringCellValue(),
//                datatypeSheet.getRow(8).getCell(7).getStringCellValue(),
//                datatypeSheet.getRow(7).getCell(12).getStringCellValue().replace("Số (Inv No.): ",""),
//                datatypeSheet.getRow(9).getCell(7).getStringCellValue().replace("Liên 1 (1st Copy): ",""),
//                datatypeSheet.getRow(10).getCell(7).getStringCellValue().replace("Ngày (Date):  ",""),
//                datatypeSheet.getRow(10).getCell(12).getStringCellValue().replace("Số tham chiếu (Ref No.): ",""),
//                datatypeSheet.getRow(11).getCell(12).getStringCellValue().replace("Số LXH (SO No.): ","")
//        );
//        System.out.println(dataTitle);
        DecimalFormat df = new DecimalFormat("#.##");

        DataSign dataSign = new DataSign(
                datatypeSheet.getRow(42).getCell(1).getStringCellValue().replace("(Ký, ghi rõ họ tên)",""),
                datatypeSheet.getRow(42).getCell(8).getStringCellValue().replace("(Ký, ghi rõ họ tên)",""),
                datatypeSheet.getRow(42).getCell(11).getStringCellValue().replace("(Ký, đóng dấu, ghi rõ họ tên)","")
        );
        DataPay dataPay = new DataPay(
                datatypeSheet.getRow(37).getCell(0).getStringCellValue().replace("Thông tin thanh toán (Payment instruction): ",""),
                datatypeSheet.getRow(38).getCell(0).getStringCellValue().replace("Tài khoản thanh toán (Bank account No.): ",""),
                datatypeSheet.getRow(39).getCell(0).getStringCellValue().replace("Hạn thanh toán (Payment term): ","")
        );
        System.out.println(dataPay);
    }
}
