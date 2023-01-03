
package finalproject;
import java.nio.file.*;
import java.io.*;
import java.util.*;
import static java.nio.file.StandardOpenOption.*;

public class accountClass {
    
    private String username;
    private String password;
    private String user_role = "";
    
    
    Path filePath = Paths.get("C:\\Users\\Lenovo\\Desktop\\records.txt");
    Scanner sc = new Scanner(System.in);
    
    

    accountClass(){
        
    
    
    }
    
    public void accoutLogin(){
        
                   
        
        
        
        try{
            String s = "";
            String User;
            String Pass;
            String Role;
            int tryAgain;
          
            String listname = null;
            boolean condi = false;
            
            //Stream Reader
            InputStream input = Files.newInputStream(filePath); 
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            
            
      
            
            
            System.out.println("-----Login your account----");
            System.out.println("");
            
            System.out.print("Enter your username: ");
            username = sc.nextLine();
            System.out.print("Enter your password: ");
            password = sc.nextLine();
            
            while((listname=reader.readLine()) !=null){
                
                String[] details = listname.split(",");
                Role = details[0];
                User = details[1];
                Pass = details[2];
               
              
                if(User.equals(username) && Pass.equals(password))
                {
                    condi = true;
                    
                    if(condi == true){
                         if(Role.equals("Administrator")){
                             
                         OutputStream output = new BufferedOutputStream(Files.newOutputStream(filePath,APPEND));
                         BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
                     
                         int select;
                         
                         do{
                             
                             System.out.println("[1] === Create new personel account ");
                             System.out.println("[2] === Managing NSO Certificate ");
                             System.out.println("[3] === View the list of NSO Certificate ");
                             System.out.println("[4] === Back to Login Module ");
                             System.out.println("[5] === Exit the program ");
                             select = sc.nextInt();
                             
                             switch(select){
                                 
                                 case(1):
                                     
                                     
                                     
                                     String personelRole[] = {"Administrator", "Operator"};
                                     
                                     System.out.println("----Register new personel account----");
                                     System.out.println("");
                                     System.out.println("=== Selete the role of new personel account ===");
                                     System.out.println("[0]--> Admistrator");
                                     System.out.println("[1]--> Operator");
                                     String number = sc.nextLine();
                                     
                                     for(int i = 0; i<personelRole.length; i++){
                                         
                                         if(personelRole[i] == number){
                                             
                                             System.out.println(i);
                                            
                                         
                                         }
                                
                                     }
                                     
                                     
                                     
                                     System.out.print("Username: ");
                                     username = sc.nextLine();
                                     System.out.print("Password: ");
                                     password = sc.nextLine();
                                     System.out.println("");
                                     System.out.println("Successfully Register!!!");
                                     s = user_role + username + password;
                                     writer.write(user_role + "," + username + "," + password);
                                     writer.newLine();
                                     
                                     
                                     break;
                                 case(2):
                                     
                                     childClass child = new childClass();
                                     child.childCreate();
                             
                             
                             
                                     break;
                                 case(3):
                                     
                                                                         
                                     break;
                                     
                                 case(4):
                                     
                                     accountClass account = new accountClass();
                                     account.accoutLogin();
                                     
                             }
                         
                         }while(select!=0);
                           
                         }else if(Role.equals("Operator")){
                            childClass child = new childClass();
                            child.childCreate();
                         }
                    
                    }
                    
                }
               
            }
                 
        }


        catch(Exception e){
            
            System.out.println("Message: " + e);
        
        }
    
    }
    
}
