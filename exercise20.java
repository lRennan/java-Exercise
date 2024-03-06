/*
20) Calculate and present the value of a late installment, using the formula INSTALLMENT=VALUE+(VALUE*RATE/100)*TIME).
20) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).
 * 
 */


import java.util.Scanner;

public class exercise20 /*PrestacaoAtraso*/ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do valor da prestação
        System.out.print("Digite o valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();

        // Leitura da taxa de juros
        System.out.print("Digite a taxa de juros (em %): ");
        double taxaJuros = scanner.nextDouble();

        // Leitura do tempo de atraso
        System.out.print("Digite o tempo de atraso (em meses): ");
        int tempoAtraso = scanner.nextInt();

        // Cálculo do valor da prestação em atraso
        double valorPrestacaoAtraso = valorPrestacao + (valorPrestacao * taxaJuros / 100) * tempoAtraso;

        // Exibição do valor da prestação em atraso
        System.out.println("O valor da prestação em atraso é: " + valorPrestacaoAtraso);

        scanner.close();
    }
}

