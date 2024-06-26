/*
19) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, 
utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto

19) Calculate the number of liters of fuel used on a trip,
 using a car that travels 12 km per liter. To obtain the calculation, the user must provide the time spent
 * 
 */




import java.util.Scanner;

public class CalculoConsumoCombustivel{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempoViagem = scanner.nextDouble();

        System.out.print("Digite a velocidade média durante a viagem (em Km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        double consumoVeiculo = 12.0;

        double distanciaPercorrida = tempoViagem * velocidadeMedia;

        double litrosConsumidos = distanciaPercorrida / consumoVeiculo;

        System.out.println("Velocidade média: " + velocidadeMedia + " Km/h");
        System.out.println("Tempo gasto na viagem: " + tempoViagem + " horas");
        System.out.println("Distância percorrida: " + distanciaPercorrida + " Km");
        System.out.println("Quantidade de litros de combustível gasta: " + litrosConsumidos + " litros");

        scanner.close();
    }
}

