/*
 * 11) Create a program that presents as a result the factorial value of odd values ​​located in the numerical range from 1 to 10
 * 
 * 11) Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares situados na faixa numérica de 1 a 10..
 */

public class FactorialOfOddNumbers {
    public static void main(String[] args){
        System.out.println("Number\t Factorial");

        for(int i = 1; i <= 10; i += 20 ){
            long factorial = calculateFactorial(i);
            System.out.println(i + "\t " + factorial);
        }
    }

    public static long calculateFactorial(int n ){
        long factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
}
