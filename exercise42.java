/*12) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidademédia = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.
12) Make an algorithm to read: current quantity in stock, maximum quantity in stock and minimum quantity in stock of a product. Calculate and write the average quantity ((average quantity = maximum quantity + minimum quantity)/2). If the quantity in stock is greater than or equal to the average quantity, write the message 'Do not purchase', otherwise write the message 'Make purchase'.
 */

import java.util.Scanner;
public class exercise42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Digite a quantidade atual em estoque: ");
		int quantidadeAtual = scanner.nextInt();
		
		System.out.print("Digite a quantidade máxima em estoque ");
		int quantidadeMaxima = scanner.nextInt();
		
		System.out.print("Digite a quantidade mínima em estoque ");
		int quantidadeMinima = scanner.nextInt();
		
		int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;
		
		if (quantidadeAtual >= quantidadeMedia) {
			System.out.print("Nao efetuar compra ");
		}else {
			System.out.println("efetuar compra");
		}
	
		scanner.close();
	
	}

}
