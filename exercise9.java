/*9) Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a área do quadrado. Dica a=l²
9) Write an algorithm to read the dimensions of a square (side), calculate and write the area of the square. Tip a=l²
*/
import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.println("A área do quadrado com lado " + lado + " é: " + area);

        scanner.close();
    }
}

