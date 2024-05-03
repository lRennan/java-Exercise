/*10) Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa deve apresentar os valores das duas temperaturas. A fórmula de conversão é F = (9*C+160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. 
 * 
 * 10) Create a program that displays the conversion values ​​of degrees Celsius into Fahrenheit, every 10 degrees, starting the count at 10 degrees Celsius and ending at 100 degrees Celsius. The program must display the values ​​of both temperatures. The conversion formula is F = (9*C+160)/5, with F being the temperature in Fahrenheit and C being the temperature in Celsius.
*/
public class CelsiusToFahrenheit {
    public static void main(String[] args){
        System.out.println("Celsius\t Fahrenheit");

        for(int celsiu = 10; celsiu <= 100; celsiu +=10){
            double Fahrenheit = (9.0 * celsiu + 160.0) / 5.0;
            System.out.println(celsiu + "\t " + Fahrenheit);
        }
    }
    
}
