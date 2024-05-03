/*  
A gas station discount table:
                         
alcohol = up to 20 liters, 3% discount per liter, above and 20 liters, 5% discount per liter
gasoline = up to 20 liters, 4% discount per liter, above 20 liters, 6% discount per liter...

9) Write an algorithm that reads the number of liters sold and the type of fuel (coded as follows: A-alcohol, G-gasoline), calculates and prints the amount to be paid by the customer knowing that the price per liter of gasoline is R$3.30 and the price of a liter of alcohol is R$2.90.
#######################################################################################
Um posto de gasolina  tabela de descontos:     
                         
alcool = ate 20 litros, desconto de 3% por litro , acima e 20 litros, desconto de 5% por litro 
gasolina =ate 20 litros, desconto de 4% por litro ,acima de 20litros , desconto de 6% por litro...

9) Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
*/

import java.util.Scanner;

public class FuelStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double gasolinePrice = 3.30;
        double ethanolPrice = 2.90;
        
        System.out.println("Enter the number of liters sold:");
        int liters = scanner.nextInt();
        
        System.out.println("Enter the type of fuel (A for ethanol, G for gasoline):");
        char type = scanner.next().charAt(0);
        
        double totalAmount = 0;
        if (type == 'A' || type == 'a') {
            if (liters <= 20) {
                totalAmount = liters * (ethanolPrice - (ethanolPrice * 0.03));
            } else {
                totalAmount = liters * (ethanolPrice - (ethanolPrice * 0.05));
            }
        } else if (type == 'G' || type == 'g') {
            if (liters <= 20) {
                totalAmount = liters * (gasolinePrice - (gasolinePrice * 0.04));
            } else {
                totalAmount = liters * (gasolinePrice - (gasolinePrice * 0.06));
            }
        } else {
            System.out.println("Invalid fuel type!");
            return;
        }
        
        System.out.println("Total amount to be paid: $" + totalAmount);
        
        scanner.close();
    }
}
