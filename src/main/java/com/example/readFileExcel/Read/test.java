package com.example.readFileExcel.Read;

import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class test   {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        try {
            DateFormat originalFormat = new SimpleDateFormat("dd/MM/yyyy");
            DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = originalFormat.parse("30/09/2020");
            String formattedDate = targetFormat.format(date);
            System.out.println(formattedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String a = "Mã số thuế (Tax code): 3 5 0 0 8 7 4 3 1 5";
        System.out.println(a.replace("Mã số thuế (Tax code): ","").replaceAll("\\s+",""));

    }
//    private static void String convertStringToStringFormatDate(String dat) {
//
//        String formattedDate = null;
//        try {
//            DateFormat originalFormat = new SimpleDateFormat("ddMMyyyy", Locale.ENGLISH);
//            DateFormat targetFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//            Date date = originalFormat.parse(dat);
//            formattedDate = targetFormat.format(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return formattedDate;
//    }
//    public static void search(final String pattern, final File folder, List<String> result) {
//        for (final File f : folder.listFiles()) {
//            if (f.isDirectory()) {
//                search(pattern, f, result);
//            }
//
//            if (f.isFile()) {
//                if (f.getName().matches(pattern)) {
//                    result.add(f.getAbsolutePath());
//                }
//            }
//
//        }
//    }


}
