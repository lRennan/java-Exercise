public class SumOfEvenNumbers {
    public static void main(String[] args){
        int sum = 0;

        for(int i = 1; i <= 500; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }

        System.out.println("The sum of even numbers i the range from 1 to 500 is " + sum);
    }
}
