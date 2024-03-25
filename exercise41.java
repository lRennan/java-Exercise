/*11) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
11) Make an algorithm to read: customer account number, balance, debit and credit. Afterwards, calculate and write the current balance (current balance = balance - debit + credit). Also test if current balance is greater than or equal to zero write the message 'Positive Balance', otherwise write the message 'Negative Balance'.
 */
import java.util.Scanner;
public class exercise41 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número da conta do cliente: ");
		int numeroConta = scanner.nextInt();
		System.out.print("Digite o saldo do cliente R$ ");
		double saldo = scanner.nextDouble();
		
		System.out.print("Digite o débito do cliente: R$");
		double debito = scanner.nextDouble();
		
		System.out.print("Digite o crédito do criente: R$ ");
		double credito = scanner.nextDouble();
		
		double saldoAtual = saldo - debito + credito;
		
		if(saldoAtual >= 0) {
			System.out.print("Saldo Positivo");
		}else {
			System.out.print("Saldo negativo");
		}
		System.out.println("O saldo atual do cliente é R$ " + saldoAtual); 
		
		scanner.close();
	}
}
