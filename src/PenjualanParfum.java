import java.util.Scanner;

public class PenjualanParfum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parfum[] daftarParfum = new Parfum[5]; // Array untuk menyimpan parfum
        int index = 0; // Indeks untuk array
        boolean lanjut = true;

        while (lanjut) {
            try {
                System.out.println("\nMenu:");
                System.out.println("1. Tambah Parfum");
                System.out.println("2. Lihat Semua Parfum");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan buffer

                switch (pilihan) {
                    case 1:
                        if (index < daftarParfum.length) {
                            System.out.print("Nama Parfum: ");
                            String nama = scanner.nextLine();
                            System.out.print("Harga Parfum: ");
                            double harga = scanner.nextDouble();
                            scanner.nextLine(); // Membersihkan buffer
                            System.out.print("Jenis Parfum: ");
                            String jenis = scanner.nextLine();

                            // Menambah parfum biasa atau dengan diskon
                            System.out.print("Apakah parfum ini ada diskon? (y/n): ");
                            String diskon = scanner.nextLine();
                            if (diskon.equalsIgnoreCase("y")) {
                                System.out.print("Masukkan diskon (dalam persen): ");
                                double diskonPersen = scanner.nextDouble();
                                scanner.nextLine(); // Membersihkan buffer
                                daftarParfum[index++] = new ParfumDiskon(nama, harga, jenis, diskonPersen);
                            } else {
                                daftarParfum[index++] = new Parfum(nama, harga, jenis);
                            }
                        } else {
                            System.out.println("Daftar parfum sudah penuh.");
                        }
                        break;

                    case 2:
                        if (index == 0) {
                            System.out.println("Belum ada parfum yang ditambahkan.");
                        } else {
                            for (int i = 0; i < index; i++) {
                                System.out.println("\nParfum " + (i + 1) + ":");
                                daftarParfum[i].tampilInfo();
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Terima kasih! Program selesai.");
                        lanjut = false;
                        break;

                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input: " + e.getMessage());
                scanner.nextLine(); // Membersihkan buffer
            }
        }

        scanner.close();
    }
}
