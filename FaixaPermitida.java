import java.util.Scanner;

public class FaixaPermitida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira um valor entre 1 e 9
        System.out.println("Digite um valor entre 1 e 9:");
        int valor = scanner.nextInt();
        
        // Verifica se o valor está dentro da faixa permitida (entre 1 e 9)
        if (valor >= 1 && valor <= 9) {
            System.out.println("O valor está na faixa permitida.");
        } else {
            System.out.println("O valor está fora da faixa permitida.");
        }
        
        scanner.close();
    }
}
