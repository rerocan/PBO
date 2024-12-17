package Praktikum.pert11.Final;

public class MyMath {
    public final double PHI = 3.1416;
    public final double luaslingkaran (double radius){
        return PHI * radius * radius;
    }
    public final double kelilinglingkaran (double radius){
        return 2 * PHI * radius;
    }
    public final double sin (double derajat){
        return Math.sin (Math.toRadians(derajat));
    }
    public final double cos (double derajat){
        return Math.cos (Math.toRadians(derajat));
    }
    public final double tan (double derajat){
        return Math.tan (Math.toRadians(derajat));
    }
    public final double log (double x, double y){
        return Math.pow(x, y);
    }
}
