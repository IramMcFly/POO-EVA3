package eva3_4_multiples_exceciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_4_MULTIPLES_EXCECIONES {

    public static void main(String[] args) {

        int x, y;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese X: ");
                x = sc.nextInt();

                System.out.print("Ingrese Y: ");
                y = sc.nextInt();

                int res = x / y;
                System.out.println("La division es: " + res);
                break;
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre 0: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("La captura es incorrecta: " + e.getMessage());
            }
        } while (true);

        System.out.println("Programa Terminado con Exito :)");

    }

}
