package com.example.readFileExcel.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class RequestObject {
    @JsonProperty("doanhnghiep_mst")
    private String doanhnghiep_mst;

    @JsonProperty("loaihoadon_ma")
    private String loaihoadon_ma;

    @JsonProperty("loai_hd_dacthu")
    private String loai_hd_dacthu;

    @JsonProperty("mauso")
    private String mauso;

    @JsonProperty("kyhieu")
    private String kyhieu;

    @JsonProperty("ma_hoadon")
    private String ma_hoadon;

    @JsonProperty("ngaylap")
    private String ngaylap;

    @JsonProperty("dnmua_mst")
    private String dnmua_mst;

    @JsonProperty("dnmua_ten")
    private String dnmua_ten;

    @JsonProperty("dnmua_tennguoimua")
    private String dnmua_tennguoimua;

    @JsonProperty("dnmua_diachi")
    private String dnmua_diachi;

    @JsonProperty("dnmua_sdt")
    private String dnmua_sdt;

    @JsonProperty("dnmua_email")
    private String dnmua_email;

    @JsonProperty("thanhtoan_phuongthuc")
    private int thanhtoan_phuongthuc;

    @JsonProperty("thanhtoan_phuongthuc_ten")
    private String thanhtoan_phuongthuc_ten;

    @JsonProperty("thanhtoan_taikhoan")
    private String thanhtoan_taikhoan;

    @JsonProperty("thanhtoan_nganhang")
    private String thanhtoan_nganhang;

    @JsonProperty("tiente_ma")
    private String tiente_ma;

    @JsonProperty("tygiangoaite")
    private long tygiangoaite;

    @JsonProperty("thanhtoan_thoihan")
    private String thanhtoan_thoihan;

    @JsonProperty("tongtien_chietkhau")
    private long tongtien_chietkhau;

    @JsonProperty("ghichu")
    private String ghichu;

    @JsonProperty("tongtien_chuavat")
    private long tongtien_chuavat;

    @JsonProperty("tienthue")
    private long tienthue;

    @JsonProperty("tongtien_covat")
    private long tongtien_covat;

    @JsonProperty("nguoilap")
    private String nguoilap;

    @JsonProperty("dschitiet")
    private List<Dschitiet> dschitiet = new ArrayList<>();

    public String getDoanhnghiep_mst() {
        return doanhnghiep_mst;
    }

    public void setDoanhnghiep_mst(String doanhnghiep_mst) {
        this.doanhnghiep_mst = doanhnghiep_mst;
    }

    public String getLoaihoadon_ma() {
        return loaihoadon_ma;
    }

    public void setLoaihoadon_ma(String loaihoadon_ma) {
        this.loaihoadon_ma = loaihoadon_ma;
    }

    public String getLoai_hd_dacthu() {
        return loai_hd_dacthu;
    }

    public void setLoai_hd_dacthu(String loai_hd_dacthu) {
        this.loai_hd_dacthu = loai_hd_dacthu;
    }

    public String getMauso() {
        return mauso;
    }

    public void setMauso(String mauso) {
        this.mauso = mauso;
    }

    public String getKyhieu() {
        return kyhieu;
    }

    public void setKyhieu(String kyhieu) {
        this.kyhieu = kyhieu;
    }

    public String getMa_hoadon() {
        return ma_hoadon;
    }

    public void setMa_hoadon(String ma_hoadon) {
        this.ma_hoadon = ma_hoadon;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getDnmua_mst() {
        return dnmua_mst;
    }

    public void setDnmua_mst(String dnmua_mst) {
        this.dnmua_mst = dnmua_mst;
    }

    public String getDnmua_ten() {
        return dnmua_ten;
    }

    public void setDnmua_ten(String dnmua_ten) {
        this.dnmua_ten = dnmua_ten;
    }

    public String getDnmua_tennguoimua() {
        return dnmua_tennguoimua;
    }

    public void setDnmua_tennguoimua(String dnmua_tennguoimua) {
        this.dnmua_tennguoimua = dnmua_tennguoimua;
    }

    public String getDnmua_diachi() {
        return dnmua_diachi;
    }

    public void setDnmua_diachi(String dnmua_diachi) {
        this.dnmua_diachi = dnmua_diachi;
    }

    public String getDnmua_sdt() {
        return dnmua_sdt;
    }

    public void setDnmua_sdt(String dnmua_sdt) {
        this.dnmua_sdt = dnmua_sdt;
    }

    public String getDnmua_email() {
        return dnmua_email;
    }

    public void setDnmua_email(String dnmua_email) {
        this.dnmua_email = dnmua_email;
    }

    public int getThanhtoan_phuongthuc() {
        return thanhtoan_phuongthuc;
    }

    public void setThanhtoan_phuongthuc(int thanhtoan_phuongthuc) {
        this.thanhtoan_phuongthuc = thanhtoan_phuongthuc;
    }

    public String getThanhtoan_phuongthuc_ten() {
        return thanhtoan_phuongthuc_ten;
    }

    public void setThanhtoan_phuongthuc_ten(String thanhtoan_phuongthuc_ten) {
        this.thanhtoan_phuongthuc_ten = thanhtoan_phuongthuc_ten;
    }

    public String getThanhtoan_taikhoan() {
        return thanhtoan_taikhoan;
    }

    public void setThanhtoan_taikhoan(String thanhtoan_taikhoan) {
        this.thanhtoan_taikhoan = thanhtoan_taikhoan;
    }

    public String getThanhtoan_nganhang() {
        return thanhtoan_nganhang;
    }

    public void setThanhtoan_nganhang(String thanhtoan_nganhang) {
        this.thanhtoan_nganhang = thanhtoan_nganhang;
    }

    public String getTiente_ma() {
        return tiente_ma;
    }

    public void setTiente_ma(String tiente_ma) {
        this.tiente_ma = tiente_ma;
    }

    public long getTygiangoaite() {
        return tygiangoaite;
    }

    public void setTygiangoaite(long tygiangoaite) {
        this.tygiangoaite = tygiangoaite;
    }

    public String getThanhtoan_thoihan() {
        return thanhtoan_thoihan;
    }

    public void setThanhtoan_thoihan(String thanhtoan_thoihan) {
        this.thanhtoan_thoihan = thanhtoan_thoihan;
    }

    public long getTongtien_chietkhau() {
        return tongtien_chietkhau;
    }

    public void setTongtien_chietkhau(long tongtien_chietkhau) {
        this.tongtien_chietkhau = tongtien_chietkhau;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public long getTongtien_chuavat() {
        return tongtien_chuavat;
    }

    public void setTongtien_chuavat(long tongtien_chuavat) {
        this.tongtien_chuavat = tongtien_chuavat;
    }

    public long getTienthue() {
        return tienthue;
    }

    public void setTienthue(long tienthue) {
        this.tienthue = tienthue;
    }

    public long getTongtien_covat() {
        return tongtien_covat;
    }

    public void setTongtien_covat(long tongtien_covat) {
        this.tongtien_covat = tongtien_covat;
    }

    public String getNguoilap() {
        return nguoilap;
    }

    public void setNguoilap(String nguoilap) {
        this.nguoilap = nguoilap;
    }

    public List<Dschitiet> getDschitiet() {
        return dschitiet;
    }

    public void setDschitiet(List<Dschitiet> dschitiet) {
        this.dschitiet = dschitiet;
    }
}
