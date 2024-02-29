/*9) Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a área do quadrado. Dica a=l²
9) Write an algorithm to read the dimensions of a square (side), calculate and write the area of the square. Tip a=l²
*/
import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        // Criar um Scanner para ler as dimensões do quadrado
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir o lado do quadrado
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        // Calcular a área do quadrado usando a fórmula: área = lado * lado
        double area = Math.pow(lado, 2);

        // Exibir o resultado
        System.out.println("A área do quadrado com lado " + lado + " é: " + area);

        // Fechar o Scanner
        scanner.close();
    }
}

