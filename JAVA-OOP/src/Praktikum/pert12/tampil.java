package Praktikum.pert12;

public class tampil {
    public static void main(String[] args) {
        // Nilai awal A dan B
        double A = 10.5;
        double B = 0.5;

        // Objek dari masing-masing operasi
        OperasiBilangan penjumlahan = new OperasiPenjumlahan();
        OperasiBilangan pengurangan = new OperasiPengurangan();
        OperasiBilangan perkalian = new OperasiPerkalian();
        OperasiBilangan pembagian = new OperasiPembagian();

        // Set nilai A dan B untuk masing-masing objek
        penjumlahan.set_A(A); penjumlahan.set_B(B);
        pengurangan.set_A(A); pengurangan.set_B(B);
        perkalian.set_A(A); perkalian.set_B(B);
        pembagian.set_A(A); pembagian.set_B(B);

        // Tampilkan hasil operasi
        penjumlahan.tampil();
        pengurangan.tampil();
        perkalian.tampil();
        pembagian.tampil();
    }
}