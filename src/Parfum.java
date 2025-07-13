public class Parfum {
    // Atribut
    private String nama;
    private double harga;
    private String jenis;
    
    // Konstruktor
    public Parfum(String nama, double harga, String jenis) {
        this.nama = nama;
        this.harga = harga;
        this.jenis = jenis;
    }
    
    // Mutator
        public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }  
    
    // Accessor
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String getJenis() {
        return jenis;
    }
    
    // Menampilkan informasi parfum
    public void tampilInfo() {
        System.out.println("Nama Parfum: " + nama);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Jenis: " + jenis);
    } 
}   

