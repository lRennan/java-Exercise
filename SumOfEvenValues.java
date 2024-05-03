/*
 * 3) Create a program that presents at the end the sum of the existing even values ​​in the range from 1 to 500.
 * 3) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.
 */

public class SumOfEvenValues {
    public static void main(String[] args){
        int start  = 1;
        int end = 500;
        int sum = 0 ;

        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }

        System.out.println("The sum of even vaues in the range from " + start + " to " + end + " is :  " + sum);
    }   
}
