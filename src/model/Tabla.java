package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Tabla {

    private char[][] T;
    private char uresCella;
    private static Random rnd = new Random();

    public Tabla(char uresCella) {
        T = new char[8][8];
        this.uresCella = uresCella;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                T[i][j] = uresCella;
            }
        }
    }

    public void megjelenit() {
        for (char[] tomb : T) {
            for (char c : tomb) {
                System.out.print(c + "");
            }
            System.out.println("");
        }
    }

    public void elhelyez(int n) {
        int db = 0;
        while (db < n) {
            int sor = rnd.nextInt(8);
            int oszlop = rnd.nextInt(8);
            if (T[sor][oszlop] != 'K') {
                T[sor][oszlop] = 'K';
                db++;
            }
        }
    }

    public boolean uresOszlop(int oszlop) {
        int i = 0;
        while (i < 8 && !(T[oszlop][i] == 'K')) {
            i++;
        }
        return i >= 8;
    }

    public boolean uresSor(int sor) {
        int i = 0;
        while (i < 8 && !(T[sor][i] == 'K')) {
            i++;
        }
        return i >= 8;
    }

    public int uresSorokSzama() {
        int uresSorDb = 0;
        for (int i = 0; i < 8; i++) {
            if (uresSor(i)) {
                uresSorDb++;
            }
        }
        return uresSorDb;
    }

    public int uresOszlopokSzama() {
        int uresOszlopDb = 0;
        for (int i = 0; i < 8; i++) {
            if (uresOszlop(i)) {
                uresOszlopDb++;
            }
        }
        return uresOszlopDb;
    }
    
     public void fajlbaIr(String fajlNev) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fajlNev))) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    writer.write(T[i][j]);
                }
                writer.newLine();
            }
            System.out.println("Sikeres fájlbírás " + fajlNev);
        } catch (IOException e) {
            System.err.println("Sikeretelen fájlbírás " + e.getMessage());
        }
    }
}
