
package finalproject;


import java.io.IOException;
import java.util.*;

public class Certificate_Class extends Data {
    
   
   
 
    Scanner sc = new Scanner(System.in);
    Calendar calndr = Calendar.getInstance();
  
   
    
    Random id = new Random();
    
    // generating random number;
    public void generateID(){
       
        ranID = id.nextInt(10000);
    }
    
    // creating birth certificate // module case 1
    public void createBirth() throws IOException{
        
        generateID();
        
        System.out.println("");
        System.out.println("Registry no: " + ranID);
        
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("=          CHILD INFORMATION          =");
        System.out.println("=======================================");
        System.out.println("");
        
        // asking name
        getInfoName();
        // asking sex
        getSex();
        // asking child birth
        getDate();
        // asking type of birth
        getTypeBirth();
        
        
        collectData();
         
    }
    
    // view the list of  birth certificate // module case 2
    public void viewBirth(){
        
        System.out.println("");
        System.out.println("Registry No: " + ranID);
        System.out.println("");
        System.out.println("Child Name: " + c_firstname +" "+ c_middlename +" "+ c_lastname);
        System.out.println("Sex: " + childSex);
        System.out.println("Date of Birth: " + childBirth);
     
    
        
    }
    
    // generate all list of birth certificate // module case 3
    public void generateList(){
        
         System.out.println("=======================================");
         Iterator<Details> i = collect.iterator();
         while(i.hasNext()){
             Details e = i.next();
             System.out.println(e);
         
         }
    } 
    
    
    
    
     // search for specific birth certificate
    public void seachBirth(){
        
     
    
    }
    
    
    
    
    //================================================================================================================//
    // CHILD SECTION PART
    //================================================================================================================//
    
     public void askUserAgain() {
        System.out.println("------------------------------");
        System.out.println("Press [1] to try again \nPress any key to continue");
        System.out.println("------------------------------");

    }
     
    public void getInfoName(){
        
        String answer01;
        do {
            System.out.println("");
            System.out.println("========== Name ==========");
            System.out.println("");
            System.out.print("Enter First Name: ");
            c_firstname = sc.nextLine();
            System.out.print("Enter Middle Name: ");
            c_middlename = sc.nextLine();
            System.out.print("Enter Last Name: ");
            c_lastname = sc.nextLine();
                                                                            //checks if the user tried to enter or space only
            if (  c_firstname.isEmpty() ||   c_firstname.equals(" ") || c_middlename .isEmpty() || c_middlename .equals(" ")
                || c_lastname.isEmpty() || c_lastname.equals(" ")) 
            {
                System.out.println("");
                System.out.println("-------------------------------------");
                System.out.println("Please, don't input space or enter only in names... Thank you");
                answer01 = "1";
                
            } else {
                askUserAgain();
                System.out.print("Enter: ");
                answer01 = sc.nextLine();
            }
        } while (answer01.equals("1")); // propmts user again if the input is 1

     }
    
    
    public void getSex() { //----gets the gender of the child------
        
        int askUser = 0; // ---THis makes the user loop itself-----
        char sex;
        do {
            try {
                System.out.println("========== Sex ==========");
                System.out.println("");
                System.out.println("Press [F] for Female, Press [M] for Male");
                System.out.print("Enter Sex: ");
                sex = sc.next().charAt(0);
                // askUserAgain();
                // System.out.print("Enter: ");
                // askUser = s.nextInt();

                if( sex == 'M' || sex == 'm'){
                    
                    childSex = "Male";
                   
                    askUser = 0;
                }
                else if(sex == 'f' || sex == 'F' ){
                    
                    childSex = "Female";
                   
                    askUser = 0;
                    
                }
                else{
                    System.out.println("Plss input [M] or [F] only");
                    askUser = 1;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input String...");
                askUser = 1;
            }
        } while (askUser == 1);
    }
    
    
    public void getDate() { // move this to child class... date's use is for marriage
        
        System.out.println("");
        System.out.println("========== Date of Birth ==========");
        System.out.println("");
        System.out.println("Example: dd/mm/yyyy");
        
        try {
            
            System.out.print("Enter Day: ");
            int inputDay = sc.nextInt(); // this is where input Day stores
            sc.nextLine();
            
            if (inputDay < 31 && inputDay >= 1) {// ------------------input Day---------------------------------
                
                calndr.set(Calendar.DAY_OF_MONTH, day = inputDay); // sets the user input of day in month
                System.out.println("Day has been set");
                
            } else if (inputDay > 31) {
                System.out.println("Don't input more than 31 in day");
            }

            System.out.print("Enter Month: "); // ------------------input Month---------------------------------
            int inputMonth = sc.nextInt(); // Stores the input Month

            if (inputMonth <= 12 && inputMonth >= 1) {
                calndr.set(Calendar.MONTH, month = inputMonth); // sets the month
                System.out.println("Month has been set");
            } else if (inputMonth > 12) {
                System.out.println("There are only 12 months");
            } else {
                System.out.println("----Invalid Input-----");
            }
            
            System.out.print("Enter Year: "); // ------------------input Year---------------------------------
            int inputYear = sc.nextInt();
            String inputYear02 = inputYear + "";
            
            if (inputYear02.length() <= 4) { // check if the inputYear is lessthan 4 then proceed
                calndr.set(Calendar.YEAR, year = inputYear);
                System.out.println("Year has been set");
            } else if (inputYear02.length() > 4) {
                System.out.println("Year only consist 4 numbers..");
                
            } else {
                System.out.println("Invalid Input");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
        }
        
    }
    
   public void getPlaceBirth(){
   
   
   
   }
   
   public void getTypeBirth(){
       
        
    
   }
}
