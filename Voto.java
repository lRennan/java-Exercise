/*5) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

5) Read the current year and year of birth of a person. Write a message that says whether or not they will be able to vote this year (it is not necessary to consider the month in which the person was born).
 */

import java.util.Scanner;
public class Voto {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Digite o ano atual");
		int anoAtual = scanner.nextInt();
		
		System.out.println("Digite o ano de nascimento : ");
		int anoNascimento = scanner.nextInt();
		
		int idade = anoAtual - anoNascimento;
		
		String mensagem = (idade >= 16)? "pode votar este ano" : " nao pode votar esse ano";
		
		System.out.println(mensagem);
		
		scanner.close();
	}
}
