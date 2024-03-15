/* 2) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número antecessor.
    2) Write an algorithm to read a value from the keyboard and display the predecessor number as a response.
*/

import java.util.Scanner;

public class exercise2 /*Antecessor*/{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int numero = scanner.nextInt();

        int antecessor = numero - 1;

        System.out.println("O antecessor de " + numero + " é: " + antecessor);

        scanner.close();
    }
}
