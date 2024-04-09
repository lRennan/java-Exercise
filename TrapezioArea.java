/* 11) Escreva um algoritmo para ler as dimensões de um trapézio (base amior, base menor e altura), calcular e escrever a área do trapézio. a=(B+b).h/2
11) Write an algorithm to read the dimensions of a trapezoid (largest base, smallest base and height), calculate and write the area of the trapezoid. a=(B+b).h/2
*/



import java.util.Scanner;

public class TrapezioArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();

        System.out.print("Digite a base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Digite a altura do trapézio: ");
        double altura = scanner.nextDouble();

        double area = (baseMaior + baseMenor) * altura / 2;

        System.out.println("A área do trapézio com base maior " + baseMaior +
                           ", base menor " + baseMenor + " e altura " + altura + " é: " + area);

        scanner.close();
    }
}
