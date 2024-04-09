/*
 * 7) Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C e D). Ao final o programa deve apresentar o resultado do produto (variável P) do primeiro com o terceiro valor e o resultado da soma (variável S) do segundo com o quarto valor.

 7) Create a computer program that reads four integer values (variables A, B, C and D). At the end, the program must present the result of the product (variable P) of the first with the third value and the result of the sum (variable S) of the second with the fourth value.

 */
import java.util.Scanner;

public class ProdutoSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor de A:");
        int a = scanner.nextInt();
        
        System.out.println("Digite o valor de B:");
        int b = scanner.nextInt();
        
        System.out.println("Digite o valor de C:");
        int c = scanner.nextInt();
        
        System.out.println("Digite o valor de D:");
        int d = scanner.nextInt();
        
        int produto = a * c;
        
        int soma = b + d;
        
        System.out.println("O resultado do produto de A por C é: " + produto);
        System.out.println("O resultado da soma de B com D é: " + soma);
        
        scanner.close();
    }
}

