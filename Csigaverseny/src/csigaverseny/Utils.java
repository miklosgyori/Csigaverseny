package csigaverseny;

import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class Utils {

        public static int randomCsiga()
        {
            Random rand = new Random();
            int random20szazalek = (rand.nextInt(5) + 1);
            //System.out.println("\t\trandom20szazalek = " + random20szazalek + "\n");
            if ( random20szazalek == 1 ){
                return (rand.nextInt(3) + 1);                              
            }else {
                return 0;
            }                
        }
        
        public static int randomTav()
        {
            Random rand = new Random();
            int randomTav = rand.nextInt(4);
            System.out.println("\t\trandomTav = " + randomTav);
            return randomTav;
        }
        
        public static String szin(int sorszam){
            
            switch(sorszam){
            case 1:
                return "piros";                
            case 2:
                return "zold";                
            case 3:
                return "kek";                
            default:
                return "HIBA";                
            }                
        }
        
        public static void eredmenytKiir(Csiga csiga1, Csiga csiga2, Csiga csiga3, int tipp){
        
            Csiga[] csigak = {csiga1, csiga2,csiga3};
            Arrays.sort(csigak, Comparator.comparing(Csiga::getosszTav).reversed());
            for ( Csiga csiga : csigak){
                System.out.println(csiga.getId() + ". szamu, " + csiga.getSzin() + " csiga: " + csiga.getosszTav());
            }
            
            if ( tipp == csigak[0].getId() ||  (tipp == csigak[0].getId() && tipp == csigak[1].getId())){
                System.out.println("\nA tipp helyes volt!");
            }else{
                System.out.println("\nA tipp helytelen volt!");
            }            
        }
}
