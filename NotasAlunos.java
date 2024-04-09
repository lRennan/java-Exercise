/*4) Ler as notas da 1a. e 2a. avaliações de um aluno. 
Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado 
(considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.


4) Read the notes from 1st. and 2nd. student evaluations. Calculate the simple arithmetic mean and write a message that says whether the student passed or not (consider that a score equal to or greater than 6 means the student passes). Also write the calculated average.
 */

import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a nota da primeiro avaliaçao: ");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a nota da segunda avaliaçao: ");
        double nota2 =scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        String status = (media >= 6) ? "aprovado" : "reprovados";
        
        System.out.println("A media do aluno é: " + media);
        System.out.println("O aluno esta " + status + ".");
        
        scanner.close();
    }
}
