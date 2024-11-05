package Praktikum.pert5;

public class bilangangenap {
    public static void main(String[] args) {
        int genap = 0;
        for(int i = 1; i<=100; i++){
            if(i % 2 == 0){
                genap ++;
            }
        }
        System.out.println("Bilangan genap adalah: "+genap);
    }
    
}
