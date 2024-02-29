/* 11) Escreva um algoritmo para ler as dimensões de um trapézio (base amior, base menor e altura), calcular e escrever a área do trapézio. a=(B+b).h/2
11) Write an algorithm to read the dimensions of a trapezoid (largest base, smallest base and height), calculate and write the area of the trapezoid. a=(B+b).h/2
*/



import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        // Criar um Scanner para ler as dimensões do trapézio
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir a base maior do trapézio
        System.out.print("Digite a base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();

        // Solicitar ao usuário para inserir a base menor do trapézio
        System.out.print("Digite a base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();

        // Solicitar ao usuário para inserir a altura do trapézio
        System.out.print("Digite a altura do trapézio: ");
        double altura = scanner.nextDouble();

        // Calcular a área do trapézio usando a fórmula: área = (baseMaior + baseMenor) * altura / 2
        double area = (baseMaior + baseMenor) * altura / 2;

        // Exibir o resultado
        System.out.println("A área do trapézio com base maior " + baseMaior +
                ", base menor " + baseMenor + " e altura " + altura + " é: " + area);

        // Fechar o Scanner
        scanner.close();
    }
}
