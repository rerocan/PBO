package Praktikum.pert12;

class OperasiPenjumlahan extends OperasiBilangan {
    @Override
    protected void tampil() {
        c = a + b;
        System.out.println("Nilai A: " + get_A());
        System.out.println("Nilai B: " + get_B());
        System.out.println("Hasil Penjumlahan: " + c);
    }
    
}