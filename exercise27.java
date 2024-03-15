/*
6) Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final o quadrado da soma dos três valores lidos.

6) Create a program that reads three values (A, B and C) and presents as the final result the square of the sum of the three values read.
 * 
 */


import java.util.Scanner;

public class exercise27/*QuadradoSoma*/ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário para inserir os três valores
        System.out.println("Digite o valor de A:");
        double a = scanner.nextDouble();
        
        System.out.println("Digite o valor de B:");
        double b = scanner.nextDouble();
        
        System.out.println("Digite o valor de C:");
        double c = scanner.nextDouble();
        
        // Calcula a soma dos três valores e eleva ao quadrado
        double soma = a + b + c;
        double quadradoSoma = soma * soma;
        
        // Exibe o resultado do quadrado da soma
        System.out.println("O quadrado da soma dos três valores é: " + quadradoSoma);
        
        scanner.close();
    }
}

