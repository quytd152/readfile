package com.example.readFileExcel.Read;

public class DataTable {
    String stt;
    String maHang;
    String tenQCHHDV;
    String dvt;
    String sl;
    String donGia;
    String thanhTien;

    public DataTable() {
    }

    public DataTable(String stt, String maHang, String tenQCHHDV, String dvt, String sl, String donGia, String thanhTien) {
        this.stt = stt;
        this.maHang = maHang;
        this.tenQCHHDV = tenQCHHDV;
        this.dvt = dvt;
        this.sl = sl;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenQCHHDV() {
        return tenQCHHDV;
    }

    public void setTenQCHHDV(String tenQCHHDV) {
        this.tenQCHHDV = tenQCHHDV;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public String getSl() {
        return sl;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public String getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(String thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return "DataTable{" +
                "stt='" + stt + '\'' +
                ", maHang='" + maHang + '\'' +
                ", tenQCHHDV='" + tenQCHHDV + '\'' +
                ", dvt='" + dvt + '\'' +
                ", sl='" + sl + '\'' +
                ", donGia='" + donGia + '\'' +
                ", thanhTien='" + thanhTien + '\'' +
                '}';
    }
}
