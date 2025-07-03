# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi manajemen kegiatan olahraga menggunakan bahasa pemrograman Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini memungkinkan pengguna untuk:

* Mendaftarkan anggota kegiatan olahraga
* Menjadwalkan latihan olahraga
* Melihat daftar anggota yang sudah terdaftar
* Melihat jadwal latihan yang telah ditambahkan

Aplikasi ini mengimplementasikan konsep-konsep penting dalam OOP seperti: Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

1. **Class**
   Kode ini terdiri dari 4 class:

* `KegiatanOlahraga`
* `Anggota` (extends `KegiatanOlahraga`)
* `Latihan` (extends `KegiatanOlahraga`)
* `ManajerKegiatanOlahraga` (class utama)

```java
class KegiatanOlahraga { ... }
class Anggota extends KegiatanOlahraga { ... }
class Latihan extends KegiatanOlahraga { ... }
public class ManajerKegiatanOlahraga { ... }
```

2. **Object**
   Objek dibuat saat pendaftaran anggota dan penjadwalan latihan:

```java
anggotaList.add(new Anggota(nama, usia, olahraga));
latihanList.add(new Latihan(tanggal, jenisLatihan));
```

3. **Atribut**
   Atribut terdapat dalam class seperti `nama`, `usia`, `olahraga`, `tanggal`, dan `jenisLatihan`.

```java
private String nama;
private int usia;
private String olahraga;
```

4. **Constructor**
   Setiap class memiliki constructor untuk inisialisasi atribut saat object dibuat.

```java
public Anggota(String nama, int usia, String olahraga) {
    super(olahraga);
    this.nama = nama;
    this.usia = usia;
}
```

5. **Mutator**
   Contoh setter (mutator) untuk mengubah nilai atribut:

```java
public void setOlahraga(String olahraga) {
    this.olahraga = olahraga;
}
```

6. **Accessor**
   Contoh getter (accessor) untuk mengambil nilai atribut:

```java
public String getNama() { return nama; }
public int getUsia() { return usia; }
```

7. **Encapsulation**
   Atribut dibuat `private` dan hanya bisa diakses lewat method `get` atau `set`.

```java
private String nama;
private int usia;
```

8. **Inheritance**
   Class `Anggota` dan `Latihan` mewarisi `KegiatanOlahraga`.

```java
class Anggota extends KegiatanOlahraga { ... }
```

9. **Polymorphism**
   Digunakan melalui method `toString()` yang di-override di class `Anggota` dan `Latihan`.

```java
@Override
public String toString() {
    return "Nama: " + nama + ", \nUsia: " + usia + ", \nOlahraga: " + olahraga;
}
```

10. **Seleksi**
    Seleksi digunakan untuk menentukan menu yang dipilih oleh pengguna.

```java
switch (pilihan) {
    case 1: ...; break;
    case 2: ...; break;
}
```

11. **Perulangan**
    Menu diulang terus selama pilihan bukan `0` menggunakan `do-while`.

```java
do {
    ...
} while (pilihan != 0);
```

12. **IO Sederhana**
    Input menggunakan `Scanner`, output menggunakan `System.out.println`.

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama: ");
```

13. **Array**
    Menggunakan `ArrayList` untuk menyimpan banyak objek `Anggota` dan `Latihan`.

```java
private static ArrayList<Anggota> anggotaList = new ArrayList<>();
```

14. **Error Handling**
    Input integer dibungkus dalam `try-catch` untuk menangani kesalahan input.

```java
try {
    input = scanner.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Input tidak valid. Silakan masukkan angka.");
}
```

## Usulan Nilai

|  No | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |    10   |
|  10 | Seleksi        |    5    |
|  11 | Perulangan     |    5    |
|  12 | IO Sederhana   |    10   |
|  13 | Array          |    15   |
|  14 | Error Handling |    15   |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Tasya Rosalinda
NPM: 2310010225
