# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Parfum`, `ParfumDiskon`, dan `PenjualanParfum` adalah contoh dari class.

```bash
public class Parfum {
    ...
}

public class ParfumDiskon extends Parfum {
    ...
}

public class PenjualanParfum {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarParfum[index++] = new ParfumDiskon(nama, harga, jenis, diskonPersen);` adalah contoh pembuatan object.

```bash
daftarParfum[index++] = new ParfumDiskon(nama, harga, jenis, diskonPersen);
daftarParfum[index++] = new Parfum(nama, harga, jenis);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `harga`, dan 'jenis' adalah contoh atribut.

```bash
String nama;
double harga;
String jenis;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Parfum` dan `ParfumDiskon`.

```bash
public Parfum(String nama, double harga, String jenis) {
this.nama = nama;
this.harga = harga;
this.jenis = jenis;
}

public ParfumDiskon(String nama, double harga, String jenis, double diskon) {
super(nama, harga, jenis); // Memanggil konstruktor superclass
this.diskon = diskon;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setHarga`, 'setJenis' dan 'setDiskon' adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setHarga(double harga) {
    this.harga = harga;
}

public void setJenis(String jenis) {
    this.jenis = jenis;
}

public void setDiskon(double diskon) {
    this.diskon = diskon;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getHarga`, `getJenis` dan `getDiskon' adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public double getHarga() {
    return harga;
}

public String getJenis() {
    return jenis;
}

public double getDiskon() {
    return diskon;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `harga` dan 'jenis' dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private double harga;
private String jenis;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class ParfumDiskon extends Parfum {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilInfo()` di `ParfumDiskon` merupakan override dari method `displayInfo` di `Parfum`.

```bash
public void tampilInfo() {
  System.out.println("Nama Parfum: " + nama);
  System.out.println("Harga: Rp " + harga);
  System.out.println("Jenis: " + jenis);
    } 
}

@Override
public String tampilInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `PenjualanParfum` dan seleksi `switch` dalam method `PenjualanParfum`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < index; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
int pilihan = scanner.nextInt();
scanner.nextLine(); // Membersihkan buffer
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Parfum[] daftarParfum = new Parfum[5];` adalah contoh penggunaan array.

```bash
Parfum[] daftarParfum = new Parfum[5];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
System.out.println("Terjadi kesalahan input: " + e.getMessage());
scanner.nextLine(); // Membersihkan buffer
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Nabil Zaky
NPM: 2310010511
