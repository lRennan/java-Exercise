/*12) Make an algorithm to read a number that is a user code. If this code is different from a code stored internally in the algorithm (equal to 1234), the message ‘Invalid user!’ must be displayed. If the Code is correct, another value must be read, which is the password. If this password is incorrect (the correct one is 9999) the message ‘incorrect password’ should be displayed. If the password is correct, the message ‘Access allowed’ should be displayed. in java 
################################

12) Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código esteja correto, deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a certa é 9999) deverá ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.
*/
import java.util.Scanner;

public class UserAuthentication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        final int USER_CODE = 1234;
        final int PASSWORD = 9999;

        System.out.println("Enter the user code: ");
        int userCode = scanner.nextInt();

        if(userCode != USER_CODE){
            System.out.println("Invalid user code! ");
        }else {
            System.out.println("Enter the password");;
            int password = scanner.nextInt();
        
            if (password != PASSWORD){
                System.out.println("Incorrect password");
            }else {
                System.out.println("Access allowed");
            }
        }
        scanner.close();   
    }
}