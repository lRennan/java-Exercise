/*1) Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na utilização do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de multiplicação e apresentar doze resultados de saída.
 
1) Read four integers and present the result of addition and multiplication, based on the use of the concept of the distributive property. In other words, if the variables A, B, C, and D are read, A with B, A with C and A with D must be added and multiplied. Then B with C, B with D and finally C with D. Understand that it will be necessary to perform six addition operations and six multiplication operations and present twelve output results.
 */



import java.util.Scanner;

public class Distributiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite quatro números inteiros:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        int somaAB = a + b;
        int somaAC = a + c;
        int somaAD = a + d;
        int somaBC = b + c;
        int somaBD = b + d;
        int somaCD = c + d;
        
        int multAB = a * b;
        int multAC = a * c;
        int multAD = a * d;
        int multBC = b * c;
        int multBD = b * d;
        int multCD = c * d;
        
        System.out.println("Resultados da adição:");
        System.out.println(somaAB);
        System.out.println(somaAC);
        System.out.println(somaAD);
        System.out.println(somaBC);
        System.out.println(somaBD);
        System.out.println(somaCD);
        
        System.out.println("Resultados da multiplicação:");
        System.out.println(multAB);
        System.out.println(multAC);
        System.out.println(multAD);
        System.out.println(multBC);
        System.out.println(multBD);
        System.out.println(multCD);
        
        scanner.close();
    }
}
