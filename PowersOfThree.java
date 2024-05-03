/*7) Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^). 
 * 
 * 7) Present the results of the powers of 3, ranging from the exponent 0 to the exponent 15. It must be considered that any number raised to zero is 1, and raised to 1 is itself. Note that the Portuguese exponentiation operator (^) cannot be used in this exercise.
*/




public class PowersOfThree {
    public static void main(String[] args) {
      
        for (int i = 0; i <= 15; i++) {
            long result = powerOfThree(i);

            System.out.println("3^" + i + " = " + result);
        }
    }

    public static long powerOfThree(int exponent) {
        long result = 1;
        
        for (int i = 0; i < exponent; i++) {
            result *= 3;
        }
        return result;
    }
}
