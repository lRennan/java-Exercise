/*7) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo. Dica a=b.h
7) Write an algorithm to read the dimensions of a rectangle (base and height), calculate and write the area of the rectangle. Tip a=b.h
*/
import java.util.Scanner;

public class exercise7 /*RetanguloArea*/ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo com base " + base + " e altura " + altura + " é: " + area);

        scanner.close();
    }
}


