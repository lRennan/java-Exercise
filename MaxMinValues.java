/*
 * 12) Create a program that reads integer positive values ​​until a negative value is reported. At the end, the highest and lowest values ​​entered by the user must be presented
 * ###################.
 * 12) Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo usuário.
 */

import java.util.Scanner;

public class MaxMinValues {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Enter a positive integer value (or a negative value to stop): ");
            int num = scanner.nextInt();

            if(num < 0){
                break;
            }

            if(num > highest){
                highest = num;
            }
            if (num < lowest){
                lowest = num;
            }
        }

        if(highest != Integer.MIN_VALUE){
            System.out.println("Highest value entered: " + highest);
        }else {
            System.out.println("No positive values were entered.");
        }

        if (lowest != Integer.MAX_VALUE) {
            System.out.println("Lowest value entered: " + lowest);
        }else {
            System.out.println("No positive values were entered. ");
        }

        scanner.close();
    }
}