package Tugas.tugas_praktikum_1;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari user
        Scanner input = new Scanner(System.in);
        boolean lanjut = true; // Variabel untuk mengontrol perulangan program
        
        while (lanjut) {
            // Menampilkan pilihan operasi
            System.out.println("Pilih operasi: ");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");

            // Input pilihan operasi dari user
            int pilihan = input.nextInt();

            // Jika user memilih untuk keluar
            if (pilihan == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator!");
                break;
            }

            // Input dua angka dari user
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            // Deklarasi variabel hasil
            double hasil = 0;

            // Proses operasi berdasarkan pilihan
            switch (pilihan) {
                case 1:
                    hasil = angka1 + angka2;
                    break;
                case 2:
                    hasil = angka1 - angka2;
                    break;
                case 3:
                    hasil = angka1 * angka2;
                    break;
                case 4:
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Error: Tidak bisa membagi dengan nol!");
                        continue; // Kembali ke awal loop tanpa keluar program
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    continue; // Kembali ke awal loop tanpa keluar program
            }

            // Menampilkan hasil tanpa titik desimal jika bilangan bulat
            if (hasil == (int) hasil) {
                System.out.println("Hasil: " + (int) hasil);
            } else {
                System.out.println("Hasil: " + hasil);
            }

            // Menanyakan apakah ingin melanjutkan atau keluar
            System.out.println("Apakah Anda ingin melakukan perhitungan lain? (y/n)");
            char pilihanLanjut = input.next().charAt(0);

            // Memeriksa pilihan user
            if (pilihanLanjut == 'n' || pilihanLanjut == 'N') {
                lanjut = false; // Menghentikan perulangan
                System.out.println("Terima kasih telah menggunakan kalkulator!");
            }
        }

        // Menutup scanner
        input.close();
    }
}
