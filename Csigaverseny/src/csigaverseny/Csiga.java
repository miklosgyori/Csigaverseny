/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csigaverseny;

/**
 *
 * @author Miklos
 */
public class Csiga {
    
    private String szin;
    private int osszTav;
    
    public Csiga(String szin){
        this.szin = szin;
        this.osszTav = 0;
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
