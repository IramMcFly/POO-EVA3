

package eva3_2_exceotion_propagation;


public class EVA3_2_EXCEOTION_PROPAGATION {

    public static void main(String[] args) {
        System.out.println("Inicia MAIN");
        a();
    }
    public static void a(){
        System.out.println("Inicia A");
        b();
        System.out.println("Termina A");
    }
    
    
    public static void b(){
        System.out.println("Inicia B");
        c();
        System.out.println("Termina B");
    }
    public static void c(){
        System.out.println("Inicia C");
        int x = 5, y  =0;
        int res = x/y;
        System.out.println("Resultado: " + res);
        System.out.println("Termina A");

    }
    
}
