/*7) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo. Dica a=b.h
7) Write an algorithm to read the dimensions of a rectangle (base and height), calculate and write the area of the rectangle. Tip a=b.h
*/
import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        // Criar um Scanner para ler as dimensões do retângulo
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir a base do retângulo
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        // Solicitar ao usuário para inserir a altura do retângulo
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        // Calcular a área do retângulo usando a fórmula: área = base * altura
        double area = base * altura;

        // Exibir o resultado
        System.out.println("A área do retângulo com base " + base + " e altura " + altura + " é: " + area);

        // Fechar o Scanner
        scanner.close();
    }
}


