
package finalproject;

import java.io.Serializable;

public class Details implements Serializable{
    
    //first part data
    private int registryNO;
    
  
    // child data
    private String childName, childSex, childBirth, childPlacebirth;
    private String A_typeBirth, B_multipleBirth;
    private int C_birthOrder;
    private double weight;
    
    // mother data
    private String motherName;
    private String motherCiten, motherReli, motherOccu;
    private String motherResidence;
    private int A_totalchildBornAlive, B_nochildLiving, C_nochildbornDead;
    private int motherageBirth;
    
    // father data
    private String fatherName, fatherCiten, fatherReli, fatherOccu;
    private int fatherageBirth;
    
    
    //last part data
    private String datePlaceMarriage;
    private String attenDant;
   
    
    Details(int registryNO, String childName, String childSex, String childBirth){
        this.registryNO = registryNO;
        this.childName = childName;
        this.childSex = childSex;
        this.childBirth = childBirth;
    
    }
    
    public int getRegistryNO() {
        return registryNO;
    }

    public String getChildName() {
        return childName;
    }

    public String toString(){
        
        return registryNO +" ----> "+ childName ;
    }
    
    
}
