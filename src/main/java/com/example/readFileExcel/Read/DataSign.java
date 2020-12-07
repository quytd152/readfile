package com.example.readFileExcel.Read;

public class DataSign {
    String nguoiMH;
    String nguoiBH;
    String thuTruongDV;

    public DataSign(String nguoiMH, String nguoiBH, String thuTruongDV) {
        this.nguoiMH = nguoiMH;
        this.nguoiBH = nguoiBH;
        this.thuTruongDV = thuTruongDV;
    }

    public DataSign() {
    }

    public String getNguoiMH() {
        return nguoiMH;
    }

    public void setNguoiMH(String nguoiMH) {
        this.nguoiMH = nguoiMH;
    }

    public String getNguoiBH() {
        return nguoiBH;
    }

    public void setNguoiBH(String nguoiBH) {
        this.nguoiBH = nguoiBH;
    }

    public String getThuTruongDV() {
        return thuTruongDV;
    }

    public void setThuTruongDV(String thuTruongDV) {
        this.thuTruongDV = thuTruongDV;
    }

    @Override
    public String toString() {
        return "DataSign{" +
                "nguoiMH='" + nguoiMH + '\'' +
                ", nguoiBH='" + nguoiBH + '\'' +
                ", thuTruongDV='" + thuTruongDV + '\'' +
                '}';
    }
}
