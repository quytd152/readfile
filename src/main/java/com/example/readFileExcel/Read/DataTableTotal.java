package com.example.readFileExcel.Read;

public class DataTableTotal {
    String thueXuat;
    String tienHang;
    String tienThue;
    String tongTienTT;
    String soTienBangChu;

    public DataTableTotal() {
    }

    public DataTableTotal(String thueXuat, String tienHang, String tienThue, String tongTienTT, String soTienBangChu) {
        this.thueXuat = thueXuat;
        this.tienHang = tienHang;
        this.tienThue = tienThue;
        this.tongTienTT = tongTienTT;
        this.soTienBangChu = soTienBangChu;
    }

    public String getThueXuat() {
        return thueXuat;
    }

    public void setThueXuat(String thueXuat) {
        this.thueXuat = thueXuat;
    }

    public String getTienHang() {
        return tienHang;
    }

    public void setTienHang(String tienHang) {
        this.tienHang = tienHang;
    }

    public String getTienThue() {
        return tienThue;
    }

    public void setTienThue(String tienThue) {
        this.tienThue = tienThue;
    }

    public String getTongTienTT() {
        return tongTienTT;
    }

    public void setTongTienTT(String tongTienTT) {
        this.tongTienTT = tongTienTT;
    }

    public String getSoTienBangChu() {
        return soTienBangChu;
    }

    public void setSoTienBangChu(String soTienBangChu) {
        this.soTienBangChu = soTienBangChu;
    }

    @Override
    public String toString() {
        return "DataTableTotal{" +
                "thueXuat='" + thueXuat + '\'' +
                ", tienHang='" + tienHang + '\'' +
                ", tienThue='" + tienThue + '\'' +
                ", tongTienTT='" + tongTienTT + '\'' +
                ", soTienBangChu='" + soTienBangChu + '\'' +
                '}';
    }
}
