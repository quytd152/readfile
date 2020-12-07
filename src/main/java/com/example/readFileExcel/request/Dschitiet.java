package com.example.readFileExcel.request;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.poi.hpsf.Decimal;

import java.util.HashMap;
import java.util.Map;

public class Dschitiet {

	@JsonProperty("stt")
	private int stt;

	@JsonProperty("hanghoa_loai")
	private Integer hanghoa_loai;

	@JsonProperty("khuyenmai")
	private Integer khuyenmai;

	@JsonProperty("dieuchinh_tanggiam")
	private Integer dieuchinh_tanggiam;

	@JsonProperty("ma")
	private String ma;

	@JsonProperty("ten")
	private String ten;

	@JsonProperty("donvitinh")
	private String donvitinh;

	@JsonProperty("soluong")
	private long soluong;

	@JsonProperty("dongia")
	private long dongia;

	@JsonProperty("phantram_chietkhau")
	private long phantram_chietkhau;

	@JsonProperty("tongtien_chietkhau")
	private long tongtien_chietkhau;

	@JsonProperty("tongtien_chuathue")
	private long tongtien_chuathue;

	@JsonProperty("mathue")
	private String mathue;

	@JsonProperty("tongtien_cothue")
	private long tongtien_cothue;

//	public Dschitiet(int stt, Integer hanghoa_loai, Integer khuyenmai, Integer dieuchinh_tanggiam, String ma, String ten, String donvitinh, long soluong, long dongia, long phantram_chietkhau, long tongtien_chietkhau, long tongtien_chuathue, String mathue, long tongtien_cothue) {
//		this.stt = stt;
//		this.hanghoa_loai = hanghoa_loai;
//		this.khuyenmai = khuyenmai;
//		this.dieuchinh_tanggiam = dieuchinh_tanggiam;
//		this.ma = ma;
//		this.ten = ten;
//		this.donvitinh = donvitinh;
//		this.soluong = soluong;
//		this.dongia = dongia;
//		this.phantram_chietkhau = phantram_chietkhau;
//		this.tongtien_chietkhau = tongtien_chietkhau;
//		this.tongtien_chuathue = tongtien_chuathue;
//		this.mathue = mathue;
//		this.tongtien_cothue = tongtien_cothue;
//	}
	public Dschitiet(int stt, Integer hanghoa_loai, String ma, String ten, String donvitinh, long soluong, long dongia, long tongtien_chuathue, String mathue, long tongtien_cothue) {
		this.stt = stt;
		this.hanghoa_loai = hanghoa_loai;
		this.ma = ma;
		this.ten = ten;
		this.donvitinh = donvitinh;
		this.soluong = soluong;
		this.dongia = dongia;
		this.tongtien_chuathue = tongtien_chuathue;
		this.mathue = mathue;
		this.tongtien_cothue = tongtien_cothue;
	}


	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public Integer getHanghoa_loai() {
		return hanghoa_loai;
	}

	public void setHanghoa_loai(Integer hanghoa_loai) {
		this.hanghoa_loai = hanghoa_loai;
	}

	public Integer getKhuyenmai() {
		return khuyenmai;
	}

	public void setKhuyenmai(Integer khuyenmai) {
		this.khuyenmai = khuyenmai;
	}

	public Integer getDieuchinh_tanggiam() {
		return dieuchinh_tanggiam;
	}

	public void setDieuchinh_tanggiam(Integer dieuchinh_tanggiam) {
		this.dieuchinh_tanggiam = dieuchinh_tanggiam;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDonvitinh() {
		return donvitinh;
	}

	public void setDonvitinh(String donvitinh) {
		this.donvitinh = donvitinh;
	}

	public long getSoluong() {
		return soluong;
	}

	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}

	public long getDongia() {
		return dongia;
	}

	public void setDongia(long dongia) {
		this.dongia = dongia;
	}

	public long getPhantram_chietkhau() {
		return phantram_chietkhau;
	}

	public void setPhantram_chietkhau(long phantram_chietkhau) {
		this.phantram_chietkhau = phantram_chietkhau;
	}

	public long getTongtien_chietkhau() {
		return tongtien_chietkhau;
	}

	public void setTongtien_chietkhau(long tongtien_chietkhau) {
		this.tongtien_chietkhau = tongtien_chietkhau;
	}

	public long getTongtien_chuathue() {
		return tongtien_chuathue;
	}

	public void setTongtien_chuathue(long tongtien_chuathue) {
		this.tongtien_chuathue = tongtien_chuathue;
	}

	public String getMathue() {
		return mathue;
	}

	public void setMathue(String mathue) {
		this.mathue = mathue;
	}

	public long getTongtien_cothue() {
		return tongtien_cothue;
	}

	public void setTongtien_cothue(long tongtien_cothue) {
		this.tongtien_cothue = tongtien_cothue;
	}
}