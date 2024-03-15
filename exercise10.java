/* 10) Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular e escrever a área do losango. Dica a=D.d/2
10) Write an algorithm to read the dimensions of a rhombus (major diagonal, minor diagonal), calculate and write the area of the rhombus. Tip a=D.d/2
*/
import java.util.Scanner;

public class exercise10 /*LosangoArea*/{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();

      
        System.out.print("Digite a diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();

        
        double area = (diagonalMaior * diagonalMenor) / 2;

      
        System.out.println("A área do losango com diagonal maior " + diagonalMaior +
                " e diagonal menor " + diagonalMenor + " é: " + area);

        // Fechar o Scanner
        scanner.close();
    }
}

