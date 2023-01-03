
package finalproject;

import java.util.Scanner;


public class motherClass {
    
    private String motherName;
    private String motherCiten, motherReli, motherOccu;
    private String motherResidence;
    private int totalchildBornAlive, nochildLiving, nochildbornDead;
    private int motherageBirth;
   
    Scanner sc = new Scanner(System.in);
    
    motherClass(){
    
    
    }
    
    public void motherCreate(){
        
        System.out.println("------MAIDEN NAME------");
        System.out.print("First Name/Middle Name/Last Name: ");
        setMotherName(sc.nextLine());
        
        
        
        String childsex;
        
        String sex[] = {"Male, Female"};
        
        System.out.println("Select the gender ");
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    }
    
    public void motherDisplay(){
    
    
    
    
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherCiten() {
        return motherCiten;
    }

    public void setMotherCiten(String motherCiten) {
        this.motherCiten = motherCiten;
    }

    public String getMotherReli() {
        return motherReli;
    }

    public void setMotherReli(String motherReli) {
        this.motherReli = motherReli;
    }

    public String getMotherOccu() {
        return motherOccu;
    }

    public void setMotherOccu(String motherOccu) {
        this.motherOccu = motherOccu;
    }

    public String getMotherResidence() {
        return motherResidence;
    }

    public void setMotherResidence(String motherResidence) {
        this.motherResidence = motherResidence;
    }

    public int getTotalchildBornAlive() {
        return totalchildBornAlive;
    }

    public void setTotalchildBornAlive(int totalchildBornAlive) {
        this.totalchildBornAlive = totalchildBornAlive;
    }

    public int getNochildLiving() {
        return nochildLiving;
    }

    public void setNochildLiving(int nochildLiving) {
        this.nochildLiving = nochildLiving;
    }

    public int getNochildbornDead() {
        return nochildbornDead;
    }

    public void setNochildbornDead(int nochildbornDead) {
        this.nochildbornDead = nochildbornDead;
    }

    public int getMotherageBirth() {
        return motherageBirth;
    }

    public void setMotherageBirth(int motherageBirth) {
        this.motherageBirth = motherageBirth;
    }
    
}
