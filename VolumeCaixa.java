/*2) Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.

2) Create a program that calculates and displays the volume of a rectangular box, using the formula VOLUME=LENGTH * WIDTH * HEIGHT.

 * 
 */

import java.util.Scanner;

public class VolumeCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Digite o comprimento da caixa:");
        double comprimento = scanner.nextDouble();
        
        System.out.println("Digite a largura da caixa:");
        double largura = scanner.nextDouble();
        
        System.out.println("Digite a altura da caixa:");
        double altura = scanner.nextDouble();
        
        double volume = comprimento * largura * altura;
        
        System.out.println("O volume da caixa é: " + volume);
        
        scanner.close();
    }
}
