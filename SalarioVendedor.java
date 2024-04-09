/*10) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.
10) Read the fixed salary and the value of sales made by a company's salesperson. Knowing that he receives a commission of 3% on total sales up to R$1,500.00 plus 5% on anything exceeding this amount, calculate and write down your total salary.
 */

import java.util.Scanner;

public class SalarioVendedor {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o salário fixo do vendedor: R$ ");
	double salarioFixo = scanner.nextDouble();
	
	System.out.println("Digite o valor das vendas  efetuadas pelo vendedor: R");
	double valorVendas = scanner.nextDouble();
	
	double comissao;
	if(valorVendas <= 1500) {
		comissao = valorVendas * 0.03;
	}else {
		comissao = 1500 * 0.03 + (valorVendas - 1500) * 0.05;
	}
	
	double salarioTotal = salarioFixo + comissao;
	System.out.println("O salario total do vendedor é R$" + salarioTotal);
	scanner.close();
	}
}
