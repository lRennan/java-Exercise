import java.util.Scanner;

public class DiferencaMaiorMenor /*diferença maior numero*/{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();
        
        int diferenca;
        if (numero1 > numero2) {
            diferenca = numero1 - numero2;
        } else {
            diferenca = numero2 - numero1;
        }
        
        System.out.println("A diferença entre o maior e o menor valor é: " + diferenca);
        
        scanner.close();
    }
}
