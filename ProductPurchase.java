/*13) Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:
- Se quantidade <= 5 o desconto será de 2%
- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
- Se quantidade > 10 o desconto será de 5%

13) Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:
- Se quantidade <= 5 o desconto será de 2%
- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
- Se quantidade > 10 o desconto será de 5%
 */

import java.util.Scanner;

public class ProductPurchase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product description (name): ");
        String productName = scanner.nextLine();

        System.out.println("Enter the quantity purchased: ");
        int quantityPurchased = scanner.nextInt();

        System.out.println("Enter the unit price");
        double unitPrice = scanner.nextDouble();

        double total = quantityPurchased * unitPrice;

        double discount;
        if(quantityPurchased <= 5){
            discount = total * 0.02;
        }else if (quantityPurchased <= 10){
            discount = total * 0.03;
        }else {
            discount = total * 0.05;
        }

        double totalPayable = total - discount;

        System.out.println("Product: " + productName);
        System.out.println("Total: $" + total);
        System.out.println("Discount: $" + discount);
        System.out.println("Total payable: $" + totalPayable);

        scanner.close();

    }
    
}
