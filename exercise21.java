/*
21) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B
 e efetuar a troca dos valores 
de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. 
Apresentar os valores trocados.

21) Read two values (integers, reals or characters) for variables A and B
and exchange the values so that variable A now has the value of variable B and 
variable B now has the value of variable A. Present the values exchanged. 
*/

import java.util.Scanner;

public class exercise21/*TrocaValores*/ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor para a variável A: ");
        String A = scanner.next();

        System.out.print("Digite o valor para a variável B: ");
        String B = scanner.next();

        System.out.println("Valores originais: A = " + A + ", B = " + B);

        String temp = A;
        A = B;
        B = temp;

        System.out.println("Valores trocados: A = " + A + ", B = " + B);

        scanner.close();
    }
}

