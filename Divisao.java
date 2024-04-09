/*6) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a divisão dos valores.
6) Write an algorithm to read two values from the keyboard and display the division of the values as a response.
*/
import java.util.Scanner;

public class  Divisao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();

        if (segundoNumero != 0) {
            double divisao = primeiroNumero / segundoNumero;

            System.out.println("A divisão de " + primeiroNumero + " por " + segundoNumero + " é: " + divisao);
        } else {
            System.out.println("Não é possível dividir por zero. Por favor, insira um segundo número diferente de zero.");
        }

        scanner.close();
    }
}



