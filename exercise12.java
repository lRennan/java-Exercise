/* 12) Escreva um algoritmo para ler as dimensões de um circulo (raio), calcular e escrever a área do circulo. a=pi*r²
12) Write an algorithm to read the dimensions of a circle (radius), calculate and write the area of the circle. a=pi*r²
*/




import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double pi = Math.PI;

        double area = pi * Math.pow(raio, 2);

        System.out.println("A área do círculo com raio " + raio + " é: " + area);

        scanner.close();
    }
}
