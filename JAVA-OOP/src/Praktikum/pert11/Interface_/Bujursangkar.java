package Praktikum.pert11.Interface_;

public class Bujursangkar implements Bidang2D {
    public double sisi;

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }
    
}
