# Sistem_Manajemen_Parkir_Matkul_PBO

# SISTEM MANAJEMEN PARKIR

**Nama:** Muhammad Islami Pasya  
**NIM:** 2509116108

---

## 1. Deskripsi Studi Kasus

Sistem Manajemen Parkir merupakan program berbasis Java yang dibuat untuk membantu proses pengelolaan kendaraan yang masuk dan keluar dari area parkir.

Program ini digunakan untuk mencatat data kendaraan, mengelola kendaraan yang sedang parkir, serta menampilkan informasi yang berkaitan dengan proses parkir. Dengan adanya sistem ini, proses pencatatan data parkir dapat dilakukan secara lebih terstruktur dan mudah dikelola.

Program dibuat menggunakan konsep **Object-Oriented Programming (OOP)** dengan menerapkan beberapa konsep seperti **class, object, constructor, encapsulation, inheritance, ArrayList, percabangan, dan perulangan**.

---

## 2. Fitur Program

Beberapa fitur yang terdapat pada Sistem Manajemen Parkir antara lain:

- Menambahkan data kendaraan.
- Menampilkan data kendaraan.
- Mengubah data kendaraan.
- Menghapus data kendaraan.
- Mengelola data parkir.
- Menampilkan informasi kendaraan yang sedang parkir.
- Menggunakan menu interaktif melalui input pengguna.
- Menggunakan inheritance pada class yang memiliki hubungan pewarisan.

---

## 3. Struktur Class

Struktur class pada program Sistem Manajemen Parkir dapat digambarkan secara sederhana sebagai berikut:

                    Kendaraan
                        |
              +---------+---------+
              |                   |
          Mobil                 Motor
              |                   |
        data kendaraan       data kendaraan



## 4. Penjelasan Hierarki Class
Class Kendaraan digunakan sebagai parent class (superclass) yang berisi atribut atau method umum yang dimiliki oleh kendaraan.
Class Mobil dan Motor merupakan child class (subclass) yang mewarisi atribut dan method dari class Kendaraan.
Dengan menggunakan inheritance, bagian program yang memiliki sifat atau data yang sama tidak perlu ditulis ulang pada setiap class.

## 5. Penerapan Inheritance
Inheritance diterapkan dengan membuat class Mobil dan Motor sebagai turunan dari class Kendaraan.

Contoh penerapan inheritance:

<img width="325" height="216" alt="image" src="https://github.com/user-attachments/assets/9cebb284-bf7f-492c-b910-5121826967f0" />

<img width="311" height="216" alt="image" src="https://github.com/user-attachments/assets/7069febc-b57e-4e58-999c-d91d52c379d2" />

Pada kode tersebut, keyword extends digunakan untuk menunjukkan bahwa class Mobil dan Motor merupakan turunan dari class Kendaraan.
Kemudian keyword super digunakan untuk memanggil constructor dari parent class Kendaraan.
Dengan penerapan inheritance tersebut, atribut dan method yang bersifat umum dapat digunakan kembali oleh class turunannya.

## 6. Penjelasan Alur Program

<img width="220" height="141" alt="image" src="https://github.com/user-attachments/assets/6cd85a5f-b5f4-48e8-98fa-46bbf79eef46" />

ini tampilan awal menu utama dari sistem manajemen parkir

## Menu 1

<img width="253" height="158" alt="image" src="https://github.com/user-attachments/assets/592633c8-5e0f-448f-ae58-0febae9765a4" />

menu 1 untuk parkir mobil. Program meminta data nomor plat 0987, nama pemilik Pasya, durasi parkir 2 jam, dan tipe mobil Pajero. Setelah semua data dimasukkan, muncul pesan “Kendaraan berhasil masuk parkiran”, yang berarti data kendaraan berhasil disimpan oleh program.

## Menu 2

<img width="511" height="298" alt="image" src="https://github.com/user-attachments/assets/20ed84b1-bfbd-4628-856d-7cdde7966c09" />

di menu ke 2 untuk parkir motor. Program meminta data nomor plat 2563, nama pemilik Islami Pasya, durasi parkir 1 jam, dan jenis motor Vario125. Setelah data dimasukkan, muncul pesan “Kendaraan berhasil masuk parkiran”, yang berarti data motor berhasil disimpan ke dalam sistem.

## Menu 3

<img width="275" height="314" alt="image" src="https://github.com/user-attachments/assets/6fe69595-a667-4d92-9e01-eac2a15e0085" />

menu 3 untuk kendaraan keluar dari parkiran. Program meminta nomor plat 2563, kemudian menampilkan struk parkir berupa data pemilik Islami Pasya, jenis kendaraan Motor, durasi parkir 1 jam, dan tarif Rp3.000. Total yang harus dibayar adalah Rp3.000. Setelah pembayaran dihitung, muncul pesan “Kendaraan berhasil keluar dari parkiran”, yang berarti proses kendaraan keluar berhasil.

## Menu 4

<img width="259" height="218" alt="image" src="https://github.com/user-attachments/assets/b03e1dfb-f531-4709-a690-718316a4b8a2" />

menu 4 untuk melihat daftar kendaraan yang sedang parkir. Program menampilkan data kendaraan berupa nomor plat 0987, pemilik Pasya, jenis kendaraan Mobil, durasi parkir 2 jam, dan tarif parkir Rp10.000. Selain itu, ditampilkan juga tipe mobil yaitu Pajero.

## Menu 5

<img width="239" height="125" alt="image" src="https://github.com/user-attachments/assets/be4762f5-34aa-4b84-bc9a-f2163b74ea3a" />

menu 5 untuk melihat status parkir. Program menampilkan kapasitas parkir sebanyak 10 kendaraan. Saat ini terdapat 1 kendaraan yang sedang parkir, sehingga masih tersedia 9 tempat parkir

## Menu 6


<img width="625" height="322" alt="image" src="https://github.com/user-attachments/assets/22d00e2c-b96d-4d3c-a921-42f8e8e44813" />

menu 6 untuk keluar dari program. Setelah pilihan diproses, program menampilkan pesan “Terima kasih telah menggunakan Sistem Manajemen Parkir.” yang berarti program berhasil dihentikan.

## 7. Kesimpulan

Sistem Manajemen Parkir merupakan program Java yang dibuat untuk mengelola data kendaraan dan proses parkir. Program ini menerapkan konsep Object-Oriented Programming, khususnya penggunaan class, object, constructor, ArrayList, serta inheritance.
Penerapan inheritance dilakukan dengan membuat Kendaraan sebagai parent class dan Mobil serta Motor sebagai child class. Dengan konsep tersebut, atribut dan method yang memiliki fungsi umum dapat digunakan kembali oleh class turunannya sehingga struktur program menjadi lebih terorganisir.
