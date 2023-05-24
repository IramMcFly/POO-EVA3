package eva3_3_try_catch;

public class EVA3_3_TRY_CATCH {

    public static void main(String[] args) {
        int x = 5, y=0;
        
        
        
        try{
            int res = x/y;
            System.out.println("Resultado: " + res);
        }catch(ArithmeticException e){
            System.out.println("Excepcion: " + e.getMessage());
        }    
        System.out.println("Fin Del Programa");
    }

}
