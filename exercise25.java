/* 
4) Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor em moeda brasileira.

4) Create a program that displays the conversion value into reais of a value read in dollars. The program must request the value of the dollar exchange rate and also the amount of dollars available to the user, so that the value in Brazilian currency is displayed.
 */
import java.util.Scanner;

public class exercise25/*ConversaoDolarReal */{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário a cotação do dólar e a quantidade de dólares disponíveis
        System.out.println("Digite a cotação atual do dólar:");
        double cotacaoDolar = scanner.nextDouble();
        
        System.out.println("Digite a quantidade de dólares disponíveis:");
        double quantidadeDolares = scanner.nextDouble();
        
        // Calcula o valor em reais convertido a partir do valor em dólares e da cotação do dólar
        double valorReal = quantidadeDolares * cotacaoDolar;
        
        // Exibe o valor convertido em reais
        System.out.println("O valor em reais é: R$ " + valorReal);
        
        scanner.close();
    }
}

