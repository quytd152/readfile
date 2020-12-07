package com.example.readFileExcel.Read;

public class DataInformation  {
    String tenCTVIE;
    String tenCTENG;
    String diaChi;
    String dienThoai;
    String fax;
    String website;
    String mst;

    public DataInformation() {
    }

    public DataInformation(String tenCTVIE, String tenCTENG, String diaChi, String dienThoai, String fax, String website, String mst) {
        this.tenCTVIE = tenCTVIE;
        this.tenCTENG = tenCTENG;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.fax = fax;
        this.website = website;
        this.mst = mst;
    }

    public String getTenCTVIE() {
        return tenCTVIE;
    }

    public void setTenCTVIE(String tenCTVIE) {
        this.tenCTVIE = tenCTVIE;
    }

    public String getTenCTENG() {
        return tenCTENG;
    }

    public void setTenCTENG(String tenCTENG) {
        this.tenCTENG = tenCTENG;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }

    @Override
    public String toString() {
        return "DataInformation{" +
                "tenCTVIE='" + tenCTVIE + '\'' +
                ", tenCTENG='" + tenCTENG + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", dienThoai='" + dienThoai + '\'' +
                ", fax='" + fax + '\'' +
                ", website='" + website + '\'' +
                ", mst='" + mst + '\'' +
                '}';
    }
}
