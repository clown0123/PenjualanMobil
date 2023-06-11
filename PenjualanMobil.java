import barang.Mobil;
import java.util.ArrayList;
import java.util.List;

public class PenjualanMobil {
    private List<Mobil> daftarMobil;
    private double uangModal = 1000000000.0;
    private double nilaiAsset = 500000000.0;
    
    public PenjualanMobil() {
        daftarMobil = new ArrayList<>();
    }

    public void beliMobil(String merek, String model, int tahun, double harga) {
        beliMobil(merek);
    }

    public void beliMobil(String merek) {
        beliMobil(merek);
    }


   public void beliMobil(Mobil mobil) {
    if (uangModal >= mobil.getHarga()) {
        daftarMobil.add(mobil);
        uangModal -= mobil.getHarga();
        nilaiAsset += mobil.getHarga();
       System.out.println("Berhasil membeli mobil " + mobil.getMerk());
  } else {
    System.out.println("Uang modal tidak mencukupi untuk membeli mobil " + mobil.getMerk());
}


}

    public void jualMobil(Mobil mobil, double hargaJual) {
        if (daftarMobil.contains(mobil)) {
            daftarMobil.remove(mobil);
            uangModal += hargaJual;
            nilaiAsset -= mobil.getHarga();
            System.out.println("Berhasil menjual mobil " + mobil.getMerk() + " dengan harga " + hargaJual);
} else {
    System.out.println("Mobil tidak ada dalam daftar");
}

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
            if (mobil.getMerk().equalsIgnoreCase(merek)) {
                hasilPencarian.add(mobil);
            }
        }
        return hasilPencarian;
    }
}

