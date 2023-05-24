package eva3_14_append_objects;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_14_APPEND_OBJECTS {

    public static void main(String[] args) {
        try {
            guardarObj(new Persona("Juan", "Casteabro", 90));
            guardarObj(new Persona("Pedro", "Orozco", 80));
            guardarObj(new Persona("Pancho", "Pistolas", 69));
            guardarObj(new Persona("Sergio", "Mejorado", 1000000));
            guardarObj(new Persona("Medorio Bartolome", "Costa Roja", 90));
            //ahora se leen
            leerObjetos();
        } catch (IOException ex) {
            Logger.getLogger(EVA3_14_APPEND_OBJECTS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_14_APPEND_OBJECTS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void guardarObj(Persona perso) throws IOException {
        FileOutputStream abrirArchivo = new FileOutputStream("C:\\Archivos\\variasPersonas.dat", true);
        ObjectOutputStream ouStream = new ObjectOutputStream(abrirArchivo);
        ouStream.writeObject(perso);
        ouStream.close();
    }

    public static void leerObjetos() throws IOException, ClassNotFoundException {
        Persona perso = null;
        FileInputStream abrirArchivo = new FileInputStream("C:\\Archivos\\variasPersonas.dat");
        ObjectInputStream oiStream = new ObjectInputStream(abrirArchivo);
        //Casting
        try {
            Object obj = oiStream.readObject();
            while (obj != null) {
                if (obj instanceof Persona) {
                    perso = (Persona)obj;
                    
                    System.out.println("Nombre: " + perso.getNombre());
                    System.out.println("Nombre: " + perso.getApellido());
                    System.out.println("Nombre: " + perso.getEdad());
                }
                obj = oiStream.readObject();
            }
        } catch (EOFException ex) {
        }
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
