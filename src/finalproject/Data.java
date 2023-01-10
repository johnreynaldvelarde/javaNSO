
package finalproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Data {
    
    Collection<Details> collect = new ArrayList<Details>();
    
    int ranID;
    
    String childName, childSex;
    
    String a_firstname, b_middlename, c_lastname;
  
    
    
    
    public void collectData(){
        
        
      childName =  c_lastname + "," + a_firstname + " " + b_middlename;
      collect.add(new Details(ranID, childName, childSex));
    
    
    
    }
    
   
   
}
