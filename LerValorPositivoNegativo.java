/* 2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo)
2) Read a value and write whether it is positive or negative (consider zero value as positive)
*/
import java.util.Scanner;

public class LerValorPositivoNegativo {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        
        if(numero >=0) {
            System.out.println("O numero é positivo");
        }else {
            System.out.println("O numero é negativo. ");
        }
        scanner.close();
    }
}
