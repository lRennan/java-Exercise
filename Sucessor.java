/*  1) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número sucessor.
    1) Write an algorithm to read a value from the keyboard and display the successor number as a response.

*/

import  java.util.Scanner;


public class Sucessor {
        public static void main(String[] args) {

            try {
                System.out.println("Digite um numero para saber o seu sucessor ");

                Scanner sc = new Scanner(System.in);
                int numero = sc.nextInt();
                int sucessor = numero +1;

                System.out.println("O sucessor de " + numero  + " é: "+ sucessor);
                
                sc.close();
                
            }catch(Exception e ) {
            
            }
    }
    
}
