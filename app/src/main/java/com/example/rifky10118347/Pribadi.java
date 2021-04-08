package com.example.rifky10118347;

//07-04-2021, 10118347, Rifky Arya Nur Salman, IF-8

public class Pribadi {
    private String nim,nama,kelas,deskripsi;

    public Pribadi(String nim, String nama, String kelas, String deskripsi) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.deskripsi = deskripsi;
    }

    public String getNim() {

        return nim;
    }

    public void setNim(String nim) {

        this.nim = nim;
    }

    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public String getKelas() {

        return kelas;
    }

    public void setKelas(String kelas) {

        this.kelas = kelas;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
