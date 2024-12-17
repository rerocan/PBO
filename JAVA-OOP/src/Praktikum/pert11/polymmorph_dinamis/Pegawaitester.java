package Praktikum.pert11.polymmorph_dinamis;

public class Pegawaitester {
    
    public static void main(String[] args) {
        Pegawai p = new Staff("Januar", "1234", "Keuangan");
        p.kirimEmail("a@test.com", "Judul", "isi email");
    }
}
