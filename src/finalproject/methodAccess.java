
package finalproject;
import java.util.*;

public class methodAccess {
    
    Scanner sc = new Scanner(System.in);
    Random id = new Random();
   
    int choice;
    int seleNum;
    int randomNumber;
    int num;
    
    methodAccess(){
    
    
    
    }
    // generating random number;
    public void generateID(){
         for(int count = 1; count<=4; count++){
            randomNumber = id.nextInt(9);
            //System.out.print(randomNumber); 
        }
             
    }
    
    public void rootMethod(){
        
        int ch;
        
        try{
            do{
                
                System.out.println("");
                System.out.println("Press [1] to create new NSO birth certificate");
                System.out.println("Press [2] to view the list of NSO birth certificate");
                System.out.println("Press [3] to search the birth certificate");
                System.out.println("Press [4] to update the birth certificate");
                System.out.println("Press [5] to delete the birth certificate");
               
                System.out.println("[0] === Back to the past module ");
                System.out.println("");
                System.out.print("Enter the selected number: ");
                ch = sc.nextInt();
                
                switch(ch){
                    // create
                    case 1:
                        generateID();
                       
                        System.out.println(randomNumber);
                        
                        break;
                        
                    // view    
                    case 2: 
                        
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
    
   
}
