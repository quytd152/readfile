package com.example.readFileExcel.Read;

public class DataTitle {
    String mauSo;
    String kyHieu;
    String tenHDVIE;
    String tenHDENG;
    String so;
    String lien;
    String ngay;
    String soThamChieu;
    String soLXH;

    public DataTitle() {
    }

    public DataTitle(String mauSo, String kyHieu, String tenHDVIE, String tenHDENG, String so, String lien, String ngay, String soThamChieu, String soLXH) {
        this.mauSo = mauSo;
        this.kyHieu = kyHieu;
        this.tenHDVIE = tenHDVIE;
        this.tenHDENG = tenHDENG;
        this.so = so;
        this.lien = lien;
        this.ngay = ngay;
        this.soThamChieu = soThamChieu;
        this.soLXH = soLXH;
    }

    public String getMauSo() {
        return mauSo;
    }

    public void setMauSo(String mauSo) {
        this.mauSo = mauSo;
    }

    public String getKyHieu() {
        return kyHieu;
    }

    public void setKyHieu(String kyHieu) {
        this.kyHieu = kyHieu;
    }

    public String getTenHDVIE() {
        return tenHDVIE;
    }

    public void setTenHDVIE(String tenHDVIE) {
        this.tenHDVIE = tenHDVIE;
    }

    public String getTenHDENG() {
        return tenHDENG;
    }

    public void setTenHDENG(String tenHDENG) {
        this.tenHDENG = tenHDENG;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getSoThamChieu() {
        return soThamChieu;
    }

    public void setSoThamChieu(String soThamChieu) {
        this.soThamChieu = soThamChieu;
    }

    public String getSoLXH() {
        return soLXH;
    }

    public void setSoLXH(String soLXH) {
        this.soLXH = soLXH;
    }

    @Override
    public String toString() {
        return "DataTitle{" +
                "mauSo='" + mauSo + '\'' +
                ", kyHieu='" + kyHieu + '\'' +
                ", tenHDVIE='" + tenHDVIE + '\'' +
                ", tenHDENG='" + tenHDENG + '\'' +
                ", so='" + so + '\'' +
                ", lien='" + lien + '\'' +
                ", ngay='" + ngay + '\'' +
                ", soThamChieu='" + soThamChieu + '\'' +
                ", soLXH='" + soLXH + '\'' +
                '}';
    }
}
