package multiplos;

/**
 *
 * @author ANDRESCOGI
 */
public class Numeros {

    String mensaje = "";

    /*En este metodo se realiza la validacion de si un numero 
      es multiplo de 3 y/o de 5 e retorna el resultado*/
    public String validarNumeros(Integer numero) {

        if ((numero % 5 == 0) && (numero % 3 == 0)) {
            mensaje = "FizzBuzz";
        } else if (numero % 3 == 0) {
            mensaje = "Fizz";
        } else if (numero % 5 == 0) {
            mensaje = "Buzz";
        } else {
            mensaje = Integer.toString(numero);
        }
        return mensaje;
    }

}
