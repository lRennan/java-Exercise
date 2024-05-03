/*
 * 8) Create a program that presents as a result the value of a power of any base raised to any exponent, that is, BE, where B is the value of the base and E the value of the exponent. Note that in this exercise the Portuguese exponentiation operator (^) cannot be used.
 * 
 * 8) Elaborar um programa que apresente como resultado o valor de uma potência de uma base qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base e E o valor do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^)
 */


 import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a base (B): ");
        double base = scanner.nextDouble();
        System.out.print("Digite o expoente (E): ");
        int expoente = scanner.nextInt();

        double resultado = calcularPotencia(base, expoente);
        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);

        scanner.close();
    }

    public static double calcularPotencia(double base, int expoente) {
        double resultado = 1;

        if (expoente < 0) {
            base = 1 / base;
            expoente = -expoente;
        }
        
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}