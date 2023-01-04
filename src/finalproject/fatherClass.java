
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
                 
                 //crate
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
                    
                    
                // display
                case(2):
                    
                    System.out.println("===== VIEW DETAILS =====");
                    Iterator<exampleMethod>i = father.iterator();
                    while(i.hasNext()){
                        
                        exampleMethod ss = i.next();
                        System.out.println(ss);
                    
                    
                    }
                    System.out.println("=========================");
                
                break;
                
                // search
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
                // delete    
                case(4):
                    found = false;
                    System.out.println("Enter regirsty no to delete the record: ");
                    registryNO = sc.nextInt();
                    System.out.println("===========================");
                    
                    i = father.iterator();
                    while(i.hasNext()){
                        exampleMethod ss = i.next();
                        if(ss.getRegistryNO() == registryNO){
                            i.remove();
                            found = true;
                        }
                    }
                    
                    if(!found){
                        
                        System.out.println("Record not found");
                    }else{
                        System.out.println("The record is deleted successfully");
                    }
                    System.out.println("===========================");
                
                
                    break;
                // update    
                case(5):
                    
                    /*
                    found = false;
                    System.out.println("Enter regirsty no to update the record: ");
                    registryNO = sc.nextInt();
                    System.out.println("===========================");
                    ListIterator<exampleMethod> li = father.listIterator();
                    while(li.hasNext()){
                        exampleMethod ss = li.next();
                        if(ss.getRegistryNO() == registryNO){
                            i.remove();
                            
                            
                            
                            found = true;
                        }
                    }
                    
                    if(!found){
                        
                        System.out.println("Record not found");
                    }else{
                        System.out.println("The record is update successfully");
                    }
                    System.out.println("=========");
                    
                    */
                   
                 /*
                    break; 
                   
                case 6:
               found = false;
               System.out.print("Enter Empname to Search :");
               ename = s1.nextLine();
               System.out.println("----------------------------");
               i = c.iterator();
               while(i.hasNext()){
                  Employee e = i.next();
                  if(e.getEname().equals(ename))  {
                     System.out.println(e);
                     found = true;
                  }
               }
               
               if(!found){
                  System.out.println("Record Not Found");
               }
               System.out.println("----------------------------");
            break;    
                   */ 
             }
                
        
        
        }while(choice!=0);
                
    
    
    
    }
    
    
    public void fatherDisplay(){
        
        
    
    
    }
    
}
