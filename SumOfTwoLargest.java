/*
 * 3) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
 ##################################################################################################
 3) Read 3 values (consider that equal values will not be entered) and write the sum of the 2 larger.
 */

import java.util.Scanner;

public class SumOfTwoLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number : ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double sum = sum0fTwoLargest(num1, num2, num3);

        System.out.println("The sum of the two largest number is : " + sum);

        scanner.close();
    }
    public static double sum0fTwoLargest(double num1, double num2, double num3){
        if(num1 >= num2 && num1 >= num3){
            return num1 + Math.max(num2, num3);
        }else if (num2 >= num1 && num2 >= num3) {
            return num2 + Math.max(num1, num3);
        }else {
            return num3 +  Math.max(num1, num2);
        }
    }
}
