/*
17) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula deconversão é C=(F-32)*(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

17) Read a temperature in degrees Fahrenheit and display it converted into degrees Celsius. The conversion formula is C=(F-32)*(5/9), with F being the temperature in Fahrenheit and C being the temperature in Celsius.
 */





import java.util.Scanner;

public class exercise17 /*FahrenheitParaCelsius*/ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = (temperaturaFahrenheit - 32) * (5.0 / 9);

        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);

        scanner.close();
    }
}

