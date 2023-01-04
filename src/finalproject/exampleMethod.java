
package finalproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class exampleMethod {
    
    private int registryNO;
    private String fatherName;
    private String fatherCiten;
    private String fatherReli;
    private String fatherOccu;
    private int fatherageBirth;
    private String motherName;
    private String motherCiten, motherReli, motherOccu;
    private String motherResidence; 
    
    exampleMethod(int registryNO, String fatherName, String fatherCiten, String fatherReli, String fatherOccu, int fatherageBirth){
        this.registryNO = registryNO;
        this.fatherName = fatherName;
        this.fatherCiten = fatherCiten;
        this.fatherReli = fatherReli;
        this.fatherOccu = fatherOccu;
        this.fatherageBirth = fatherageBirth;
  
    }
    /*
    exampleMethod(String motherName, String motherCiten, String motherReli,String motherOccu){
        this.motherName = motherName;
        this.motherCiten = motherCiten;
        this.motherReli = motherReli;
        this.motherOccu = motherOccu;
    }
    */
  

    public int getRegistryNO() {
        return registryNO;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getFatherCiten() {
        return fatherCiten;
    }

    public String getFatherReli() {
        return fatherReli;
    }

    public String getFatherOccu() {
        return fatherOccu;
    }

    public int getFatherageBirth() {
        return fatherageBirth;
    }
   
    public String toString(){
        
        return registryNO+"--->"+fatherName+" "+fatherCiten+" "+fatherReli+" "+fatherOccu+" "+fatherageBirth;
        
        }
   
  }
    

