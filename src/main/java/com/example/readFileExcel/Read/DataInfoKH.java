package com.example.readFileExcel.Read;

public class DataInfoKH {
    String hoTenKH;
    String tenDVMH;
    String diaChiKH;
    String mstKH;
    String hinhThucTT;

    public DataInfoKH(String hoTenKH, String tenDVMH, String diaChiKH, String mstKH, String hinhThucTT) {
        this.hoTenKH = hoTenKH;
        this.tenDVMH = tenDVMH;
        this.diaChiKH = diaChiKH;
        this.mstKH = mstKH;
        this.hinhThucTT = hinhThucTT;
    }

    public DataInfoKH() {
    }

    public String getHoTenKH() {
        return hoTenKH;
    }

    public void setHoTenKH(String hoTenKH) {
        this.hoTenKH = hoTenKH;
    }

    public String getTenDVMH() {
        return tenDVMH;
    }

    public void setTenDVMH(String tenDVMH) {
        this.tenDVMH = tenDVMH;
    }

    public String getDiaChiKH() {
        return diaChiKH;
    }

    public void setDiaChiKH(String diaChiKH) {
        this.diaChiKH = diaChiKH;
    }

    public String getMstKH() {
        return mstKH;
    }

    public void setMstKH(String mstKH) {
        this.mstKH = mstKH;
    }

    public String getHinhThucTT() {
        return hinhThucTT;
    }

    public void setHinhThucTT(String hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    @Override
    public String toString() {
        return "DataInfoKH{" +
                "hoTenKH='" + hoTenKH + '\'' +
                ", tenDVMH='" + tenDVMH + '\'' +
                ", diaChiKH='" + diaChiKH + '\'' +
                ", mstKH='" + mstKH + '\'' +
                ", hinhThucTT='" + hinhThucTT + '\'' +
                '}';
    }
}
