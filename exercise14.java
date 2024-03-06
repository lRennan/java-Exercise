/*
14) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
 Calcular e escrever o valor do novo salário.

14) Write an algorithm to read an employee's current monthly salary and the adjustment percentage. 
Calculate and write the value of the new salary.
*/

import java.util.Scanner;

public class exercise14/*ReajusteSalarial*/ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do salário mensal atual
        System.out.print("Digite o salário mensal atual: ");
        double salarioAtual = scanner.nextDouble();

        // Leitura do percentual de reajuste
        System.out.print("Digite o percentual de reajuste: ");
        double percentualReajuste = scanner.nextDouble();

        // Cálculo do novo salário
        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

        // Exibição do novo salário
        System.out.println("O novo salário é: " + novoSalario);

        scanner.close();
    }
}


