/* 2) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número antecessor.
    2) Write an algorithm to read a value from the keyboard and display the predecessor number as a response.
*/

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        // Criar um Scanner para ler o valor do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir um número
        System.out.print("Digite um número: ");

        // Ler o número digitado pelo usuário
        int numero = scanner.nextInt();

        // Calcular o antecessor
        int antecessor = numero - 1;

        // Exibir o resultado
        System.out.println("O antecessor de " + numero + " é: " + antecessor);

        // Fechar o Scanner
        scanner.close();
    }
}
