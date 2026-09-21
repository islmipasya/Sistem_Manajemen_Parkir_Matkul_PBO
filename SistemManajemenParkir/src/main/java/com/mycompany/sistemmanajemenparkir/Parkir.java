package com.mycompany.sistemmanajemenparkir;

import Kendaraan.Kendaraan;
import java.util.ArrayList;

/**
 * Class untuk mengelola area parkir.
 */
public class Parkir {

    private ArrayList<Kendaraan> daftarKendaraan;
    private int kapasitas;

    // Constructor
    public Parkir(int kapasitas) {

        this.kapasitas = kapasitas;
        this.daftarKendaraan = new ArrayList<>();
    }

    // Menambahkan kendaraan
    public void kendaraanMasuk(Kendaraan kendaraan) {

        if (daftarKendaraan.size() >= kapasitas) {

            System.out.println();
            System.out.println("Parkiran sudah penuh!");

            return;
        }

        if (cariKendaraan(kendaraan.getNomorPlat()) != null) {

            System.out.println();
            System.out.println(
                    "Kendaraan dengan nomor plat "
                    + kendaraan.getNomorPlat()
                    + " sudah berada di parkiran."
            );

            return;
        }

        daftarKendaraan.add(kendaraan);

        System.out.println();
        System.out.println("Kendaraan berhasil masuk parkiran.");
    }

    // Mengeluarkan kendaraan
    public void kendaraanKeluar(String nomorPlat) {

        Kendaraan kendaraan =
                cariKendaraan(nomorPlat);

        if (kendaraan == null) {

            System.out.println();
            System.out.println(
                    "Kendaraan dengan nomor plat "
                    + nomorPlat
                    + " tidak ditemukan."
            );

            return;
        }

        System.out.println();
        System.out.println("===================================");
        System.out.println("          STRUK PARKIR");
        System.out.println("===================================");

        kendaraan.tampilkanInfo();

        System.out.println();
        System.out.println(
                "Total yang harus dibayar: Rp "
                + kendaraan.hitungTarif()
        );

        System.out.println("===================================");

        daftarKendaraan.remove(kendaraan);

        System.out.println(
                "Kendaraan berhasil keluar dari parkiran."
        );
    }

    // Mencari kendaraan berdasarkan nomor plat
    public Kendaraan cariKendaraan(String nomorPlat) {

        for (Kendaraan kendaraan : daftarKendaraan) {

            if (kendaraan.getNomorPlat()
                    .equalsIgnoreCase(nomorPlat)) {

                return kendaraan;
            }
        }

        return null;
    }

    // Menampilkan seluruh kendaraan
    public void tampilkanSemuaKendaraan() {

        System.out.println();
        System.out.println("===================================");
        System.out.println("      DAFTAR KENDARAAN PARKIR");
        System.out.println("===================================");

        if (daftarKendaraan.isEmpty()) {

            System.out.println(
                    "Belum ada kendaraan yang parkir."
            );

            return;
        }

        int nomor = 1;

        for (Kendaraan kendaraan : daftarKendaraan) {

            System.out.println();
            System.out.println("Kendaraan ke-" + nomor);

            kendaraan.tampilkanInfo();

            nomor++;
        }
    }

    // Menampilkan informasi kapasitas
    public void tampilkanStatusParkir() {

        System.out.println();
        System.out.println("===================================");
        System.out.println("          STATUS PARKIR");
        System.out.println("===================================");

        System.out.println(
                "Kapasitas       : " + kapasitas
        );

        System.out.println(
                "Kendaraan       : " + daftarKendaraan.size()
        );

        System.out.println(
                "Tempat Tersedia : "
                + (kapasitas - daftarKendaraan.size())
        );

        System.out.println("===================================");
    }
}
