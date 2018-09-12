/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasirtokobuku1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class KasirTokoBuku1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String perintah = "";
        String namaPenjagaKasir;
        int pilihan, jumlahbarang, jumlahbarang1 = 0, jumlahbarang2, harga, diskon;
        double total = 0;
        // tampilan awal
        System.out.println(" ~ Welcome To Toko Buku Ngalam ~ ");
        System.out.println("Nama Penjaga Kasir : ");
        namaPenjagaKasir = in.next();
        //tampilkan daftar semua barang
        do {
            System.out.println(" ");
            System.out.println("Daftar Barang Toko Ngalam");
            System.out.println("No Nama   Code  Harga");
            System.out.println("1.Buku      bk  Rp.3000,-");
            System.out.println("2.Bolpoin   bl  Rp.2000,-");
            System.out.println("3.Pensil    pl  Rp.1500,-");
            System.out.println("4.Penghapus pg  Rp.500,-");
            System.out.println("5.Tipe-X    tx  Rp.8000,-");
            //Coding ini untuk input pilihan barang
            System.out.print("Masukkan Pilihan Angka = ");
            pilihan = in.nextInt();
            //input jumlah barang yang akan dibeli

            switch (pilihan) {
                case 1:
                    System.out.println("Code Barang : bk");
                    System.out.println("Anda akan membeli Buku");
                    System.out.print("Masukkan Jumlah Buku = ");
                    jumlahbarang = in.nextInt();
                    harga = 3000 * jumlahbarang;
                    System.out.println("Harga Buku = Rp. " + harga);
                    if (jumlahbarang % 5 >= 0) {
                        jumlahbarang1 = jumlahbarang / 5;
                    }
                    jumlahbarang2 = jumlahbarang + jumlahbarang1;

                    if (harga > 50000) {
                        diskon = harga * 2 / 100;
                        harga = harga - diskon;
                        System.out.println("Pembelian anda > 50000, Anda mendapat diskon 2% = Rp. " + diskon);
                    }

                    System.out.println("Jumlah barang yang didapat = " + jumlahbarang2);
                    System.out.println("Selamat Anda cukup membayar Rp. " + harga + " untuk " + jumlahbarang2 + " Buku");

                    total = total + harga;
                    System.out.print("Ada Pesanan Lagi? (Y/N) ");
                    perintah = in.next();
                    break;
                case 2:
                    System.out.println("Code Barang : bl");
                    System.out.println("Anda akan membeli Bolpoin");
                    System.out.print("Masukkan Jumlah Bolpoin = ");
                    jumlahbarang = in.nextInt();
                    harga = 2000 * jumlahbarang;
                    System.out.println("Harga Bolpoin = Rp. " + harga);
                    if (jumlahbarang % 5 >= 0) {
                        jumlahbarang1 = jumlahbarang / 5;
                    }
                    jumlahbarang2 = jumlahbarang + jumlahbarang1;

                    if (harga > 25000) {
                        diskon = harga * 4 / 100;
                        harga = harga - diskon;
                        System.out.println("Pembelian anda > 25000, Anda mendapat diskon 4% = Rp. " + diskon);
                    }

                    System.out.println("Jumlah barang yang didapat = " + jumlahbarang2);
                    System.out.println("Selamat Anda cukup membayar Rp. " + harga + " untuk " + jumlahbarang2 + " Bolpoin");

                    total = total + harga;
                    System.out.print("Ada Pesanan Lagi? (Y/N) ");
                    perintah = in.next();
                    break;
                case 3:
                    System.out.println("Code Barang : pl");
                    System.out.println("Anda akan membeli Pensil");
                    System.out.print("Masukkan Jumlah Pensil = ");
                    jumlahbarang = in.nextInt();
                    harga = 1500 * jumlahbarang;
                    System.out.println("Harga Pensil = Rp. " + harga);
                    if (jumlahbarang % 5 >= 0) {
                        jumlahbarang1 = jumlahbarang / 5;
                    }
                    jumlahbarang2 = jumlahbarang + jumlahbarang1;

                    if (harga > 24000) {
                        diskon = harga * 5 / 100;
                        harga = harga - diskon;
                        System.out.println("Pembelian anda > 24000, Anda mendapat diskon 5% = Rp. " + diskon);
                    }

                    System.out.println("Jumlah barang yang didapat = " + jumlahbarang2);
                    System.out.println("Selamat Anda cukup membayar Rp. " + harga + " untuk " + jumlahbarang2 + " Pensil");

                    total = total + harga;
                    System.out.print("Ada Pesanan Lagi? (Y/N) ");
                    perintah = in.next();
                    break;
                case 4:
                    System.out.println("Code Barang : pg");
                    System.out.println("Anda akan membeli Penghapus");
                    System.out.print("Masukkan Jumlah Penghapus = ");
                    jumlahbarang = in.nextInt();
                    harga = 1000 * jumlahbarang;
                    System.out.println("Harga Penghapus = Rp. " + harga);
                    if (jumlahbarang % 5 >= 0) {
                        jumlahbarang1 = jumlahbarang / 5;
                    }
                    jumlahbarang2 = jumlahbarang + jumlahbarang1;

                    if (harga > 35000) {
                        diskon = harga * 6 / 100;
                        harga = harga - diskon;
                        System.out.println("Pembelian anda > 35000, Anda mendapat diskon 6% = Rp. " + diskon);
                    }

                    System.out.println("Jumlah barang yang didapat = " + jumlahbarang2);
                    System.out.println("Selamat Anda cukup membayar Rp. " + harga + " untuk " + jumlahbarang2 + " Penghapus");

                    total = total + harga;
                    System.out.print("Ada Pesanan Lagi? (Y/N) ");
                    perintah = in.next();
                    break;
                case 5:
                    System.out.println("Code Barang : tx");
                    System.out.println("Anda akan membeli Tipe-X");
                    System.out.print("Masukkan Jumlah Tipe-X = ");
                    jumlahbarang = in.nextInt();
                    harga = 8000 * jumlahbarang;
                    System.out.println("Harga Tipe-X = Rp. " + harga);
                    if (jumlahbarang % 5 >= 0) {
                        jumlahbarang1 = jumlahbarang / 5;
                    }
                    jumlahbarang2 = jumlahbarang + jumlahbarang1;

                    if (harga > 10000) {
                        diskon = harga * 1 / 100;
                        harga = harga - diskon;
                        System.out.println("Pembelian anda > 10000, Anda mendapat diskon 1% = Rp. " + diskon);
                    }

                    System.out.println("Jumlah barang yang didapat = " + jumlahbarang2);
                    System.out.println("Selamat Anda cukup membayar Rp. " + harga + " untuk " + jumlahbarang2 + " Tipe-X");

                    total = total + harga;
                    System.out.print("Ada Pesanan Lagi? (Y/N) ");
                    perintah = in.next();
            }
        } while (perintah.equalsIgnoreCase("Y"));
        System.out.println(" ");
        System.out.println("---------------------------------------------");
        System.out.println("Total Seluruhnya = RP. " + total);
        System.out.println("Terima Kasih, Selamat Belanja Kembali");
        System.out.println("---------------------------------------------");
        System.out.println("!!!MAAF TIDAK MENERIMA BON!!!");
    }

}
