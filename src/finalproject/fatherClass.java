
package finalproject;

import java.util.*;

public class fatherClass {
     
    fatherClass(){
    
    
    }
    
    public void fatherCreate(){
        
        int choice;
        Scanner sc = new Scanner(System.in);
        
        Collection<exampleMethod> father = new ArrayList<exampleMethod>();
        
        do{
            
            System.out.println("");
            System.out.println("Press [1] to create new birth certificate");
            System.out.println("Press [2] to view the list of certificate");
            System.out.println("Press [3] to search the birth certificate");
            System.out.println("Press [4] to update the birth certificate");
            System.out.println("Press [5] to delete the birth certificate");
            choice = sc.nextInt();
            
             switch(choice){
                 case(1):
                     System.out.print("Enter registry no : ");
                     int a = sc.nextInt();
                     
                     System.out.println("===== FATHER DETAILS ===== ");
                     
                     sc.nextLine();
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
    
    
    public void fatherDisplay(){
        
        
    
    
    }
    
}
