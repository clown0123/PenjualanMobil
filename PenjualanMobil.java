/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package penjualan;

/**
 *
 * @author budi
 */
import barang.Mobil;
import java.util.ArrayList;
import java.util.List;

public class PenjualanMobil {
    private List<Mobil> daftarMobil;
    private double uangModal = 1000000000.0;
    private double nilaiAsset = 500000000.0;
    

    public PenjualanMobil() {
        daftarMobil = new ArrayList<>();
        int uangModal = (int) 1000000000.0;
        int nilaiAsset = (int) 500000000.0;
        
    }

    public void beliMobil(Mobil mobil) {
        daftarMobil.add(mobil);
        uangModal -= mobil.getHarga();
        nilaiAsset += mobil.getHarga();
    }

    public void jualMobil(Mobil mobil, double hargaJual) {
        daftarMobil.remove(mobil);
        uangModal += hargaJual;
        nilaiAsset -= mobil.getHarga();
    }
    
    public List<Mobil> getDaftarMobil() {
        return daftarMobil;
    }

    public double getUangModal() {
        return uangModal;
    }

    public double getNilaiAsset() {
        return nilaiAsset;
    }

    public List<Mobil> cariMobilBerdasarkanMerek(String merek) {
        List<Mobil> hasilPencarian = new ArrayList<>();
        for (Mobil mobil : daftarMobil) {
            if (mobil.getMerek().equalsIgnoreCase(merek)) {
                hasilPencarian.add(mobil);
            }
        }
        return hasilPencarian;
    }
    // Metode lain untuk mencari mobil berdasarkan kriteria lainnya
}
