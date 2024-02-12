
package kiralynok;


public class Kiralynok {
  

    public static void main(String[] args) {
        Tabla tabla = new Tabla('X');
        System.out.println("6. Feladat");
        tabla.elhelyez(8);
        tabla.megjelenit();
        
        System.out.println("9. Feladat");
        System.out.println("Üres oszlopok száma:" + tabla.uresSorokSzama());
        System.out.println("Üres oszlopok száma:" + tabla.uresOszlopokSzama());
    }
    
}
