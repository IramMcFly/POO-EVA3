package eva3_8_custom_exceptions;

public class EVA3_8_CUSTOM_EXCEPTIONS {

    public static void main(String[] args) {
        Persona p = new Persona();
        
        try{
            p.setEdad(-23);
            
        }catch(DatoEntradaUncheckedEx e){
            System.out.println(e.getMessage());
        }

    }

}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "--------";
        this.apellido = "------";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws DatoEntradaUncheckedEx {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoEntradaUncheckedEx {
        if(edad > 0){
            this.edad = edad;
        }else{
            //throw new DataInException();
            throw new DatoEntradaUncheckedEx();
        }
    }
    
    //uncheked  > Runtime
    
}

class DataInException extends RuntimeException{

    public DataInException() {
        super("Dato de entrada Incorrecto!!!. Valor de entrada es negativo");
    }
    
}

class DatoEntradaUncheckedEx extends Exception{

    public DatoEntradaUncheckedEx() {
        super("Dato de entrada Incorrecto!!!. Valor de entrada es negativo");
    }
    
    
}