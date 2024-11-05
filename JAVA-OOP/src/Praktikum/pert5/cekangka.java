//cek angka positif,negatif atau nol
package Praktikum.pert5;

import java.util.Scanner;

public class cekangka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int num = input.nextInt();

        if(num >=1){
            System.out.println("Angka positif");
        }else if(num < 0){
            System.out.println("Angka negatif");
        }else if(num == 0){
            System.out.println("Angka nol");
        }else{
            System.out.println("Inputan bukan angka");
        }
        input.close();
    }
    
}
