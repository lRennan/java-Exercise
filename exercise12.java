/* 12) Escreva um algoritmo para ler as dimensões de um circulo (raio), calcular e escrever a área do circulo. a=pi*r²
12) Write an algorithm to read the dimensions of a circle (radius), calculate and write the area of the circle. a=pi*r²
*/




import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        // Criar um Scanner para ler as dimensões do círculo
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir o raio do círculo
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        // Definir o valor de pi
        double pi = Math.PI;

        // Calcular a área do círculo usando a fórmula: área = pi * raio^2
        double area = pi * Math.pow(raio, 2);

        // Exibir o resultado
        System.out.println("A área do círculo com raio " + raio + " é: " + area);

        // Fechar o Scanner
        scanner.close();
    }
}
