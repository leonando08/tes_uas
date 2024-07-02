# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `HotelBooking`, `HotelBookingDetail`, dan `HotelBookingBeraksi` adalah contoh dari class.

```bash
public class HotelBooking {
  ..........
}

public class HotelBookingDetail extends HotelBooking {
    ...
}

public class HotelBookingBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `ookings[i] = new HotelBookingDetail(nama, kodeBooking);` adalah contoh pembuatan object.

```bash
bookings[i] = new HotelBookingDetail(nama, kodeBooking);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `kodeBooking` adalah contoh atribut.

```bash
String nama;
String kodeBooking;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `HotelBooking` dan `HotelBookingDetail`.

```bash
    public HotelBooking(String nama, String kodeBooking) {
        this.nama = nama;
        this.kodeBooking = kodeBooking;
    }

    public HotelBookingDetail(String nama, String kodeBooking) {
        super(nama, kodeBooking);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setKodeBooking` adalah contoh method mutator.

```bash
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKodeBooking(String kodeBooking) {
        this.kodeBooking = kodeBooking;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getKodeBooking`, `getInfoTambahan`, `getInfoKamar`, dan `gettanggalBooking` adalah contoh method accessor.

```bash
    public String getNama() {
        return nama;
    }

    public String getKodeBooking() {
        return kodeBooking;
    }
    public String InfoTambahan() {
        return kodeBooking;
    }
    public String getInfoKamar() {
        return kodeBooking;
    }
    public String gettanggalBooking() {
        return kodeBooking;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `kodeBooking` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String nama;
    private String kodeBooking;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `HotelBookingDetail` mewarisi `HotelBooking` dengan sintaks `extends`.

```bash
public class HotelBookingDetail extends HotelBooking {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo(String)` di `HotelBooking` merupakan overloading method `tampilkanInfo` dan `tampilkanInfo` di `HotelBookingDetail` merupakan override dari method `tampilkanInfo` di `HotelBooking`.

```bash
public String displayInfo(String kelas) {
    return displayInfo() + "\nKelas: " + kelas;
}

    @Override
    public String tampilkanInfo() {
        try {
            return super.tampilkanInfo() +
                    "\nInfo Diskon : " + getInfoTambahan() +
                    "\nInfo Kamar : " + getInfoKamar() +
                    "\nTanggal Masuk : " + gettanggalBooking();
        } catch (Exception e) {
            return super.tampilkanInfo() +
                    "\nKesalahan: " + e.getMessage();
        }
    }
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getInfoTambahan` dan seleksi `switch` dalam method `getInfoKamar`.

```bash
 public String getInfoTambahan() {
        String kodePro = getKodeBooking().substring(0, 2);
        //seleksi if
        if(kodePro.equals("10")) {
            return "Tambahan Kasur";
        } else {
            return "Tidak Ada Tambahan";
        }
      }
    // metode tambahan untuk mendapatkan informasi kamar yang dipesan
    public String getInfoKamar() {
        String kodeKamar = getKodeBooking().substring(2, 5);
        switch(kodeKamar) {
            case "101":
                return "Kamar Deluxe, dengan pemandangan laut.";
            case "201":
                return "Suite, dengan fasilitas lengkap.";
            default:
                return "Tipe kamar tidak diketahui.";
        }
    }

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < mahasiswas.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
 Scanner scanner = new Scanner(System.in);
 System.out.println("Masukkan Data Pemesanan Hotel ke " + (i + 1));
 String nama = scanner.nextLine();

// menampilkan informasi pemesanan hotel
 System.out.println("\nData Pemesanan Hotel:");
System.out.println(data.tampilkanInfo());
}
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `HotelBookingDetail[] bookings = new HotelBookingDetail[2];` adalah contoh penggunaan array.

```bash
HotelBookingDetail[] bookings = new HotelBookingDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
        catch (NumberFormatException e){
            System.out.println("Kesalahan Format Nomor" +e.getMessage());
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("kesalahan Format Kode Kamar"+e.getMessage()); 
        }
        catch (Exception e){
            System.out.println("Kesalahan Kode Promo :"+e.getMessage());  
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

Nama: Leo Nando Reza Alwita Rama
NPM: 2210010691
