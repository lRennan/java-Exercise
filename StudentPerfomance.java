/*14) Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:


MEDIA_DE_APROVEITAMENTO = N1+ N2 * 2 + N3 * 3 + MEDIA_DOS_EXERCICIOS / 7 



A atribuição de conceitos obedece a tabela abaixo:

media de aproveitamento    |    CONCEITO
>= 9,0                            A   
>= 7,5 e < 9,0                    B  
>= 6,0 e < 7,5                    C
< 6,0                             D  

14) Create an algorithm to read the 3 grades obtained by a student in the 3 checks and the average of the exercises that are part of the assessment. Calculate the average achievement using the formula below and write the student's concept according to the table of concepts below:


AVERAGE_OF_EXERCICTMENT = N1+ N2 * 2 + N3 * 3 + AVERAGE_DOS_EXERCICIOS / 7



The attribution of concepts follows the table below:

utilization average | CONCEPT
>= 9.0              |   A
>= 7.5 and < 9.0    |   B
>= 6.0 and < 7.5    |   C
< 6.0               |   D

*/

import java.util.Scanner;

public class StudentPerfomance {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the grade for the first check check: ");
        double grade1 = scanner.nextDouble();

        System.out.println("Enter the grade for the second check: ");
        double grade2 = scanner.nextDouble();

        System.out.println("Enter the grade for the third check:");
        double grade3 = scanner.nextDouble();

        System.out.println("Enter the average of exercises");
        double exerciseAverage = scanner.nextDouble();

        double averageAchievement = (grade1 + grade2 * 2 + grade3 * 3 + exerciseAverage) / 7;

        char concept;
        if(averageAchievement >= 9.0){
            concept = 'A';
        }else if (averageAchievement >= 7.5){
            concept = 'B';
        }else if (averageAchievement >= 6.0){
            concept = 'C';
        }else{
            concept = 'D';
        }

        System.out.println("Average achievement: " + averageAchievement);
        System.out.println("Concept: " + concept);
        
        scanner.close();
    }    
}
