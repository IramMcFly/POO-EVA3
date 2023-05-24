package eva3_12_serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_12_SERIALIZABLE {

    public static void main(String[] args) {
        Persona perso = new Persona("Panfilo", "El Tuso", 200);
        try {
            guardarObj(perso);
            Persona res = leerObjetos();
            System.out.println(res.getNombre());
            System.out.println(res.getApellido());
            System.out.println(res.getEdad());
        } catch (IOException ex) {
            Logger.getLogger(EVA3_12_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_12_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void guardarObj(Persona perso) throws IOException {
        FileOutputStream abrirArchivo = new FileOutputStream("C:\\Archivos\\personas.per");
        ObjectOutputStream ouStream = new ObjectOutputStream(abrirArchivo);
        ouStream.writeObject(perso);
        ouStream.close();
    }

    public static Persona leerObjetos() throws IOException, ClassNotFoundException {
        Persona perso = null;
        FileInputStream abrirArchivo = new FileInputStream("C:\\Archivos\\personas.per");
        ObjectInputStream oiStream = new ObjectInputStream(abrirArchivo);
        //Casting
        perso = (Persona) oiStream.readObject();
        return perso;
    }

}

class Persona implements Serializable {

    private String Nombre;
    private String Apellido;
    private int edad;

    public Persona(String Nombre, String Apellido, int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }

    public Persona() {
        this.Nombre = "----";
        this.Apellido = "------";
        this.edad = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
