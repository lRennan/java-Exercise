/*1) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
contrário escrever NÃO É MAIOR QUE 10! 
1) Read a value and write the message IS GREATER THAN 10! if the value read is greater than 10, if
otherwise write NOT GREATER THAN 10!
*/
import java.util.Scanner;

public class exercise31 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero!  ");
        int numero  = scanner.nextInt();
        
        if(numero > 10) {
            System.out.println("É maior que 10! ");
        }else{
            System.out.println("Nao é maior que 10!");
        }
        
        scanner.close();   
    }

}