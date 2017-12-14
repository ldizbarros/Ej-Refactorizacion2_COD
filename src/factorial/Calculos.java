package factorial;

/**
 * Clase que contiene funciones que realizan ciertos calculos
 * @author ldizbarros
 */
public class Calculos {
    /**
     * Funcion que calcula el factorial del numero que se pasa por parametro y 
     * devuelve el dicho factorial.
     * @param numero numero del que se calculara el factorial
     * @return factorial del numero introducido
     */
    public int calcularFactorial(int numero){
        int factorial,i;
        if (numero == 0) {
            factorial = 1;
        }else {
            factorial = 1;
            for (i = numero; i >= 1; i--) {
               factorial = factorial * i;
            }
        }
        return factorial;
    }
}
