import java.util.Scanner;

public class SaudacaoPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o sexo da pessoa (M para masculino, F para feminino):");
        char sexo = scanner.next().charAt(0);
        
        String saudacao;
        if (sexo == 'M' || sexo == 'm') {
            saudacao = "Ilmo Sr. " + nome;
        } else if (sexo == 'F' || sexo == 'f') {
            saudacao = "Ilma Sra. " + nome;
        } else {
            saudacao = "Sexo inválido";
        }
        
        // Exibe a saudação
        System.out.println(saudacao);
        
        scanner.close();
    }
}
