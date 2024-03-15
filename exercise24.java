/*3) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo.

3) Read two integers (variables A and B) and print the result of the square of the difference between the first value and the second.
 * 
 */






import java.util.Scanner;

public class exercise24/*QuadradoDiferenca*/ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor de A:");
        int a = scanner.nextInt();
        
        System.out.println("Digite o valor de B:");
        int b = scanner.nextInt();
        
        int diferenca = a - b;
        int quadradoDiferenca = diferenca * diferenca;
        
        System.out.println("O quadrado da diferença entre A e B é: " + quadradoDiferenca);
        
        scanner.close();
    }
}
