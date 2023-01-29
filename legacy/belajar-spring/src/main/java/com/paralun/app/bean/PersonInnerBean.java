package com.paralun.app.bean;

public class PersonInnerBean {
    private String nama;
    private String alamat;
    private int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "PersonInnerBean{" + "nama=" + nama + ", alamat=" + alamat + ", umur=" + umur + '}';
    }
}
