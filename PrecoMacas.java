/*3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, 
e R$ 1,00 se foremcompradas pelo menos 12. Escreva um programa que leia o 
número de maçãs compradas, calcule e escreva o custo total da compra.

3) Apples cost R$1.30 each if less than a dozen are purchased, 
and R$1.00 if at least 12 are purchased. Write a program that reads the number of apples purchased, 
calculates and writes the total cost of the purchase .
 */

import java.util.Scanner;

public class PrecoMacas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantas maças fora comprados? ");
        int quantidadedeMacas = scanner.nextInt();
        
        double custoTotal;
        
        if(quantidadedeMacas < 12) {
            custoTotal = quantidadedeMacas * 1.30;
        }else {
            custoTotal = quantidadedeMacas * 1.00;
        }
        
        System.out.println("O custo total da compra é R$" + custoTotal);
        
        scanner.close();
    }
}
