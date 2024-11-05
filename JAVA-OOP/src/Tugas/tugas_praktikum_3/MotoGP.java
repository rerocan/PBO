package Tugas.tugas_praktikum_3;

// Definisi class MotoGP
public class MotoGP {
    // Atribut dari class MotoGP
    private String pembalap;
    private String tim;
    private String motor;
    private int posisiKlasemen;

    // Konstruktor class MotoGP
    public MotoGP(String pembalap, String tim, String motor, int posisiKlasemen) {
        this.pembalap = pembalap;
        this.tim = tim;
        this.motor = motor;
        this.posisiKlasemen = posisiKlasemen;
    }

    // Metode untuk menampilkan informasi pembalap
    public String infoPembalap() {
        return "Pembalap: " + pembalap + ", Tim: " + tim + ", Motor: " + motor + ", Posisi Klasemen: " + posisiKlasemen;
    }

    // Metode untuk update posisi klasemen
    public void updateKlasemen(int posisiBaru) {
        this.posisiKlasemen = posisiBaru;
        System.out.println("Posisi klasemen terbaru untuk " + pembalap + " adalah " + posisiKlasemen);
    }
}

// Class utama untuk menjalankan program
class Main {
    public static void main(String[] args) {
        // Membuat objek dari class MotoGP
        MotoGP pembalap1 = new MotoGP("Francesco Bagnaia", "Ducati Lenovo Team", "Ducati Desmosedici GP23", 1);
        MotoGP pembalap2 = new MotoGP("Fabio Quartararo", "Monster Energy Yamaha", "Yamaha YZR-M1", 2);

        // Menampilkan informasi pembalap
        System.out.println(pembalap1.infoPembalap());
        System.out.println(pembalap2.infoPembalap());

        // Update posisi klasemen pembalap
        pembalap2.updateKlasemen(3);
    }
}
