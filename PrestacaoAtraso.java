/*
20) Calculate and present the value of a late installment, using the formula INSTALLMENT=VALUE+(VALUE*RATE/100)*TIME).
20) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).
 * 
 */


import java.util.Scanner;

public class PrestacaoAtraso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (em %): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite o tempo de atraso (em meses): ");
        int tempoAtraso = scanner.nextInt();

        double valorPrestacaoAtraso = valorPrestacao + (valorPrestacao * taxaJuros / 100) * tempoAtraso;

        System.out.println("O valor da prestação em atraso é: " + valorPrestacaoAtraso);

        scanner.close();
    }
}

