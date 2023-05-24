/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_unchecked_exceptions;

import java.util.Scanner;

public class EVA3_1_UNCHECKED_EXCEPTIONS {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //todas las unchecked derivan de la clase RuntimeException
        
        //Arithmetic EXCEPTION
        //div entre 0
        System.out.println("Iniciando el programa");
        int x = 5, y = 0;
        System.out.println("Inicializando variables");
        int res = x / y;
        System.out.println("calculando division...");
        System.out.println("Division: " + res);

        //java.util.InputMismatchException: error de captura de datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int s = sc.nextInt();
        System.out.println("Tu numero es: " + s);

        //java.lang.ArrayIndexOutOfBoundsException
        int[] arr = new int[5];//0
        arr[0] = 100;
        arr[1] = 100;
        arr[2] = 100;
        arr[3] = 100;
        arr[4] = 100;
        arr[5] = 100; //error de logica: el 5 no es una posicion valida 

        //NullPointerException
        prueba a = null;
        System.out.println("Valor de X = " + a.x);
    }

}

class prueba {

    public int x = 100;
}
