
/* 3) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a soma dos valores.
3) Write an algorithm to read two values from the keyboard and display the sum of the values as a response.
*/


import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();
        
        int soma = primeiroNumero + segundoNumero;

        System.out.println("A soma de " + primeiroNumero + " e " + segundoNumero + " é: " + soma);

        scanner.close();
    }
}
