/*8) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo. Dica a=b.h/2
8) Write an algorithm to read the dimensions of a triangle (base and height), calculate and write the area of the triangle. Tip a=b.h/2
*/
import java.util.Scanner;

public class exercise8 /*TrianguloArea*/{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo com base " + base + " e altura " + altura + " é: " + area);

        scanner.close();
    }
}

