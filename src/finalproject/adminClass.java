
package finalproject;
import java.util.*;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class adminClass {
    
    Scanner sc = new Scanner(System.in);
    Path filePath = Paths.get("C:\\Users\\Lenovo\\Desktop\\records.txt");
    
    loginClass login = new loginClass();
    methodAccess method = new methodAccess();
    certificateClass ce = new certificateClass();
    
    private String username;
    private String password;
    private String user_role = "";
    
    adminClass(){
        

    }
    
    // method admin
    public void adminDisplay(){
        
        int select;
        String s = "";
        try{
            
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(filePath,APPEND));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            
            do{
                System.out.println("");
                System.out.println("[1] === Create new personnel account ");
                System.out.println("[2] === Managing NSO birth certificate ");
                System.out.println("[3] === View the list of NSO birth certificate ");
                System.out.println("[4] === Logout your account ");
                System.out.println("[0] === Exit the program ");
                System.out.println("");
                System.out.print("Enter the selected number: ");
                select = sc.nextInt();             
                
                 switch(select){
                     
                     // create new personnel account
                     case(1):
                         
                         int number;
                         System.out.println("");
                         System.out.println("----Register new personel account----");
                         System.out.println("");
                         System.out.println("=== Selete the role of new personel account ===");
                         System.out.println("[0]--> Admistrator");
                         System.out.println("[1]--> Operator");
                         System.out.println("");
                         System.out.print("Enter the selected number: ");
                         number = sc.nextInt();                                                                                 
                        
                        // choose if admin or operator 
                        if(number == 0){
                             user_role = "Admin";
                        }
                        else if(number == 1){
                             user_role = "Operator";
                        }                                                           
                                   
                        System.out.print("Username: ");
                        username = sc.next();
                        
                        System.out.print("Password: ");
                        password = sc.next();
                                     
                        System.out.println("");
                        System.out.println("Successfully Register!!!");
                        s = user_role + username + password;
                        writer.write(user_role + "," + username + "," + password);
                        writer.newLine();
                        writer.flush();                                                                                     
                                                                                                                                
                     break;
                     
                     // manage new nso birth certificate
                     case(2):
                         
                         method.adminMethod();
                         
                     break;
                     
                     // view certificate
                     case(3):
                         
                         ce.viewBirth();
                                                                              
                     break;
                     
                     // logout
                     case(4):
                         
                         login.loginShow();
                         
                         break;
                                                                                       
                     case(0):
                        System.out.println("");
                        System.out.println(" ========================");
                        System.out.println("║     Program Exit      ║");
                        System.out.println(" ========================");
                        break;
              
                     default:
                         System.out.println("");
                         System.out.println("Invalid Input --- Try Again!!! ");
                 }
               
            }while(select!=0);
        
        }catch(Exception e){
            
            System.out.println("Message: " + e);
        }
    }
}
