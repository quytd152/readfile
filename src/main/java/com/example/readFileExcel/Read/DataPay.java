package com.example.readFileExcel.Read;

public class DataPay {
    String thongTinTT;
    String taiKhoanTT;
    String hanTT;

    public DataPay(String thongTinTT, String taiKhoanTT, String hanTT) {
        this.thongTinTT = thongTinTT;
        this.taiKhoanTT = taiKhoanTT;
        this.hanTT = hanTT;
    }

    public DataPay() {
    }

    public String getThongTinTT() {
        return thongTinTT;
    }

    public void setThongTinTT(String thongTinTT) {
        this.thongTinTT = thongTinTT;
    }

    public String getTaiKhoanTT() {
        return taiKhoanTT;
    }

    public void setTaiKhoanTT(String taiKhoanTT) {
        this.taiKhoanTT = taiKhoanTT;
    }

    public String getHanTT() {
        return hanTT;
    }

    public void setHanTT(String hanTT) {
        this.hanTT = hanTT;
    }

    @Override
    public String toString() {
        return "DataPay{" +
                "thongTinTT='" + thongTinTT + '\'' +
                ", taiKhoanTT='" + taiKhoanTT + '\'' +
                ", hanTT='" + hanTT + '\'' +
                '}';
    }
}
