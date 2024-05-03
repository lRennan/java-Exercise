/*
7) Ler dois valores e imprimir uma das três mensagens a seguir:
‘Números iguais’, caso os números sejam iguais
‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
‘Segundo maior’, caso o segundo seja maior que o primeiro.
#################################################################################
7) Read two values and print one of the following three messages:
‘Equal numbers’, if the numbers are the same
‘First is bigger’, if the first is bigger than the second;
‘Second largest’, if the second is greater than the first.
*/

import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter the second number");
        double secondNumber = scanner.nextDouble();

        if(firstNumber == secondNumber){
            System.out.println("Equal number");
        }  else if(firstNumber > secondNumber){
                System.out.println("First " + firstNumber + " is bigger");
        }  else {
            System.out.println("Seconde number : " + secondNumber + " is bigger ");
        }

        scanner.close();
    
    }
}
