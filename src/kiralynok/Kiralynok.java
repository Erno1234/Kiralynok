package kiralynok;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;
import model.Tabla;

public class Kiralynok {

    public static void main(String[] args) {
        Tabla tabla = new Tabla('X');
        System.out.println("6. Feladat");
        tabla.elhelyez(8);
        tabla.megjelenit();

        System.out.println("9. Feladat");
        System.out.println("Üres oszlopok száma:" + tabla.uresSorokSzama());
        System.out.println("Üres oszlopok száma:" + tabla.uresOszlopokSzama());
        
        
        Path path = Paths.get("tablak64.txt");
        try {
                Files.createFile(path);
                System.out.println("A fájl létrehozva: " + path);
            } catch (IOException e) {
                System.err.println("A fájl létrehozása sikertelen: " + e.getMessage());
            }
        
        for (int i = 1; i <= 64; i++) {
            Tabla t = new Tabla('*');
            t.elhelyez(i);
            t.fajlbaIr("tablak64.txt");
        }
            
        
    }

}
