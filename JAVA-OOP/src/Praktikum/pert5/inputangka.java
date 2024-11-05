package Praktikum.pert5;

import java.util.Scanner;

public class inputangka {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        do{
            System.out.print("Masukkan angka: ");
            num = input.nextInt();
        }while(num != 0);
        input.close();
    }
    
}
