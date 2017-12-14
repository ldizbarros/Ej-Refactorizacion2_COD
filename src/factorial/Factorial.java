package factorial;
/**
 * Clase que contiene la funcion main de este programa
 * @author ldizbarros
 */
public class Factorial {
    /**
     * Este programa multiplica todos los números enteros positivos que hay 
     * entre un número dado y el 1
     * @param args argumentos de la clase principal
     */
    public static void main(String[] args) {
        int numero= 8,factorial;

        Calculos calculoFactorial =  new Calculos();
        factorial = calculoFactorial.calcularFactorial(numero);
        
        System.out.println(factorial);
    }

}
