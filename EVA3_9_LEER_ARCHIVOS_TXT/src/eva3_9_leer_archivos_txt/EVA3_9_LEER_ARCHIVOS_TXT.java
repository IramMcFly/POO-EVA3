package eva3_9_leer_archivos_txt;

import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.Files.readAllLines;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_9_LEER_ARCHIVOS_TXT {
    
    final static String RUTA = "C:\\archivos\\prueba.txt";
    
    public static void main(String[] args) {
        
        
        try {
            //  C:\Archivos\prueba.txt
            readUsingFiles(RUTA);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    
    //Files lee todo el archivo y lo pone en memoria, es util con archivos pequenos
    public static void readUsingFiles(String ruta) throws IOException{
        //Construimos la ruta en base a la cadena de texto
        Path path = Paths.get(ruta);
        /*List<String> todasLineas = Files.readAllLines(path);
        System.out.println("Restultado:");
        for(int i = 0; i< todasLineas.size() ; i++){
            System.out.println(todasLineas.get(i));
        }*/
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));
        
    }
    
}
