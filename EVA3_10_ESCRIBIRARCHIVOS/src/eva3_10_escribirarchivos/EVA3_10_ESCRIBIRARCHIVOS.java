package eva3_10_escribirarchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_10_ESCRIBIRARCHIVOS {

    public static void main(String[] args) {
        String ruta = "C:\\archivos\\";

        try {
            writeUsingFiles("Prueba de escritura en txt desde java", ruta + "GameData.bin");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRIBIRARCHIVOS.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            writeUsingFileWriter(ruta + "DualCatch.efi", "Hey Lois, look, i'm a useless EFI file");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRIBIRARCHIVOS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            writeUsingBufferedWriter(ruta + "texto.dualboot", "hey lois, look, i'm a dualboot file");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRIBIRARCHIVOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void writeUsingFiles(String datos, String ruta) throws IOException {
        Path path = Paths.get(ruta);
        Files.write(path, datos.getBytes());
    }

    public static void writeUsingFileWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
    }
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        
        for(int i = 0; i<10; i++){
            bufWriter.write((i+1)+ " " + datos);
            bufWriter.write("\n");
        }
        bufWriter.close();
        fileWriter.close();
    }
}
