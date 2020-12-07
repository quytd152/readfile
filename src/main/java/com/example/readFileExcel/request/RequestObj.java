package com.example.readFileExcel.request;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestObj {
	@JsonProperty("doanhnghiep_mst")
	private String doanhnghiep_mst;

	@JsonProperty("loaihoadon_ma")
	private String loaihoadon_ma;

	@JsonProperty("mauso")
	private String mauso;

	@JsonProperty("kyhieu")
	private String kyhieu;

	@JsonProperty("ma_hoadon")
	private String ma_hoadon;

	@JsonProperty("ngaylap")
	private String ngaylap;

	@JsonProperty("vanchuyen_so")
	private String vanchuyen_so;

	@JsonProperty("vanchuyen_ngayxuat")
	private String vanchuyen_ngayxuat;

	@JsonProperty("vanchuyen_khoxuat")
	private String vanchuyen_khoxuat;

	@JsonProperty("vanchuyen_khonhap")
	private String vanchuyen_khonhap;

	@JsonProperty("tongtien_chuavat")
	private Integer tongtien_chuavat;

	//vanchuyen_giaohang
	@JsonProperty("vanchuyen_giaohang")
	private String vanchuyen_giaohang;

	@JsonProperty("vanchuyen_phuongthuc")
	private String vanchuyen_phuongthuc;

	@JsonProperty("vanchuyen_lydo")
	private String vanchuyen_lydo;

	@JsonProperty("tienthue")
	private Integer tienthue;

	@JsonProperty("tongtien_covat")
	private Integer tongtien_covat;

	@JsonProperty("dschitiet")
	private List<Dschitiet> dschitiet = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("vanchuyen_giaohang")
	public String getVanchuyen_giaohang() {
		return vanchuyen_giaohang;
	}

	@JsonProperty("vanchuyen_giaohang")
	public void setVanchuyen_giaohang(String vanchuyen_giaohang) {
		this.vanchuyen_giaohang = vanchuyen_giaohang;
	}

	@JsonProperty("vanchuyen_phuongthuc")
	public String getVanchuyen_phuongthuc() {
		return vanchuyen_phuongthuc;
	}

	@JsonProperty("vanchuyen_phuongthuc") // vanchuyen_lydo
	public void setVanchuyen_phuongthuc(String vanchuyen_phuongthuc) {
		this.vanchuyen_phuongthuc = vanchuyen_phuongthuc;
	}

	@JsonProperty("vanchuyen_lydo") // vanchuyen_lydo
	public String getVanchuyen_lydo() {
		return vanchuyen_lydo;
	}

	@JsonProperty("vanchuyen_lydo") // vanchuyen_lydo
	public void setVanchuyen_lydo(String vanchuyen_lydo) {
		this.vanchuyen_lydo = vanchuyen_lydo;
	}

	@JsonProperty("doanhnghiep_mst")
	public String getDoanhnghiepMst() {
		return doanhnghiep_mst;
	}

	@JsonProperty("doanhnghiep_mst")
	public void setDoanhnghiepMst(String doanhnghiepMst) {
		this.doanhnghiep_mst = doanhnghiepMst;
	}

	@JsonProperty("loaihoadon_ma")
	public String getLoaihoadonMa() {
		return loaihoadon_ma;
	}

	@JsonProperty("loaihoadon_ma")
	public void setLoaihoadonMa(String loaihoadonMa) {
		this.loaihoadon_ma = loaihoadonMa;
	}

	@JsonProperty("mauso")
	public String getMauso() {
		return mauso;
	}

	@JsonProperty("mauso")
	public void setMauso(String mauso) {
		this.mauso = mauso;
	}

	@JsonProperty("kyhieu")
	public String getKyhieu() {
		return kyhieu;
	}

	@JsonProperty("kyhieu")
	public void setKyhieu(String kyhieu) {
		this.kyhieu = kyhieu;
	}

	@JsonProperty("ma_hoadon")
	public String getMaHoadon() {
		return ma_hoadon;
	}

	@JsonProperty("ma_hoadon")
	public void setMaHoadon(String maHoadon) {
		this.ma_hoadon = maHoadon;
	}

	@JsonProperty("ngaylap")
	public String getNgaylap() {
		return ngaylap;
	}

	@JsonProperty("ngaylap")
	public void setNgaylap(String ngaylap) {
		this.ngaylap = ngaylap;
	}

	@JsonProperty("vanchuyen_so")
	public String getVanchuyenSo() {
		return vanchuyen_so;
	}

	@JsonProperty("vanchuyen_so")
	public void setVanchuyenSo(String vanchuyenSo) {
		this.vanchuyen_so = vanchuyenSo;
	}

	@JsonProperty("vanchuyen_ngayxuat")
	public String getVanchuyenNgayxuat() {
		return vanchuyen_ngayxuat;
	}

	@JsonProperty("vanchuyen_ngayxuat")
	public void setVanchuyenNgayxuat(String vanchuyenNgayxuat) {
		this.vanchuyen_ngayxuat = vanchuyenNgayxuat;
	}

	@JsonProperty("vanchuyen_khoxuat")
	public String getVanchuyenKhoxuat() {
		return vanchuyen_khoxuat;
	}

	@JsonProperty("vanchuyen_khoxuat")
	public void setVanchuyenKhoxuat(String vanchuyenKhoxuat) {
		this.vanchuyen_khoxuat = vanchuyenKhoxuat;
	}

	@JsonProperty("vanchuyen_khonhap")
	public String getVanchuyenKhonhap() {
		return vanchuyen_khonhap;
	}

	@JsonProperty("vanchuyen_khonhap")
	public void setVanchuyenKhonhap(String vanchuyenKhonhap) {
		this.vanchuyen_khonhap = vanchuyenKhonhap;
	}

	@JsonProperty("tongtien_chuavat")
	public Integer getTongtienChuavat() {
		return tongtien_chuavat;
	}

	@JsonProperty("tongtien_chuavat")
	public void setTongtienChuavat(Integer tongtienChuavat) {
		this.tongtien_chuavat = tongtienChuavat;
	}

	@JsonProperty("tienthue")
	public Integer getTienthue() {
		return tienthue;
	}

	@JsonProperty("tienthue")
	public void setTienthue(Integer tienthue) {
		this.tienthue = tienthue;
	}

	@JsonProperty("tongtien_covat")
	public Integer getTongtienCovat() {
		return tongtien_covat;
	}

	@JsonProperty("tongtien_covat")
	public void setTongtienCovat(Integer tongtienCovat) {
		this.tongtien_covat = tongtienCovat;
	}

	@JsonProperty("dschitiet")
	public List<Dschitiet> getDschitiet() {
		return dschitiet;
	}

	@JsonProperty("dschitiet")
	public void setDschitiet(List<Dschitiet> dschitiet) {
		this.dschitiet = dschitiet;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}