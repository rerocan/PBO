package Praktikum.pert12;

class OperasiPembagian extends OperasiBilangan {
    @Override
    protected void tampil() {
        if (b != 0) {
            c = a / b;
            System.out.println("Nilai A: " + get_A());
            System.out.println("Nilai B: " + get_B());
            System.out.println("Hasil Pembagian: " + c);
        } else {
            System.out.println("Pembagian tidak bisa dilakukan (penyebut = 0)");
        }
    }
}