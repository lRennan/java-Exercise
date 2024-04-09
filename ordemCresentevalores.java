/*7) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.
7) Read two values (consider that the same values will not be read) and write them in ascending order.
 */

import java.util.Scanner;
public class ordemCresentevalores {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor : ");
		double valor1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double valor2 = scanner.nextDouble();
		
		double menorvalor = (valor1 < valor2)? valor1 : valor2;
		double maiorvalor = (valor1 > valor2)? valor1 : valor2;
		
		System.out.println("Os valores em ordem crecente são " + menorvalor + " e " + maiorvalor);
		scanner.close();
	}
}


