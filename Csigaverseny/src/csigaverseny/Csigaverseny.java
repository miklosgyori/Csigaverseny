/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csigaverseny;

import java.util.Scanner;

/**
 *
 * @author Gyori Miklos Dr UTH2H2
 */
public class Csigaverseny {
    
    public static final int CSIGAKSZAMA = 3;
    public static final int FORDULOKSZAMA = 5;
    public static int TIPP;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Udvozollek a Csigaversenyben!\n");
        System.out.println("Melyik csiga gyozelmere tippelsz?\nAdj meg egy egesz"
                + " szamot 1 es " + CSIGAKSZAMA + " kozott!\n");
        
        Scanner scanner = new Scanner(System.in);
        TIPP = scanner.nextInt();
                
        while ( TIPP < 1 || TIPP > CSIGAKSZAMA ){
        
            System.out.println("Nem jo szamot adtal meg!\nAdj meg egy egesz"
                + " szamot 1 es " + CSIGAKSZAMA + " kozott!\n");
            TIPP = scanner.nextInt();        
        }
        
        System.out.println("Ervenyes tipped: " + TIPP + ". csiga fog gyozni.\n");
        
    }
    
}
