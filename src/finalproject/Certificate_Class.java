
package finalproject;

import java.util.*;

public class Certificate_Class {
    
    Scanner sc = new Scanner(System.in);
    
    Collection<Details> collect = new ArrayList<Details>();
    Random id = new Random();
    
    int ranID;
    
    

    
    // generating random number;
    public void generateID(){
       
        ranID = id.nextInt(10000);
    }
    
    // creating birth certificate
    public void createBirth(){
        
        generateID();
        System.out.println("");
        System.out.println("Registry no: " + ranID);
        System.out.print("Enter child name: ");
        String a = sc.nextLine();
                        
        collect.add(new Details(ranID, a));
    

    }
    
    // view the list of  birth certificate
    public void viewBirth(){
        
         System.out.println("");
         System.out.println("===== VIEW DETAILS =====");
         Iterator<Details>i = collect.iterator();
         while(i.hasNext()){
                        
         Details ss = i.next();
         System.out.println(ss);
    
         }
        
    }
    
     // search birth certificate
    public void seachBirth(){
        
         System.out.println("");
         System.out.println("===== VIEW DETAILS =====");
         Iterator<Details>i = collect.iterator();
         while(i.hasNext()){
                        
         Details ss = i.next();
         System.out.println(ss);
    
         }
        
    
    }
    
    
}
