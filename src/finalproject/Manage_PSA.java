
package finalproject;

import java.util.*;

public class Manage_PSA {
    
    Scanner sc = new Scanner(System.in);
    
    Login_Class login = new Login_Class();
    Certificate_Class ce = new Certificate_Class();
    
  
    
    int choice;
    int seleNum;
    int ranID;
    
    
    public void createPSA(){
        
        int ch;
        
        try{
            do{
                
                System.out.println("");
                System.out.println("Press [1] to create new NSO birth certificate");
                System.out.println("Press [2] to view the list of NSO birth certificate");
                System.out.println("Press [3] to delete the birth certificate");
               
                System.out.println("[0] === Back to the past module ");
                System.out.println("");
                System.out.print("Enter the selected number: ");
                ch = sc.nextInt();
                
                switch(ch){
                    // create
                    case 1:
                        
                        ce.createBirth();
                       
                        break;
                        
                    // view    
                    case 2:
                        
                        ce.viewBirth();
                       
                        break;
                        
                    // search    
                    case 3: 
                        
                        break;
                        
                    // update    
                    case 4: 
                        
                        break;
                    
                    //delete    
                    case 5: 
                        
                        
                        break;
                    case (0):
                       // undo
                        break;
                        
                    default: 
                        System.out.println("Invalid Input --- Try Again!!! ");
                }
            }while(ch!=0);
         
        }catch(Exception e){
            
            System.out.println("Message: " + e);
        }
   
    }
    
    
    
    // for operator class
    public void operatorMethod(){
        
         int ch;
        
        try{
            do{
                
                System.out.println("");
                System.out.println("Press [1] to view the list of NSO birth certificate");
                System.out.println("Press [2] to search the birth certificate");
               
                System.out.println("[0] === Logout your account ");
                System.out.println("");
                System.out.print("Enter the selected number: ");
                ch = sc.nextInt();
                
                switch(ch){
                    // view
                    case 1:
                        
                        ce.viewBirth();
                       
                        break;
                        
                    // search    
                    case 2:
                        
                        
                       
                        break;
                        
                    // logout
                    case (0):
                        login.loginShow();
                        
                        break;
                        
                    default: 
                        System.out.println("Invalid Input --- Try Again!!! ");
                }
            }while(ch!=0);
         
        }catch(Exception e){
            
            System.out.println("Message: " + e);
        }
    
    
    }
    
}
