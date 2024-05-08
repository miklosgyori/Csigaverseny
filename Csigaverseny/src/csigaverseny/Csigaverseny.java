package csigaverseny;

import static csigaverseny.Utils.*;
import java.util.Scanner;

/**
 * @author Gyori Miklos Dr UTH2H2
 */
public class Csigaverseny {
    
    public static final int CSIGAKSZAMA = 3;
    public static Csiga csiga1 = new Csiga(1, "piros");
    public static Csiga csiga2 = new Csiga(2, "zold");
    public static Csiga csiga3 = new Csiga(3, "kek");
    
    public static final int FORDULOKSZAMA = 5;
    public static int tipp;
    public static String tippString;
    

    public static void main(String[] args) {
        
        System.out.println("Udvozollek a Csigaversenyben!\n");
        System.out.println("Melyik csiga gyozelmere tippelsz ezek kozul:\n");
        System.out.println("(1) piros\n");
        System.out.println("(2) zold\n");
        System.out.println("(3) kek\n");
        System.out.println("Add meg a megfelelo szamot!\n");
        
        Scanner scanner = new Scanner(System.in);
        tipp = scanner.nextInt();
                
        while ( tipp < 1 || tipp > CSIGAKSZAMA ){
        
            System.out.println("Nem jo szamot adtal meg!\nAdj meg egy egesz"
                + " szamot 1 es " + CSIGAKSZAMA + " kozott!\n");
            tipp = scanner.nextInt();        
        }
        
        switch(tipp){
            case 1:
                tippString = "piros";
                break;
            case 2:
                tippString = "zold";
                break;
            case 3:
                tippString = "kek";
                break;
        }
        
        System.out.println("Ervenyes tipped: a(z) " + tipp + "., " + tippString + " csiga fog gyozni.\n");
        
        for (int i = 0; i < FORDULOKSZAMA ; i++)
        {
            System.out.println("Kezdodik a(z) " + (i+1) + ". fordulo.\n");
            
            int gyorsCsiga = randomCsiga();
            
            if ( gyorsCsiga == 0){
                System.out.println("\tEbben a korben nem valasztottunk ki csigat gyorsitasra.");
            } else {
                System.out.println("\tEbben a korben a(z) " +  gyorsCsiga + ". csigat valasztottuk ki gyorsitasra.");
            }
            
            int randomTav1 = randomTav();
            
            if ( gyorsCsiga == 1) { csiga1.setosszTav(randomTav1*2);}
            else { csiga1.setosszTav(randomTav1);}
            
            int randomTav2 = randomTav();
            
            if ( gyorsCsiga == 2) { csiga2.setosszTav(randomTav2*2);}
            else { csiga2.setosszTav(randomTav2);}
            
            int randomTav3 = randomTav();
            
            if ( gyorsCsiga == 3) { csiga3.setosszTav(randomTav3*2);}
            else { csiga3.setosszTav(randomTav3);}
            
            System.out.println("\tA(z) " + (i+1) + ". fordulo utan az alabbi az allas:");            
            System.out.println("\t\t1. csiga megtett utja: " + csiga1.getosszTav());
            System.out.println("\t\t2. csiga megtett utja: " + csiga2.getosszTav());
            System.out.println("\t\t3. csiga megtett utja: " + csiga3.getosszTav() + "\n");
            
        }

        System.out.println("A vegeredmeny:\n");
        eredmenytKiir(csiga1, csiga2, csiga3, tipp);
        
        
    }
}
