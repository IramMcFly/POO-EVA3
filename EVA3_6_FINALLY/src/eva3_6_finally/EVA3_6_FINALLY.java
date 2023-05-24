package eva3_6_finally;

import java.lang.ArithmeticException;

public class EVA3_6_FINALLY {

    public static void main(String[] args) {
        int x = 9, y = 1;

        try {
            int res = x / y;
            System.out.println("Resultado: " + res);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        } finally {//obliga a la ejecucion de esta seccion de codigo
            //opcional 
            System.out.println("Siempre me voy a ejecutar");
        }
        System.out.println("Fin del programa");
    }

}
