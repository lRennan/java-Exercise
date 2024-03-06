/* 5) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a multiplicação dos valores.
5) Write an algorithm to read two values from the keyboard and display the multiplication of the values as a response

 * 
*/




import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();

        double multiplicacao = primeiroNumero * segundoNumero;

        System.out.println("A multiplicação de " + primeiroNumero + " e " + segundoNumero + " é: " + multiplicacao);

        scanner.close();
    }
}
