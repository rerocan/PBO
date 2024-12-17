package Praktikum.pert11.polymorfisme_statis;

public class Polymorph_tester {
    public static void main (String [] args){
        Polymorph p = new Polymorph();
        System.out .println("2 + 3 =" + p.tambah(2, 3));
        System.out.println("\"2\" + \"3\" = " + p.tambah("2", "3"));
    }
}