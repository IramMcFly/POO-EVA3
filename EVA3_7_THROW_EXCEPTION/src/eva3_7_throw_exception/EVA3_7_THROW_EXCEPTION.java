package eva3_7_throw_exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class EVA3_7_THROW_EXCEPTION {

    public static void main(String[] args) {

        prueba d = new prueba();

        //uncheked: errores de logica, no es forzoso resolverla
        //checked: es forzoso atenderlas 
        try {
            
            
            Scanner sc = new Scanner(System.in);
            int va = sc.nextInt();
            d.capturamayorcero(va);
        } catch (Exception ex) {
            //no es bueno usar exception pues es la 
            //superclase de todas las excepciones
            System.out.println(ex.getMessage());
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }

        prueba obj = new prueba();
        try {
            obj.div(1, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

}

class prueba {

    public void capturamayorcero(int valor) throws Exception {
        if (valor <= 0) {
            throw new Exception(valor + " Es negativo");
        }
        System.out.println("El Valor es: " + valor);
    }

    public int div(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException(y + " es 0, no se puede dividir entre 0");
        }
        return x / y;
    }
}
