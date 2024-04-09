/*
14) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
 Calcular e escrever o valor do novo salário.

14) Write an algorithm to read an employee's current monthly salary and the adjustment percentage. 
Calculate and write the value of the new salary.
*/

import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário mensal atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste: ");
        double percentualReajuste = scanner.nextDouble();

        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

        System.out.println("O novo salário é: " + novoSalario);

        scanner.close();
    }
}


