/*4) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a subtração dos valores.
4) Write an algorithm to read two values from the keyboard and display the subtraction of the values as a response
*/

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        int subtracao = primeiroNumero - segundoNumero;

        System.out.println("A subtração de " + primeiroNumero + " e " + segundoNumero + " é: " + subtracao);

        scanner.close();
    }
}

