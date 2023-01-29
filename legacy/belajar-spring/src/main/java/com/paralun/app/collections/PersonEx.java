package com.paralun.app.collections;

public class PersonEx {
    
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
        return "PersonEx{" + "nama=" + nama + ", alamat=" + alamat + ", umur=" + umur + '}';
    }
}
