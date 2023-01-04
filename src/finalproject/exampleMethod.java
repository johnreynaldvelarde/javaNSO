
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
    
    exampleMethod(int registryNO, String fatherName, String fatherCiten, String fatherReli, String fatherOccu, int fatherBirth){
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
        
        return registryNO+""+fatherName+""+fatherCiten+""+fatherReli+""+fatherOccu+""+fatherOccu+""+fatherageBirth;
        
        }
    
    public void create(){
        int choice;
        Scanner sc = new Scanner(System.in);
        
        Collection<exampleMethod> father = new ArrayList<exampleMethod>();
        
        do{
            
            System.out.println("");
            System.out.println("Press [1] to create new birth certificate");
            System.out.println("Press [2] to view the list of certificate");
            System.out.println("Press [3] to update the birth certificate");
            System.out.println("Press [4] to delete the birth certificate");
            System.out.println("Press [5] to exit the program");
            choice = sc.nextInt();
            
             switch(choice){
                 case(1):
                     System.out.print("Enter registry no : ");
                     int a = sc.nextInt();
                     
                     System.out.print("===== FATHER DETAILS ===== ");
                     
                     System.out.print("Enter name: ");
                     String b = sc.nextLine();
                     
                     System.out.print("Enter citizenship: ");
                     String c = sc.nextLine();
                     
                     System.out.print("Enter religion: ");
                     String d = sc.nextLine();
                     
                     System.out.print("Enter occupation: ");
                     String e = sc.nextLine();
                     
                     System.out.print("Enter age at the this birth: ");
                     int f = sc.nextInt();
                     
                     father.add(new exampleMethod(a,b,c,d,e,f));
                     
                 
                    break;
                case(2):
                    
                    System.out.println("===== VIEW DETAILS =====");
                    Iterator<exampleMethod>i = father.iterator();
                    while(i.hasNext()){
                        
                        exampleMethod ss = i.next();
                        System.out.println(ss);
                    
                    
                    }
                    System.out.println("=========================");
                
                break;
                
                case(3):
                    
                    boolean found = false;
                    System.out.println("Enter regirsty no to search: ");
                    int registryNO = sc.nextInt();
                    System.out.println("===========================");
                    
                    i = father.iterator();
                    while(i.hasNext()){
                        exampleMethod ss = i.next();
                        if(ss.getRegistryNO() == registryNO){
                            System.out.println(ss);
                            found = true;
                        }
                        
                   
                    }
                    
                    if(!found){
                        
                        System.out.println("Record not found");
                    }
                    System.out.println("===========================");
                
                    break;
                case(4):
                    
                    
                    
                    
                    break;
             }
                
        
        
        }while(choice!=0);
                
    
    
    }
    
    public void display(){
    
    
    
    
    }
    
    
    
   
}
