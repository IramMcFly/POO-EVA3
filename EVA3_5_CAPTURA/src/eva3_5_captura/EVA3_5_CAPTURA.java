package eva3_5_captura;

import java.util.Scanner;
import java.util.InputMismatchException;

public class EVA3_5_CAPTURA {

    public static void main(String[] args) {
        
        int x, y;
        
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese un valor X:");
                x = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("Error de entrada: " + e.getMessage());
            }
        }while(true);
        
        System.out.println("Valor de X: " + x);
    }

}
