/*
 * 10) Create a program that presents the results of the sum and arithmetic mean of even values ​​located in the numerical range of 50 to 70.
 * 10) Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores pares situados na faixa numérica de 50 a 70.
 */

public class EvenValueInRange {
    public static void main(String[] args){

        int start = 50;
        int end = 70;

        int sum = 0;
        int count = 0;

        for(int i = start; i <= end; i++){
            if (i % 2 == 0){
                sum += i;
                count++;
            }
        }

        double mean = (double) sum / count;

        System.out.println("Sum of even values in the range " + start + " to " + end + ": " + sum);
        System.out.println("Arithmetic mean of even values in the range " + start + " to " + end + ": " + mean);
    } 
}
