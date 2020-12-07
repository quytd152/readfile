//package com.example.readFileExcel.Read;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.*;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.scheduling.annotation.Scheduled;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//import java.text.DecimalFormat;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class readFileE {
//    private static  String fileName = "";
//    public static void main(String[] args) {
//
//        try {
//            Files.move(Paths.get("D:\\cyber-job\\readFileExcel\\tmp\\MAUHD.xls"), Paths.get("D:\\cyber-job\\readFileExcel\\fromtmp\\MAUHD.xls"),StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
////        final File folder = new File("D:\\cyber-job\\readFileExcel\\tmp");
////
////        List<String> result = new ArrayList<>();
////
////        search(".*\\.xls", folder, result);
//
////        for (String s : result) {
////            fileName = s;
////            try {
////
////                FileInputStream excelFile = new FileInputStream(new File(fileName));
////                Workbook workbook = new HSSFWorkbook(excelFile);
////                Sheet datatypeSheet = workbook.getSheetAt(0);
////                Iterator<Row> iterator = datatypeSheet.iterator();
////                int i = 0;
////                DecimalFormat df = new DecimalFormat("#.##");
////
////                String returnValueTenQCHHDV = "";
////                String returnValueStt = "";
////                String returnValueMH = "";
////                String returnValueDVT = "";
////                String returnValueSL = "";
////                String returnValueDG = "";
////                String returnValueTT = "";
////
////
////                List<Object> valuesTable = new ArrayList<Object>();
////
////                DataInformation dataInformation = new DataInformation(datatypeSheet.getRow(0).getCell(4).getStringCellValue(),
////                        datatypeSheet.getRow(1).getCell(4).getStringCellValue(),
////                        datatypeSheet.getRow(2).getCell(4).getStringCellValue(),
////                        datatypeSheet.getRow(3).getCell(4).getStringCellValue(),
////                        datatypeSheet.getRow(4).getCell(4).getStringCellValue()
////                );
////                valuesTable.add(dataInformation);
////
////                DataTitle dataTitle = new DataTitle(datatypeSheet.getRow(5).getCell(12).getStringCellValue(),
////                        datatypeSheet.getRow(6).getCell(12).getStringCellValue(),
////                        datatypeSheet.getRow(6).getCell(7).getStringCellValue(),
////                        datatypeSheet.getRow(8).getCell(7).getStringCellValue(),
////                        datatypeSheet.getRow(7).getCell(12).getStringCellValue(),
////                        datatypeSheet.getRow(9).getCell(7).getStringCellValue(),
////                        datatypeSheet.getRow(10).getCell(7).getStringCellValue(),
////                        datatypeSheet.getRow(10).getCell(12).getStringCellValue(),
////                        datatypeSheet.getRow(11).getCell(12).getStringCellValue()
////                );
////                valuesTable.add(dataTitle);
////
////                DataInfoKH dataInfoKH = new DataInfoKH(datatypeSheet.getRow(12).getCell(0).getStringCellValue(),
////                        datatypeSheet.getRow(13).getCell(0).getStringCellValue(),
////                        datatypeSheet.getRow(14).getCell(0).getStringCellValue(),
////                        datatypeSheet.getRow(15).getCell(0).getStringCellValue(),
////                        datatypeSheet.getRow(16).getCell(0).getStringCellValue()
////                );
////                valuesTable.add(dataInfoKH);
////
////                DataTable dataTable;
////                int indexStt = 1;
////                int h = 21;
////
////
////                //Lấy dữ liệu trong bảng
////                for (int y = 1; y <= indexStt; y++) {
////                    if (h < 32) {
////                        int nextStt = indexStt + 1;
////                        while (datatypeSheet.getRow(h).getCell(0).getNumericCellValue() != nextStt) {
////                            int g;
////                            if (h < 32) {
////                                if (datatypeSheet.getRow(h).getCell(0).getNumericCellValue() == y) {
////                                    g = h;
////                                    returnValueStt = Double.toString(datatypeSheet.getRow(g).getCell(0).getNumericCellValue());
////                                    returnValueMH = datatypeSheet.getRow(g).getCell(2).getStringCellValue();
////                                    returnValueDVT = datatypeSheet.getRow(g).getCell(9).getStringCellValue();
////                                    returnValueSL = df.format(datatypeSheet.getRow(g).getCell(10).getNumericCellValue());
////                                    returnValueDG = df.format(datatypeSheet.getRow(g).getCell(12).getNumericCellValue());
////                                    returnValueTT = df.format(datatypeSheet.getRow(g).getCell(13).getNumericCellValue());
////                                }
////                                if (datatypeSheet.getRow(h).getCell(5
////                                ).getStringCellValue().length() > 0) {
////                                    returnValueTenQCHHDV = returnValueTenQCHHDV + datatypeSheet.getRow(h).getCell(5
////                                    ).getStringCellValue();
////                                    h++;
////                                } else {
////                                    h++;
////                                }
////                            } else {
////                                break;
////                            }
////                        }
////                        dataTable = new DataTable(returnValueStt, returnValueMH, returnValueTenQCHHDV, returnValueDVT, returnValueSL, returnValueDG, returnValueTT);
//////                    values.add(returnValue);
//////                    System.out.println(dataTable);
////                        returnValueTenQCHHDV = "";
////                        indexStt++;
////                        valuesTable.add(dataTable);
////                    } else {
////                        break;
////                    }
////                }
////
////                DataTableTotal dataTableTotal = new DataTableTotal(
////                        datatypeSheet.getRow(34).getCell(0).getStringCellValue(),
////                        df.format(datatypeSheet.getRow(33).getCell(13).getNumericCellValue()),
////                        df.format(datatypeSheet.getRow(34).getCell(13).getNumericCellValue()),
////                        df.format(datatypeSheet.getRow(35).getCell(13).getNumericCellValue()),
////                        datatypeSheet.getRow(36).getCell(0).getStringCellValue()
////                );
////                valuesTable.add(dataTableTotal);
////
////                DataPay dataPay = new DataPay(
////                        datatypeSheet.getRow(37).getCell(0).getStringCellValue(),
////                        datatypeSheet.getRow(38).getCell(0).getStringCellValue(),
////                        datatypeSheet.getRow(39).getCell(0).getStringCellValue()
////                );
////                valuesTable.add(dataPay);
////
////                DataSign dataSign = new DataSign(
////                        datatypeSheet.getRow(42).getCell(1).getStringCellValue(),
////                        datatypeSheet.getRow(42).getCell(8).getStringCellValue(),
////                        datatypeSheet.getRow(42).getCell(11).getStringCellValue()
////                );
////                valuesTable.add(dataSign);
////                System.out.println(valuesTable.toString());
////
//////            while (iterator.hasNext()) {
//////                i++;
//////                Row currentRow = iterator.next();
//////
//////                Iterator<Cell> cellIterator = currentRow.iterator();
//////
//////                while (cellIterator.hasNext()) {
//////
//////                    Cell currentCell = cellIterator.next();
//////                    //getCellTypeEnum shown as deprecated for version 3.15
//////                    //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
//////                    if (currentCell.getCellType() == CellType.STRING) {
////////                        if (i == 1) {
////////                            System.out.println("Tên công ty:" + currentCell.getStringCellValue() + " ");
////////                            System.out.println(currentCell.getColumnIndex());
////////                        }
////////                        if (i == 2) {
////////                            System.out.println("Tên công ty tiếng anh:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 3) {
////////                            System.out.println("Địa chỉ:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 4) {
////////                            System.out.println("Điện thoại:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 5) {
////////                            System.out.println("Mã số thuế:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 6) {
////////                            System.out.println("Mẫu số:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 7 && currentCell.getColumnIndex() == 12) {
////////                            System.out.println("Ký hiệu:" + currentCell.getStringCellValue() + " ");
////////                            System.out.println("Hóa đơn giá trị gia tăng:" + datatypeSheet.getRow(6).getCell(7).getStringCellValue());
//////////                        }if(i==7  && currentCell.getColumnIndex()==7){
//////////                            System.out.println("Hóa đơn giá trị gia tăng:"+currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 8 && currentCell.getColumnIndex() == 12) {
////////                            System.out.println("SỐ:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 9 && currentCell.getColumnIndex() == 7) {
////////                            System.out.println("V.A.T:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 10 && currentCell.getColumnIndex() == 7) {
////////                            System.out.println("Liên 1:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 11 && currentCell.getColumnIndex() == 7) {
////////                            System.out.println("Ngày:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 11 && currentCell.getColumnIndex() == 12) {
////////                            System.out.println("Ngày:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 12 && currentCell.getColumnIndex() == 12) {
////////                            System.out.println("Ngày:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 13) {
////////                            System.out.println("Họ tên người mua hàng:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 14) {
////////                            System.out.println("Tên đơn vị người mua hàng:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 15) {
////////                            System.out.println("Địa chỉ:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 16) {
////////                            System.out.println("Mã số thuế:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 17) {
////////                            System.out.println("Hình thức thanh toán:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if( i == 21 ) {
////////                            System.out.println(currentCell.getCellType());
////////                        }
////////                        if (i == 38) {
////////                            System.out.println("Thông tin thanh toán:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 39) {
////////                            System.out.println("Tài khoản thanh toán:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 40) {
////////                            System.out.println("Hạn thanh toán:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 42 && currentCell.getColumnIndex()==1) {
////////                            System.out.println("Người mua hàng:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 42 && currentCell.getColumnIndex()==8) {
////////                            System.out.println("Người bán hàng:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 42 && currentCell.getColumnIndex()==11) {
////////                            System.out.println("Thủ trưởng đơn vị:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 43 && currentCell.getColumnIndex()==1) {
////////                            System.out.println("Ký tên:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 43 && currentCell.getColumnIndex()==8) {
////////                            System.out.println("Ký tên:" + currentCell.getStringCellValue() + " ");
////////                        }
////////                        if (i == 43 && currentCell.getColumnIndex()==11) {
////////                            System.out.println("Ký tên:" + currentCell.getStringCellValue() + " ");
////////                        }
////////
////////                        System.out.println("ádấđá"+datatypeSheet.getRow(21).getCell(0).getNumericCellValue() );
////////                        System.out.println(currentCell.getStringCellValue() + " ");
//////
////////                        System.out.println(datatypeSheet.getRow(25).getCell(0).getNumericCellValue() != nextStt);
//////                    }
////////                    else if (currentCell.getCellType() == CellType.NUMERIC) {
////////                        System.out.print(currentCell.getNumericCellValue() + " ");
////////                    }
//////
//////                }
//////            }
////
////            } catch (FileNotFoundException e) {
////                e.printStackTrace();
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
////            System.out.println(fileName);
////        }
//
//    }
//
////    public static void search(final String pattern, final File folder, List<String> result) {
////        for (final File f : folder.listFiles()) {
////
////            if (f.isDirectory()) {
////                search(pattern, f, result);
////            }
////
////            if (f.isFile()) {
////                if (f.getName().matches(pattern)) {
////                    result.add(f.getAbsolutePath());
////                }
////            }
////
////        }
////    }
//
//
//}
