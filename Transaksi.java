package com.pbo.rendi;
// Deklarasi kelas transaksi yang mewariskan kelas Barang dan mengimplementasikan interface TotalBayar
class Transaksi extends Barang implements TotalBayar {
    public int nomorFaktur;
    public String namaPelanggan;
    public int jumlahBeli;

    public Transaksi(int noFaktur, String namaPelanggan, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(namaBarang, hargaBarang);
        this.nomorFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.jumlahBeli = jumlahBeli;
    }

    @Override
    public double hitungTotalBayar() {
        return hargaBarang * jumlahBeli;
    }

    public void tampilkanTransaksi() {
        System.out.println("No Faktur: " + nomorFaktur);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        tampilkanInfo(); 
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total Bayar: Rp" + hitungTotalBayar());
    }
}