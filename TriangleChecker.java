/* 
5) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
##################################################################################################################
5) Read 3 values (A, B and C) representing the measurements of the sides of a triangle and write whether or not they form a triangle. NOTE: to form a triangle, the value of each side must be less than the sum of the other 2 sides.
*/


import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);



        System.out.println( "Enter the length of side A: ");
        double sideA  = scanner.nextDouble();

        System.out.println("Enter the length of side B: ");
        double sideB = scanner.nextDouble();

        System.out.println("Enter the length of side C: ");
        double sideC = scanner.nextDouble();

        boolean isTriangle = (sideA + sideB > sideC) && (sideA + sideC > sideB)&& (sideB + sideC > sideA);

        if(isTriangle){
            System.out.println("The given side lengths form a triangle ");
        }else{
            System.out.println("The given side length do not form a traingle");
        }
        scanner.close();
    }    
}
