/*9) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

9) An employee's weekly working hours are 40 hours. Employees who work more than 40 hours will receive overtime, calculated at the regular hourly rate plus a 50% increase. Write an algorithm that reads the number of hours worked in a month, the hourly salary and writes the employee's total salary, which must be added to overtime, if they were worked (consider that the month has 4 exact weeks).
 */

import java.util.Scanner;

public class jornadaTrabalho {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número de horas trabalhadas em um mês");
		int horasTrabalhadas = scanner.nextInt();
		
		System.out.print("Digite o salário por hora:");
		double salarioPorHora = scanner.nextDouble();
		
		int cargaHorariaSemanal = 40;
		int semanasNomes = 4;
		
		int horasRegulares = cargaHorariaSemanal * semanasNomes;
		double salarioTotal;
		if (horasTrabalhadas <= horasRegulares) {
			salarioTotal = horasTrabalhadas * salarioPorHora;
		}else {
			int horasExtras = horasTrabalhadas - horasRegulares;
			double salarioHorasExtras = salarioPorHora * 1.5;
			salarioTotal = (horasRegulares * salarioPorHora)+ (horasExtras *salarioHorasExtras);
		}
		System.out.println("O salário total do funcionário é R$ " + salarioTotal);
		scanner.close();
	}
	
}
