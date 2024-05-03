/*
 * 11) Uma fruteira está vendendo frutas com a seguinte tabela de preços:
morango =  até 5kg R$ 2.50 por kg acima de 5kg R$ 2,20 por Kg
maçã = R$ 1,80 por kg acima de 5 Kg 1,50 por Kg,Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente

11) A fruit store is selling fruit with the following price list:
strawberry = up to 5kg R$ 2.50 per kg over 5kg R$ 2.20 per kg
apple = R$ 1.80 per kg over 5 kg 1.50 per kg, If the customer purchases more than 8 kg of fruit or the total purchase value exceeds R$ 25.00, they will also receive a 10% discount on this total. Write an algorithm to read the quantity (in kg) of strawberries and the quantity (in kg) of apples purchased and write the amount to be paid by the customer..
 */

 import java.util.Scanner;

 public class FruitStore {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         // Prices per kg
         double priceStrawberryUpTo5kg = 2.50;
         double priceStrawberryOver5kg = 2.20;
         double priceAppleUpTo5kg = 1.80;
         double priceAppleOver5kg = 1.50;
         double discountRate = 0.10; // 10% discount
         
         // Prompt the user to enter the quantities of strawberries and apples purchased
         System.out.println("Enter the quantity of strawberries (in kg):");
         double kgStrawberry = scanner.nextDouble();
         
         System.out.println("Enter the quantity of apples (in kg):");
         double kgApple = scanner.nextDouble();
         
         // Calculate the total price for strawberries
         double totalPriceStrawberry;
         if (kgStrawberry <= 5) {
             totalPriceStrawberry = kgStrawberry * priceStrawberryUpTo5kg;
         } else {
             totalPriceStrawberry = kgStrawberry * priceStrawberryOver5kg;
         }
         
         // Calculate the total price for apples
         double totalPriceApple;
         if (kgApple <= 5) {
             totalPriceApple = kgApple * priceAppleUpTo5kg;
         } else {
             totalPriceApple = kgApple * priceAppleOver5kg;
         }
         
         // Calculate the total purchase value
         double totalPurchaseValue = totalPriceStrawberry + totalPriceApple;
         
         // Check if the discount is applicable
         if (kgStrawberry + kgApple > 8 || totalPurchaseValue > 25) {
             // Apply 10% discount
             double discountAmount = totalPurchaseValue * discountRate;
             totalPurchaseValue -= discountAmount;
         }
         
         // Print the total amount to be paid by the customer
         System.out.printf("The amount to be paid by the customer is: R$ %.2f%n", totalPurchaseValue);
         
         scanner.close();
     }
 }
 
