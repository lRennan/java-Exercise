/*10) Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha. 
 * 10) Write an algorithm that reads the ages of 2 men and 2 women (consider that the ages of men will always be different from each other, as well as those of women). Calculate and write the sum of the ages of the oldest man and the youngest woman, and the product of the ages of the youngest man and the oldest woman.
*/
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the age of the first man:");
        int ageFirstMan = scanner.nextInt();

        System.out.println("Enter the age of the first man:");
        int ageSecondMan = scanner.nextInt();

        System.out.println("Enter the age of the second woman: ");
        int ageFirstWoman = scanner.nextInt();

        System.out.println("Enter the age og the second woman");
        int ageSecondWoman = scanner.nextInt();

        int sumAges = Math.max(ageFirstMan, ageSecondMan) + Math.min(ageFirstWoman, ageSecondWoman);

        int productAges = Math.max(ageFirstMan, ageSecondMan) + Math.min
        (ageFirstWoman, ageSecondWoman);

        System.out.println("Sum of the ages of the oldest man and the youngest woman: " + sumAges);
        System.out.println("Product of the ages of the youngest man and the oldest woman " + productAges);

        scanner.close();

    }
    
}

