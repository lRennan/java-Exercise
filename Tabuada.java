/*1) Present the results of a multiplication table (from 1 to 10) of any number.
 * 
 * 1) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.

 */


import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de multiplicação para o número " + numero + ":");
        for (int i = 1; i <=10; i++){
            int resultado = numero *  i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
    
}