/*6) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
6) Read two values (consider that the same values will not be read) and write the larger one.
 */

import java.util.Scanner;

public class lerMaiorValor {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor : ");
		double valor1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double valor2 = scanner.nextDouble();
		
		double maiorvalor = (valor1 > valor2)? valor1 : valor2;
		
		System.out.println("O maior valor é " + maiorvalor);
		
		scanner.close();
	}


}

