/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

import barang.Mobil;
import java.util.List;

/**
 *
 * @author budi
 */
public class Main {
    public static void main(String[] args) {
        PenjualanMobil penjualanMobil = new PenjualanMobil();

        // Tambah mobil ke dalam daftar
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2021, 150000000);
        penjualanMobil.beliMobil(mobil1);

        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, 200000000);
        penjualanMobil.beliMobil(mobil2);

         // Jual mobil dengan harga jual tertentu
        double hargaJualMobil2 = 210000000;
        penjualanMobil.jualMobil(mobil2, hargaJualMobil2);

        // Output nilai akhir modal dan aset
        System.out.println("Nilai Akhir Modal: " + penjualanMobil.getUangModal());
        System.out.println("Nilai Akhir Aset: " + penjualanMobil.getNilaiAsset());

        // Tampilkan daftar mobil dengan menampilkan modelnya
        List<Mobil> daftarMobil = penjualanMobil.getDaftarMobil();
        System.out.println("Daftar Mobil:");
        for (Mobil mobil : daftarMobil) {
            System.out.println("Model: " + mobil.getModel());
        }
    }
}
