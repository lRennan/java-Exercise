/*
15) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

 15) The cost of a new car to the consumer is the sum of the factory cost plus the distributor's percentage and taxes (applied to the factory cost). Assuming that the distributor's percentage is 28% and taxes are 45%, write an algorithm to read the factory cost of a car, calculate and write the final cost to the consumer.
*/




import java.util.Scanner;

public class exercise15 /* CustoCarro */ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do custo de fábrica
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        // Percentual do distribuidor
        double percentualDistribuidor = 28.0;

        // Percentual de impostos
        double percentualImpostos = 45.0;

        // Cálculo do custo final ao consumidor
        double custoFinal = custoFabrica + (custoFabrica * percentualDistribuidor / 100)
                + (custoFabrica * percentualImpostos / 100);

        // Exibição do custo final ao consumidor
        System.out.println("O custo final ao consumidor é: " + custoFinal);

        scanner.close();
    }
}

