import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int L = scanner.nextInt();
            int R = scanner.nextInt();
          
            if (L % 2 == 0 || R % 2 == 0 || (R - L) >= 1) {
                
                if (L == R && L % 2 != 0) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            } else {
                System.out.println("No");
            }
        }
        

    }
}
