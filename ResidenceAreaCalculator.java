/*
 * 11) Create a program that makes it possible to calculate the total area of ​​a residence (living room, kitchen, bathroom, bedrooms, laundry area, backyard, garage, etc.). The program should prompt you to enter the name, width, and length of a given room. It should then display the area of ​​the room read and also a message asking the user to confirm that they can continue calculating new rooms. If the user answers “NO”, the program must present the total accumulated value of the residential area.
 * 
 * 11) Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha, banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor total acumulado da área residencial.
 */
import java.util.Scanner;

public class ResidenceAreaCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double totalArea = 0;

        boolean continueCalculating = true;
        while (continueCalculating) {

            System.out.println("Enter the name of the room: ");
            String roomName = scanner.nextLine();

            System.out.println("Enter the width of the room(in meters): ");
            double width = scanner.nextDouble();

            System.out.println("Enter the length of the room(in meters): ");
            double length = scanner.nextDouble();
            scanner.nextLine();

            double area = width * length;
            totalArea +=area;

            System.out.println("Area of the " + roomName + ":" + area + "square meters");

            System.out.println("Do you want to continue calculating new rooms? (YES/NO)");
            String answer = scanner.nextLine() .toUpperCase();

            if(answer.equals("NO")){
                continueCalculating=false;
        }
    }
    System.out.println("Total accumulated area of the residence: " + totalArea + " square meters");

    scanner.close();

    }
}
