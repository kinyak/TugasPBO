package com.pbo.rendi;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Melakukan sebuah inisiasi try untuk percobaan terhadap statement yang ada dalam blok kode try
    try {
        System.out.print("Masukkan No Faktur: ");
        int nomorFaktur = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Masukkan Harga Barang: ");
        double hargaBarang = scanner.nextDouble();

        System.out.print("Masukkan Jumlah Beli: ");
        int jumlahBeli = scanner.nextInt();

        Barang transaksi = new Transaksi(nomorFaktur, namaPelanggan, namaBarang, hargaBarang, jumlahBeli);
        ((Transaksi) transaksi).tampilkanTransaksi(); 

    }
    // Melakukan penangkapan error yang membaca kesalahan input, kondisi dimana tipe data yang disimpan tidak sesuai yang diinputkan
    catch (InputMismatchException e) {
        System.out.println("Kesalahan dalam menginput data: " + e.getMessage());
    }
    // Melakukan penangkapan error terhadap kesalahan umum yang terjadi pada program
    catch (Exception e) {
        System.out.println("Terjadi error: " + e.getMessage());
    } 
    // Apabila mekanisme try-catch telah dilakukan maka program menutup scanner agar tidak terjadi kebocoran memori
    finally {
        scanner.close();
        }
    }
}