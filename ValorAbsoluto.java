import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            numero *= -1;
        }
        
        System.out.println("O valor absoluto do número fornecido é: " + numero);
        
        scanner.close();
    }
}
