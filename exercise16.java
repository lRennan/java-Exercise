/*
16) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

16) Read a temperature in degrees Celsius and display it converted into degrees Fahrenheit.
 The conversion formula is F = (9*C + 160)/5, with F being the temperature in Fahrenheit and C being the temperature in Celsius.
 
 */






import java.util.Scanner;

public class exercise16 /*CelsiusPanraFahrenheit */ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);

        scanner.close();
    }
}

