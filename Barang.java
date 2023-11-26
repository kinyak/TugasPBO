package com.pbo.rendi;
// Deklarasi kelas barang
class Barang {
    // Deklarasi atribut
    public String namaBarang;
    public double hargaBarang;
    // Deklarasi konstruktor
    public Barang(String namaBarang, double hargaBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }
    // Deklarasi method
    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
    }
}