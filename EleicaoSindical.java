/*10) In a union election, three candidates (A, B and C) competed for the position of president. During the counting of votes, invalid votes and blank votes were counted, in addition to valid votes for each candidate. A computer program must be created that reads the number of valid votes for each candidate, in addition to also reading the number of invalid votes and blank votes. At the end, the program must present the total number of voters, considering valid, null and blank votes; the corresponding percentage of valid votes in relation to the number of voters; the corresponding percentage of valid votes for candidate A in relation to the number of voters; the corresponding percentage of valid votes for candidate B in relation to the number of voters; the corresponding percentage of valid votes for candidate C in relation to the number of voters; the corresponding percentage of invalid votes in relation to the number of voters; and finally the corresponding percentage of blank votes in relation to the number of voters.
 
10) In a union election, three candidates (A, B and C) competed for the position of president. During the counting of votes, invalid votes and blank votes were counted, in addition to valid votes for each candidate. A computer program must be created that reads the number of valid votes for each candidate, in addition to also reading the number of invalid votes and blank votes. At the end, the program must present the total number of voters, considering valid, null and blank votes; the corresponding percentage of valid votes in relation to the number of voters; the corresponding percentage of valid votes for candidate A in relation to the number of voters; the corresponding percentage of valid votes for candidate B in relation to the number of voters; the corresponding percentage of valid votes for candidate C in relation to the number of voters; the corresponding percentage of invalid votes in relation to the number of voters; and finally the corresponding percentage of blank votes in relation to the number of voters.

 */




import java.util.Scanner;

public class EleicaoSindical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura da quantidade de votos válidos para cada candidato
        System.out.println("Digite a quantidade de votos válidos para o candidato A:");
        int votosA = scanner.nextInt();
        
        System.out.println("Digite a quantidade de votos válidos para o candidato B:");
        int votosB = scanner.nextInt();
        
        System.out.println("Digite a quantidade de votos válidos para o candidato C:");
        int votosC = scanner.nextInt();
        
        // Leitura da quantidade de votos nulos e em branco
        System.out.println("Digite a quantidade de votos nulos:");
        int votosNulos = scanner.nextInt();
        
        System.out.println("Digite a quantidade de votos em branco:");
        int votosBranco = scanner.nextInt();
        
        // Calculando o número total de eleitores
        int totalEleitores = votosA + votosB + votosC + votosNulos + votosBranco;
        
        // Calculando os percentuais
        double percentualVotosValidos = ((double) (votosA + votosB + votosC) / totalEleitores) * 100;
        double percentualVotosNulos = ((double) votosNulos / totalEleitores) * 100;
        double percentualVotosBranco = ((double) votosBranco / totalEleitores) * 100;
        double percentualVotosA = ((double) votosA / totalEleitores) * 100;
        double percentualVotosB = ((double) votosB / totalEleitores) * 100;
        double percentualVotosC = ((double) votosC / totalEleitores) * 100;
        
        // Exibindo os resultados
        System.out.println("Número total de eleitores: " + totalEleitores);
        System.out.println("Percentual de votos válidos: " + percentualVotosValidos + "%");
        System.out.println("Percentual de votos nulos: " + percentualVotosNulos + "%");
        System.out.println("Percentual de votos em branco: " + percentualVotosBranco + "%");
        System.out.println("Percentual de votos válidos para o candidato A: " + percentualVotosA + "%");
        System.out.println("Percentual de votos válidos para o candidato B: " + percentualVotosB + "%");
        System.out.println("Percentual de votos válidos para o candidato C: " + percentualVotosC + "%");
        
        scanner.close();
    }
}

