import java.util.Scanner;

public class ValorMenorOuIgualTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira um valor inteiro
        System.out.println("Digite um valor inteiro:");
        int valor = scanner.nextInt();
        
        // Verifica se o valor não é maior que três e o apresenta, se for o caso
        if (valor <= 3) {
            System.out.println("O valor digitado é: " + valor);
        }
        
        scanner.close();
    }
}
