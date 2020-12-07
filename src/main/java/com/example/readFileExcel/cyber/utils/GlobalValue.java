package com.example.readFileExcel.cyber.utils;

import org.springframework.stereotype.Component;

@Component
public class GlobalValue {

    public static String urlGetTokenStatic;
    public static String usernameStatic;
    public static String passwordStatic;
    public static String doanhnghiepMstStatic;




    public void setUrlToken(String urlToken) {
        GlobalValue.urlGetTokenStatic = urlToken;
    }

    public void setUsername(String x) {
        GlobalValue.usernameStatic = x;
    }

    public void setPassword(String y) {
        GlobalValue.passwordStatic = y;
    }


    public static void setDoanhnghiepMstStatic(String doanhnghiepMstStatic) {
        GlobalValue.doanhnghiepMstStatic = doanhnghiepMstStatic;
    }




}
