/*8) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
8) Read the start time and end time of a chess game (only consider whole hours, without minutes) and calculate the duration of the game in hours, knowing that the maximum duration of the game is 24 hours and that the game can start one day and end the next day.

 */

import java.util.Scanner;

public class exercise38 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a hora de início do jogo ( 0a 23): ");
		int horaInicio = scanner.nextInt();
		
		System.out.print("Digite a hora de fim do jogo (0 a 23):");
		int horaFim = scanner.nextInt();
		
		int duracao;
		if(horaFim >= horaInicio) {
			duracao = horaFim - horaInicio;
		}else {
			duracao = 24 - horaInicio + horaFim;
		}
		System.out.println("A duração do jogo foi de " + duracao + " horas. ");
		
		scanner.close();
	}

}
