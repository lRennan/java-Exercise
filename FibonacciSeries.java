/*
 * 9) Write a program that presents the Fibonacci series up to the fifteenth term. The Fibonacci series is formed by the sequence: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. This series is characterized by the sum of a current term with its previous subsequent term, so that the next value in the sequence is formed. So starting with the numbers 1, 1 the next term is 1+1=2, the next is 1+2=3, the next is 2+3=5, the next 3+5=8, etc.
 * 
 * 9) Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.
 */

public class FibonacciSeries {
    public static void main(String[] args){
        int currentTerm = 1;
        int previousTerm = 0;

        System.out.println("Fibonacc series up to the fifteenth term");
        System.out.println(previousTerm + ", " + currentTerm);

        for(int i = 2; i < 15; i++) {
            int nextTerm = currentTerm + previousTerm;
            System.out.println(", " + nextTerm);

            previousTerm = currentTerm;
            currentTerm = nextTerm;
        }
    }
}
