package Praktikum.pert12;

class OperasiPerkalian extends OperasiBilangan {
    @Override
    public void tampil(){
        c = a * b;
        System.out.println("A :" + get_A());
        System.out.println("B :" + get_B());
        System.out.println("Hasil Perkalian: " + c);
    }
}