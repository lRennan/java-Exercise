/*
1) Ler um valor e escrever se é positivo, negativo ou zero.
################################################################
1) Read a value and write whether it is positive, negative or zero.
 */





import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if(number > 0){
            System.out.println("The number is positive:  ");
        }else if (number < 0) {
            System.out.println("the number is negative:  ");
        }else {
            System.out.println("the number is zero ");
        }

        scanner.close();
    }
}