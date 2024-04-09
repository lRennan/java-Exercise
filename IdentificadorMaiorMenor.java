import java.util.Scanner;

public class IdentificadorMaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira cinco números inteiros
        System.out.println("Digite cinco números inteiros:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        int numero4 = scanner.nextInt();
        int numero5 = scanner.nextInt();
        
        // Inicializa as variáveis maior e menor com o primeiro número digitado
        int maior = numero1;
        int menor = numero1;
        
        // Verifica se os demais números são maiores ou menores
        if (numero2 > maior) {
            maior = numero2;
        } else if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 > maior) {
            maior = numero3;
        } else if (numero3 < menor) {
            menor = numero3;
        }
        if (numero4 > maior) {
            maior = numero4;
        } else if (numero4 < menor) {
            menor = numero4;
        }
        if (numero5 > maior) {
            maior = numero5;
        } else if (numero5 < menor) {
            menor = numero5;
        }
        
        // Exibe o maior e o menor números
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        
        scanner.close();
    }
}
