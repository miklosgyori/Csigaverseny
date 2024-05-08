package csigaverseny;

/**
 *
 * @author Miklos
 */
public class Csiga {
    
    private int id;
    private String szin;
    private int osszTav;
    
    public Csiga(int id, String szin){
        this.id = id;
        this.szin = szin;
        this.osszTav = 0;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getSzin(){
        return this.szin;
    }
            
    public void setosszTav( int megtettTav){
        this.osszTav += megtettTav;
    }    
    public int getosszTav(){
        return this.osszTav;
    }            
}
