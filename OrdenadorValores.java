import java.util.Scanner;

public class OrdenadorValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os valores de A, B e C:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println("Os valores em ordem crescente são: " + a + ", " + b + ", " + c);
            } else {
                System.out.println("Os valores em ordem crescente são: " + a + ", " + c + ", " + b);
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.println("Os valores em ordem crescente são: " + b + ", " + a + ", " + c);
            } else {
                System.out.println("Os valores em ordem crescente são: " + b + ", " + c + ", " + a);
            }
        } else {
            if (a <= b) {
                System.out.println("Os valores em ordem crescente são: " + c + ", " + a + ", " + b);
            } else {
                System.out.println("Os valores em ordem crescente são: " + c + ", " + b + ", " + a);
            }
        }
        
        scanner.close();
    }
}
