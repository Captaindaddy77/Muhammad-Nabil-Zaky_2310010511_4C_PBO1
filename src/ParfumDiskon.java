public class ParfumDiskon extends Parfum {
    private double diskon;

    // Konstruktor
    public ParfumDiskon(String nama, double harga, String jenis, double diskon) {
        super(nama, harga, jenis); // Memanggil konstruktor superclass
        this.diskon = diskon;
    }

    // Mutator dan Accessor
    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public double getDiskon() {
        return diskon;
    }

    // Menghitung harga setelah diskon
    public double hargaDiskon() {
        return getHarga() - (getHarga() * diskon / 100);
    }

    // Override metode tampilInfo untuk menambahkan informasi diskon
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga setelah diskon: Rp " + hargaDiskon());
    }
}
