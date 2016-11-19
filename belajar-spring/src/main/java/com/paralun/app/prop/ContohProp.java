package com.paralun.app.prop;
/**
 * @author James Kusmambang
 * @Since 21/10/2015
 */
public class ContohProp {
    
    private String nama;
    private String alamat;
    private String gender;

    public ContohProp() {
    }

    public ContohProp(String nama, String alamat, String gender) {
        this.nama = nama;
        this.alamat = alamat;
        this.gender = gender;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
