/*
 * 6) Display all numbers divisible by 4 that are less than 200. To check whether the number is divisible by 4, carry out a logical check of this condition within the mesh with the
if statement, asking whether the number is divisible; being, show it; If not, go to
next step. The variable that will control the counter must start with the value 1.

6) Apresentar todos os números divisíveis por 4 que sejam menores que 200. Para verificar se o número é divisível por 4, efetuar dentro da malha a verificação lógica desta condição com a
instrução se, perguntando se o número é divisível; sendo, mostre-o; não sendo, passe para o
próximo passo. A variável que controlará o contador deve ser iniciada com o valor 1.
 */
public class DivisibleByFour {
    public static void main(String[] args){
        int counter = 1;

        while (counter < 200){
            if(counter % 4 == 0){
                System.out.println(counter);
            }
            counter++;
        }
    }
}
