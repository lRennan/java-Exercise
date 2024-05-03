/*4) Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.

4) Display all odd integer numerical values ​​located in the range from 0 to 20. To check whether the number is odd, carry out a logical check of this condition within the mesh with the if instruction, asking whether the number is odd; being, show it; If not, go to the next step.
 */
public class OddNumbersInRanger {
    public static void main(String[] args){
        for (int i = 0; i <= 20; i++){
            if (i % 2 != 0){

                System.out.println(i);;
            }
        }
    }
}
