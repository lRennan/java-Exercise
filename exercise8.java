/*8) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo. Dica a=b.h/2
8) Write an algorithm to read the dimensions of a triangle (base and height), calculate and write the area of the triangle. Tip a=b.h/2
*/
import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        // Criar um Scanner para ler as dimensões do triângulo
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir a base do triângulo
        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        // Solicitar ao usuário para inserir a altura do triângulo
        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        // Calcular a área do triângulo usando a fórmula: área = (base * altura) / 2
        double area = (base * altura) / 2;

        // Exibir o resultado
        System.out.println("A área do triângulo com base " + base + " e altura " + altura + " é: " + area);

        // Fechar o Scanner
        scanner.close();
    }
}

