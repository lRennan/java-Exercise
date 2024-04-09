/*
18) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura

18) Calculate and present the value of the volume of an oil can, using the formula: Volume = π*Radius2*Height
 */


import java.util.Scanner;

public class VolumeLataOleo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da lata de óleo: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura da lata de óleo: ");
        double altura = scanner.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("O volume da lata de óleo é: " + volume);

        scanner.close();
    }
}

