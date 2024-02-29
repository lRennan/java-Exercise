/*6) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a divisão dos valores.
6) Write an algorithm to read two values from the keyboard and display the division of the values as a response.
*/
import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        // Criar um Scanner para ler os valores do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir o primeiro número
        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();

        // Solicitar ao usuário para inserir o segundo número
        System.out.print("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();

        // Verificar se o segundo número é diferente de zero para evitar a divisão por zero
        if (segundoNumero != 0) {
            // Calcular a divisão dos dois valores
            double divisao = primeiroNumero / segundoNumero;

            // Exibir o resultado
            System.out.println("A divisão de " + primeiroNumero + " por " + segundoNumero + " é: " + divisao);
        } else {
            System.out.println("Não é possível dividir por zero. Por favor, insira um segundo número diferente de zero.");
        }

        // Fechar o Scanner
        scanner.close();
    }
}



