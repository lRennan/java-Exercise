
/* 3) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a soma dos valores.
3) Write an algorithm to read two values from the keyboard and display the sum of the values as a response.
*/


import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        // Criar um Scanner para ler os valores do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir o primeiro número
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        // Solicitar ao usuário para inserir o segundo número
        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        // Calcular a soma dos dois valores
        int soma = primeiroNumero + segundoNumero;

        // Exibir o resultado
        System.out.println("A soma de " + primeiroNumero + " e " + segundoNumero + " é: " + soma);

        // Fechar o Scanner
        scanner.close();
    }
}
