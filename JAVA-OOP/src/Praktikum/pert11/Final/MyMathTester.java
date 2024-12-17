package Praktikum.pert11.Final;

public class MyMathTester {
    public static void main(String[] args) {
        MyMath m = new MyMath();
        System.out.println("PI : " + Math.PI);
        System.out.println("Luas Lingkaran : " + m.luaslingkaran(10));
        System.out.println("Keliling Lingkaran : " + m.kelilinglingkaran(10));
        System.out.println("Sin(30) : " + Math.sin(Math.toRadians(30)));
        System.out.println("Cos(30) : " + Math.cos(Math.toRadians(30)));
        System.out.println("Tan(30) : " + Math.tan(Math.toRadians(30)));
        System.out.println("2^8 : " + Math.pow(2, 8));
    }
}
