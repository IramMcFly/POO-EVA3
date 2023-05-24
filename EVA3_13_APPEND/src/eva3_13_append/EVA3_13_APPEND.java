package eva3_13_append;

import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_13_APPEND {

    public static void main(String[] args) {
        String ruta = "C:\\archivos\\";
        
        try {
            writeUsingBufferedWriter(ruta + "texto.bios", "hey lois, look, i'm a bios file");
        } catch (IOException ex) {
            System.out.println("Error al escribir el archivo");
        }
    }

    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < 10; i++) {
            bufWriter.write((i + 1) + " " + datos);
            bufWriter.write("\n");
        }
        bufWriter.close();
        fileWriter.close();
    }

}
