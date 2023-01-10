
package finalproject;

import java.nio.file.*;
import java.io.*;
import java.util.*;
import static java.nio.file.StandardOpenOption.*;

public class Login_Class {
    
    private String username;
    private String password;
    private String user_role = "";
    
    
    Path filePath = Paths.get("C:\\Users\\Lenovo\\Desktop\\records.txt");
    Scanner sc = new Scanner(System.in);
    
   
    public void loginShow(){
        
      
        try{
            
            String User;
            String Pass;
            String Role;
            String passRole = ""; 
            
            String listname = null;
            boolean condi = false;
            
            //Stream Reader
            InputStream input = Files.newInputStream(filePath); 
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            
            System.out.println("");
            System.out.println("-----Login your account----");
            System.out.println("");
            
            System.out.print("Enter your username: ");
            username = sc.nextLine();
            System.out.print("Enter your password: ");
            password = sc.nextLine();
            
            while((listname=reader.readLine()) !=null){ // reading the existing data in text file
                
                String[] details = listname.split(",");
                Role = details[0];
                User = details[1];
                Pass = details[2];
                
                if(User.equals(username) && Pass.equals(password))
                {
                    condi = true;
                    if(Role.equals("Admin")){
                       passRole = "Admin";
                    }
                }  
           }
       
            if(condi==true)
            {
               if(passRole.equals("Admin")){ // going to administrator class
                   
                   Admin_Class admin = new Admin_Class();
                   admin.adminShow();
              
               }
               else{ // going to operator class
                   
                  Operator_Class operator = new Operator_Class();
                  operator.operatorShow();
                  
               }
           
            }
            
            else{
                System.out.println("");
                System.out.println("Incorrect username or password Try Again!!!");
                Login_Class login = new Login_Class();
                login.loginShow();
            }
    
        }
        catch(Exception e){
            
            System.out.println("Message: " + e);
        
        }
    
    }
    
}
