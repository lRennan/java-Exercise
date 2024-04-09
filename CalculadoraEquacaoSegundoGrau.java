import java.util.Scanner;

public class CalculadoraEquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os valores de A, B e C da equação de segundo grau:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        if (a == 0) {
            System.out.println("O coeficiente 'a' deve ser diferente de zero para uma equação de segundo grau.");
        } else {
            double discriminante = b * b - 4 * a * c;
            
            if (discriminante < 0) {
                System.out.println("Não existem raízes reais para esta equação.");
            } else {
                double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("As raízes da equação são: " + raiz1 + " e " + raiz2);
            }
        }
        
        scanner.close();
    }
}
