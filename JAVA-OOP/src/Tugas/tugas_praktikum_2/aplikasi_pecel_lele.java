package Tugas.tugas_praktikum_2;

import java.util.Scanner;

public class aplikasi_pecel_lele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHarga = 0;
        int pilihanMenu;

        System.out.println("Selamat datang di Warung Sederhana!");
        System.out.println("1. Bebek Goreng - 15000");
        System.out.println("2. Nasi - 5000");
        System.out.println("3. Ayam Goreng - 20000");
        System.out.println("4. lele goreng - 25000");

        // Menggunakan do-while untuk terus meminta input hingga pembeli selesai
        do {
            System.out.println("\nPilih menu (masukkan nomor menu atau 0 untuk selesai): ");
            pilihanMenu = scanner.nextInt();

            // Menggunakan switch-case untuk menangani pilihan menu
            switch (pilihanMenu) {
                case 1:
                    System.out.println("Anda memilih Bebek Goreng.");
                    totalHarga += 15000;
                    break;
                case 2:
                    System.out.println("Anda memilih Nasi.");
                    totalHarga += 5000;
                    break;
                case 3:
                    System.out.println("Anda memilih Ayam Goreng.");
                    totalHarga += 20000;
                    break;
                case 4:
                    System.out.println("Anda memilih lele goreng.");
                    totalHarga += 25000;
                    break;
                case 0:
                    System.out.println("Terima kasih telah memesan!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihanMenu != 0);

        // Menggunakan if-else untuk mengecek apakah ada pesanan
        if (totalHarga > 0) {
            System.out.println("Total harga pesanan Anda: Rp" + totalHarga);
            System.out.println("\nApakah Anda ingin membayar sekarang? (1: Ya, 2: Tidak)");
            int pembayaran = scanner.nextInt();

            // Menggunakan if-else untuk pembayaran
            if (pembayaran == 1) {
                System.out.println("Terima kasih atas pembayarannya!");
            } else {
                System.out.println("Pesanan Anda dibatalkan.");
            }
        } else {
            System.out.println("Anda tidak memesan apapun.");
        }

        System.out.println("\nTerima kasih telah berkunjung ke Warung Sederhana!");

        // Menggunakan for loop untuk menghitung mundur saat keluar
        System.out.println("\nKeluar dari program dalam:");
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            scanner.close();
        }
    }
}
