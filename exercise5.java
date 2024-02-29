/* 5) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a multiplicação dos valores.
5) Write an algorithm to read two values from the keyboard and display the multiplication of the values as a response

 * 
*/




import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        // Criar um Scanner para ler os valores do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir o primeiro número
        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();

        // Solicitar ao usuário para inserir o segundo número
        System.out.print("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();

        // Calcular a multiplicação dos dois valores
        double multiplicacao = primeiroNumero * segundoNumero;

        // Exibir o resultado
        System.out.println("A multiplicação de " + primeiroNumero + " e " + segundoNumero + " é: " + multiplicacao);

        // Fechar o Scanner
        scanner.close();
    }
}
