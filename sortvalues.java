/* 4) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente
###################################################################################################################
 4) Read 3 values (consider that the same values will not be entered) and write them in ascending order.
*/


import java.util.Scanner;

public class sortvalues {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first value : ");
        double value1 = scanner.nextDouble();

        System.out.print("Enter the second value : ");
        double value2 = scanner.nextDouble();

        System.out.print("Enter the second value :  ");
        double value3 = scanner.nextDouble();

        double temp;
        if(value1 > value2 ){
            temp = value1;
            value1 = value2;
            value2 = temp;
        }
        if (value2 > value3){
            temp = value2;
            value2 = value3;
            value3 = temp;
        }
        if(value1 > value2) {
            temp = value1;
            value1 = value2;
            value2 = temp;
        }

        System.out.println("Values in order: " + value1 + ", " + value2 + ", "+ value3);

        scanner.close();

    }    
}
