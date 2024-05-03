/*3) Present the total sum obtained from the first hundred integers (1+2+3+4+...+98+99+100). 
 3) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).
*/






public class SumOfIntegers {
    public static void main(String[] args){

        int totalSum = 0;

        for(int i = 1; i <= 100; i++){
            totalSum += i;
        }


        System.out.println("The total sum of the first hundred integers is: " + totalSum);
    }
    
}
