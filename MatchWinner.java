/* 
6) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
##########################################################################################################################
6) Read the name of 2 teams and the number of goals scored in the match (for each team). Write the winner's name. If there is no winner, the word DRAW must be printed.
*/

import java.util.Scanner;

public class MatchWinner {
    public static void main(String[] args){
        Scanner scanner = new  Scanner(System.in);

        System.out.print("Enter the name of team 1:  ");
        String team1 = scanner.nextLine();

        System.out.println("Enter the number of goals scored by " + team1 + ": ");
        int goals1 = scanner.nextInt();

        System.out.print("Enter the name of team 2 :");
        scanner.nextLine();
        String team2 = scanner.nextLine();

        System.out.print("Enter the number of goals scored by " + team2 + ":" );
        int goals2 = scanner.nextInt();

        String winner;
        if(goals1 > goals2) {
            winner = team1;
        }else if (goals2 > goals1){
            winner = team2;
        }else {
            winner = "DRAW";

        }
        System.out.println("winner : " + winner);
        scanner.close();
    }
}