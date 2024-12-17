package Praktikum.pert11.polymorfisme_statis;

public class Overloading{
    public void tampil(){
        System.out.println("I love java");
    }
    public void tampil(int i){
        System.out.println("Methode deangan 1 parameter =" + i);
    }
    public void tampil(int j, int i){
        System.out.println("Methode dengan 2 parameter =" + j + " dan " + i);
    }
    public void tampil(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.tampil();
        o.tampil(8);
        o.tampil(6, 7);
        o.tampil("Hello World");
    }
}