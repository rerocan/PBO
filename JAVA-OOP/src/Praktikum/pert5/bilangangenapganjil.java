package Praktikum.pert5;

import java.util.Scanner;

public class bilangangenapganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas bawah: ");
        int batasbawah = input.nextInt();

        System.out.print("Masukkan batas atas: ");
        int batasatas = input.nextInt();

        System.out.println("Bilangan genap: ");
        for(int i = batasbawah; i<=batasatas; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        
        System.out.println("Bilangan ganjil: ");
        for(int i = batasbawah; i<=batasatas; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        input.close();
    }
}
