package multiplos;

/**
 *
 * @author ANDRESCOGI
 */
public class Principal {

    /*Este programa imprime los numeros del 1 al 100, si el Numero es multiplo
    imprime "Fizz" en lugar del numero, si es multiplo de 5 "Buzz", 
    si es multiplo de 3 y 5 "FizzBuzz".*/
    public static void main(String[] args) {
        String mensaje = "";
        Numeros numero = new Numeros();
        for (int i = 1; i <= 100; i++) {
            mensaje = numero.validarNumeros(i);
            System.out.println(mensaje);
        }
    }

}
