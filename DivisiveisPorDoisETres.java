import java.util.Scanner;

public class DivisiveisPorDoisETres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite quatro números inteiros:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        int numero4 = scanner.nextInt();
        
        verificarDivisibilidade(numero1);
        verificarDivisibilidade(numero2);
        verificarDivisibilidade(numero3);
        verificarDivisibilidade(numero4);
        
        scanner.close();
    }
    
    public static void verificarDivisibilidade(int numero) {
        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println(numero + " é divisível por 2 e 3.");
        }
    }
}
