import java.util.Scanner;
public class StudentPerformance {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the grade for the first check: ");
        double grade1 = scanner.nextDouble();

        System.out.println("Enter the grade for the second check: ");
        double grade2 = scanner.nextDouble();

        System.out.println("Enter the grade for the third check: ");
        double grade3 = scanner.nextDouble();

        System.out.println("Enter the average of exercises ");
        double exerciseAverage = scanner.nextDouble();

        double averageAchievement = (grade1 + grade2 * 2 + grade3 * 3 + exerciseAverage) / 7;

        char concept;
        if(averageAchievement >= 9.0){
            concept = 'A';
        }else if (averageAchievement >= 7.5){
            concept = 'B';
        }else if(averageAchievement >= 6.0){
            concept = 'C';
        }else {
            concept = 'D';
        }

        System.out.println("Average achievement: " + averageAchievement);
        System.out.println("Concept: " + concept);

        scanner.close();
    }
}
