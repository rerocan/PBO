import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to print 'IQBAL PAOK': ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("IQBAL PAOK");
        }
        
        scanner.close();
    }
}
