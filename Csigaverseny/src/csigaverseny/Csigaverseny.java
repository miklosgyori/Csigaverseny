/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csigaverseny;

import java.util.Scanner;

/**
 * @author Gyori Miklos Dr UTH2H2
 */
public class Csigaverseny {
    
    public static final int CSIGAKSZAMA = 3;
    public Csiga csiga1 = new Csiga("piros");
    public Csiga csiga2 = new Csiga("zold");
    public Csiga csiga3 = new Csiga("kek");
    public static final int FORDULOKSZAMA = 5;
    public static int tipp;
    public static String tippString;
    

    public static void main(String[] args) {
        
        System.out.println("Udvozollek a Csigaversenyben!\n");
        System.out.println("Melyik csiga gyozelmere tippelsz ezek kozul:\n");
        System.out.println("(1) piros\n");
        System.out.println("(2) zold\n");
        System.out.println("(3) kek?\n");
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
            
            
            
            System.out.println("A(z) " + (i+1) + ". fordulo utan az alabbi az allas:\n");
            
            
        }        
    }
}
