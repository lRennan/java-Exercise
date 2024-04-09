
/*
8) Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS).

8) Read the value corresponding to a worker's monthly salary (variable SM) and also the value of the adjustment percentage (variable PR) to be assigned. Display the value of the new salary (NS variable). 

 */




import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o salário mensal:");
        double salarioMensal = scanner.nextDouble();
        
        System.out.println("Digite o percentual de reajuste:");
        double percentualReajuste = scanner.nextDouble();
        
        double novoSalario = salarioMensal + (salarioMensal * percentualReajuste / 100);
        
        System.out.println("O novo salário é: " + novoSalario);
        
        scanner.close();
    }
}

