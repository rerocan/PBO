package Praktikum.pert11.Interface_;

public class Persegipanjang implements Bidang2D {
    public double panjang;
    public double lebar;

    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    public double getLuas() {
        return panjang * lebar;
    }
}