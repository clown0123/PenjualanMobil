public class Mobil {
    private final String merk;
    private final String model;
    private final int tahun;
    private final double harga;

    public Mobil(String merk, String model, int tahun, double harga) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public int getTahun() {
        return tahun;
    }

    public double getHarga() {
        return harga;
    }

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2021, 150000000);
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, 200000000);

        System.out.println("Mobil 1:");
        System.out.println("Merk: " + mobil1.getMerk());
        System.out.println("Model: " + mobil1.getModel());
        System.out.println("Tahun: " + mobil1.getTahun());
        System.out.println("Harga: " + mobil1.getHarga());

        System.out.println("\nMobil 2:");
        System.out.println("Merk: " + mobil2.getMerk());
        System.out.println("Model: " + mobil2.getModel());
        System.out.println("Tahun: " + mobil2.getTahun());
        System.out.println("Harga: " + mobil2.getHarga());
    }
}

