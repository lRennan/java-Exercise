/* 9) Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do somatório e a média aritmética dos valores lidos.
 * 9) Create a program that reads 10 numerical values ​​and presents at the end the total sum and the arithmetic mean of the values ​​read.
 */






import java.util.Scanner;

public class SumAndMeanCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers ");
        System.out.println("##############################");

        double sum = 0;
        int count = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println("Enter value" + i + ": ");
            double value = scanner.nextDouble();
            sum += value;
            count++;
        }

        double mean = sum / count;

        System.out.println("Total sum: " + sum);
        System.out.println("Arithmetic mean: " + mean);

        scanner.close();
    }
    
}
