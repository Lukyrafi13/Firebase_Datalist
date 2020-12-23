package com.example.firebase_datalist;

public class Perusahaan {
    public String nama;
    public String tahun;
    public String website;

    public Perusahaan() {
    }

    public Perusahaan(String nama, String tahun, String website) {
        this.nama = nama;
        this.tahun = tahun;
        this.website = website;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
