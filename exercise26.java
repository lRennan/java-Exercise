/*5) Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à soma dos quadrados dos três valores lidos.
*/

import java.util.Scanner;

public class exercise26/*2SomaQuadrados*/ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário para inserir os três valores
        System.out.println("Digite o valor de A:");
        double a = scanner.nextDouble();
        
        System.out.println("Digite o valor de B:");
        double b = scanner.nextDouble();
        
        System.out.println("Digite o valor de C:");
        double c = scanner.nextDouble();
        
        // Calcula o quadrado de cada valor e soma os resultados
        double somaQuadrados = (a * a) + (b * b) + (c * c);
        
        // Exibe o resultado da soma dos quadrados
        System.out.println("A soma dos quadrados dos três valores é: " + somaQuadrados);
        
        scanner.close();
    }
}
