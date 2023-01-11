
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
        getchildInfoName();
        // asking sex
        getSex();
        // asking child birth date
        getDate();
        // place birth
        getPlaceBirth();
        // a_asking type of birth
        getTypeBirth();
        // b_if birth
        getIfBirth();
        // c birth order
        getBirthOrder();
        // d child weight
        getWeight();
        
        // mother turn
        
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("=          MOTHER INFORMATION         =");
        System.out.println("=======================================");
        System.out.println("");
        
        getMother();
        
      
        collectData();
         
    }
    
    // view the list of  birth certificate // module case 2
    public void viewBirth(){
        
        System.out.println("");
        System.out.println("Registry No: " + ranID);
        System.out.println("");
        System.out.println("========== CHILD INFORMATION ==========");
        System.out.println("");
        System.out.println("1. Child Name ");
        System.out.println("(First) " + c_firstname );
        System.out.println("(Middle) " + c_middlename );
        System.out.println("(Last) " + c_lastname );
        System.out.println("");
        System.out.println("2. Sex: " + childSex);
        System.out.println("3. Date of Birth: " + childBirth);
        System.out.println("4. Place of birth: " + childPlace);
        System.out.println("5. A. Type of birth: " + a_typeBirth);
        System.out.println("B. If multiple birth, child was: " + b_ifBirth);
        System.out.println("C. Birth order: " + c_childOrder);
        System.out.println("D. Weight at birth: " + weight);
        System.out.println("");
        System.out.println("========== MOTHER INFORMATION ==========");
        System.out.println("");
        System.out.println("6. Maiden Name ");
        System.out.println("(First) " + m_firstname );
        System.out.println("(Middle) " + m_middlename );
        System.out.println("(Last) " + m_lastname );
        System.out.println("");
        System.out.println("7. Citenship: " + motherCite);
        System.out.println("8. Citenship: " + motherReli);
        
    }
    
    // generate all list of birth certificate // module case 3
    public void generateList(){
         
         System.out.println("");
         System.out.println("========== RECORD LIST BIRTH CERTIFICATE ==========");
         System.out.println("");
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
    // CHILD SECTION PART                                                                                             //
    //================================================================================================================//
   
    public void askUserAgain() {
        System.out.println("------------------------------");
        System.out.println("Press [1] to try again \nPress any key to continue");
        System.out.println("------------------------------");

    }
     
    public void getchildInfoName(){
        
        String answer01;
        do {
            System.out.println("");
            System.out.println("========== 1. CHILD NAME ==========");
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
                System.out.println("========== 2. SEX  ==========");
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
        System.out.println("========== 3. DATE OF BIRTH ==========");
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
       
        
         String answer01;
        do {
            System.out.println("");
            System.out.println("========== 4 PLACE BIRTH ==========");
            System.out.println("");
            sc.nextLine();
            System.out.print("Enter Name of Hospital/Clinic/Institution/House No. Street Barangay: ");
            nameHospital = sc.nextLine();
           
            System.out.print("Enter City/Municipality: ");
            nameCityMuni = sc.nextLine();
         
            System.out.print("Enter Province: ");
            nameProvince = sc.nextLine();
           
                                                                            //checks if the user tried to enter or space only
            if (  nameHospital.isEmpty() ||   nameHospital.equals(" ") || nameCityMuni .isEmpty() || nameCityMuni .equals(" ")
                || nameProvince.isEmpty() || nameProvince.equals(" ")) 
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
   
   public void getTypeBirth(){
       
        int askUser = 0; 
       
        String ch;
        
        do {
            try {
                System.out.println("");
                System.out.println("========== 5. A. TYPE OF BIRTH ==========");
                System.out.println("");
                System.out.println("[1] --> Single ");
                System.out.println("[2] --> Twin   ");
                System.out.println("[3] --> Triplet,etc ");
                System.out.println("");
                System.out.print("Enter selected number: ");
                ch = sc.nextLine();
                // askUserAgain();
                // System.out.print("Enter: ");
                // askUser = s.nextInt();

                if(ch.equalsIgnoreCase("1")){
                    
                    a_typeBirth = "Single";
                   
                    askUser = 0;
                }
                else if(ch.equalsIgnoreCase("2")){
                    
                    a_typeBirth = "Twin";
                   
                    askUser = 0;
                    
                }else if(ch.equalsIgnoreCase("3")){
                    
                    a_typeBirth = " Triplet";
                    askUser = 0;
                }
                else{
                    System.out.println("Plss input the only selected" );
                    askUser = 1;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input Try Again!!!");
                askUser = 1;
            }
        } while(askUser== 1);
   }
   
   public void getIfBirth(){
       
        int askUser = 0; 
       
        String ch;
        
        do {
            try {
                System.out.println("");
                System.out.println("========== B. IF MULTIPLE BIRTH, CHILD WAS ==========");
                System.out.println("");
                System.out.println("[1] --> First ");
                System.out.println("[2] --> Second  ");
                System.out.println("[3] --> Others, Specify ");
                System.out.println("[4] --> If not multiple birth ");
                
                System.out.println("");
                System.out.print("Enter selected number: ");
                ch = sc.nextLine();
                // askUserAgain();
                // System.out.print("Enter: ");
                // askUser = s.nextInt();

                if(ch.equalsIgnoreCase("1")){
                    
                    b_ifBirth = "First";
                   
                    askUser = 0;
                }
                else if(ch.equalsIgnoreCase("2")){
                    
                    b_ifBirth = "Second";
                   
                    askUser = 0;
                    
                }else if(ch.equalsIgnoreCase("3")){
                    
                    System.out.print("Specify: ");
                    b_ifBirth = sc.nextLine();
                    askUser = 0;
                }
                else if(ch.equalsIgnoreCase("4")){
                    
                    b_ifBirth = "Not multiple birth";
                    askUser = 0;
                }
                else{
                    System.out.println("Plss input the only selected" );
                    askUser = 1;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input Try Again!!!");
                askUser = 1;
            }
        } while(askUser== 1);
   
   }
   
   public void getBirthOrder(){
       
         int askUser = 0; 
       
        String ch;
        
        do {
            try {
                System.out.println("");
                System.out.println("========== C. BIRTH ORDER ==========");
                System.out.println("");
                System.out.println("(live birth fetal deaths including this delivery)");
                System.out.println("");
                System.out.println("[1] --> First ");
                System.out.println("[2] --> Second  ");
                System.out.println("[3] --> Third,etc ");
                System.out.println("[4] --> Others, Specify ");
               
                System.out.println("");
                System.out.print("Enter selected number: ");
                ch = sc.nextLine();
                // askUserAgain();
                // System.out.print("Enter: ");
                // askUser = s.nextInt();

                if(ch.equalsIgnoreCase("1")){
                    
                    c_childOrder = "First";
                   
                    askUser = 0;
                }
                else if(ch.equalsIgnoreCase("2")){
                    
                    c_childOrder = "Second";
                   
                    askUser = 0;
                    
                } else if(ch.equalsIgnoreCase("3")){
                    
                    c_childOrder = "Third";
                   
                    askUser = 0;
                    
                }
                else if(ch.equalsIgnoreCase("3")){
                    
                    System.out.print("Specify: ");
                    c_childOrder = sc.nextLine();
                    askUser = 0;
                }
                else{
                    System.out.println("Plss input the only selected" );
                    askUser = 1;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input Try Again!!!");
                askUser = 1;
            }
        } while(askUser== 1);
     
  
   }
   
    public void getWeight(){
       
        
        System.out.println("");
        System.out.println("========== D. WEIGHT AT BIRTH ==========");
        System.out.println("");                
        System.out.print("Grams: ");
        weight = sc.nextDouble();
        System.out.println("");

   }
    
    //================================================================================================================//
    // MOTHER SECTION PART                                                                                            //
    //================================================================================================================//
    
    public void getMother(){
        
        String answer01;
        do {
            System.out.println("");
            System.out.println("========== 6. MAIDEN NAME ==========");
            System.out.println("");
            sc.nextLine();
            System.out.print("Enter First Name: ");
            m_firstname = sc.nextLine();
            System.out.print("Enter Middle Name: ");
            m_middlename = sc.nextLine();
            System.out.print("Enter Last Name: ");
            m_lastname = sc.nextLine();
                                                                            //checks if the user tried to enter or space only
            if (  m_firstname.isEmpty() ||   m_firstname.equals(" ") || m_middlename .isEmpty() || m_middlename .equals(" ")
                || m_lastname.isEmpty() || m_lastname.equals(" ")) 
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
        
        // mother citizenship
        
        System.out.println("");
        System.out.println("========== 7. CITIZENSHIP ==========");
        System.out.println(""); 
        System.out.print("Enter Citizenship: ");
        motherCite = sc.nextLine();
        
        // mother religion
        
        System.out.println("");
        System.out.println("========== 8. RELIGION ==========");
        System.out.println(""); 
        System.out.print("Enter Religion: ");
        motherReli = sc.nextLine();
        
   
    }
    
  
}
