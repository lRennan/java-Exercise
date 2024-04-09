import java.util.Scanner;

public class VerificadorAprovacaoComExame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as quatro notas escolares do aluno:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();
        
        // Calcula a média das notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        // Verifica se o aluno foi aprovado diretamente
        if (media >= 7) {
            System.out.println("O aluno foi aprovado com média: " + media);
        } else {
            System.out.println("O aluno não foi aprovado com média: " + media);
            System.out.println("Digite a nota do exame:");
            double notaExame = scanner.nextDouble();
            
            // Calcula a nova média considerando o exame
            double novaMedia = (media + notaExame) / 2;
            
            // Verifica se o aluno foi aprovado após o exame
            if (novaMedia >= 5) {
                System.out.println("O aluno foi aprovado em exame com média: " + novaMedia);
            } else {
                System.out.println("O aluno não foi aprovado em exame com média: " + novaMedia);
            }
        }
        
        scanner.close();
    }
}
