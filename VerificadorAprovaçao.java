import java.util.Scanner;

public class VerificadorAprovaçao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as quatro notas escolares do aluno:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if (media >= 5) {
            System.out.println("O aluno foi aprovado com média: " + media);
        } else {
            System.out.println("O aluno não foi aprovado com média: " + media);
        }
        
        scanner.close();
    }
}
