
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
        getmotherResidence();
        
        // father turn
        
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("=          FATHER INFORMATION         =");
        System.out.println("=======================================");
        System.out.println("");
        
        getFatherInfo();
        
        // last addtional information
        
          
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("=          ANOTHER INFORMATION        =");
        System.out.println("=======================================");
        System.out.println("");
        getaddtionalInfo();
        geta_Attendant();
        getbCertificationBirth();
        getInformant();
        getPreparedBy();
        getRegistar();
        successDisplay();
        
        
      
        // activation of colletion of data
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
        System.out.println("8. Religion: " + motherReli);
        System.out.println("");
        System.out.println("9. A. Total number of children born alive: " + a_totalNum);
        System.out.println("   B. Total number of children born alive: " + b_stillLive);
        System.out.println("   C. Total number of children born alive: " + c_childDied);
        System.out.println("");
        System.out.println("10. Occupation: " + motherOccu);
        System.out.println("11. Age at the time of this birth: " + motherAge);
        System.out.println("12. Residence: " + motherResidence);
        System.out.println("");
        System.out.println("========== FATHER INFORMATION ==========");
        System.out.println("");
        System.out.println("13. Father Name ");
        System.out.println("(First) " + f_firstname );
        System.out.println("(Middle) " + f_middlename );
        System.out.println("(Last) " + f_lastname );
        System.out.println("");
        System.out.println("14. Citenship: " + fatherCite);
        System.out.println("15. Religion: " + fatherReli);
        System.out.println("16. Occupation: " + fatherOccu);
        System.out.println("17. Age at the time of this birth: " + fatherAge);
        System.out.println("");
        System.out.println("========== ANOTHER INFORMATION ==========");
        System.out.println("");
        System.out.println("18. Date and place of marriage of the parents: " + datePlace );
        System.out.println("19. A. Attendant: " + a_attendant);
        System.out.println("");
        System.out.println("    B. Certification of birth");
        System.out.println("(I hereby that I attended the birth of the child who was born alive at () o clock am/pm on the date stated above)  " + timeAttend );
        System.out.println("(Name in print) " + attendName);
        System.out.println("(Title or Position) " + attendTitle);
        System.out.println("(Address) " + attendAdress);
        System.out.println("(Date) " + attendDate);
        System.out.println("");
        System.out.println("20. Informant: ");
        System.out.println("(Name in print) " + infoName);
        System.out.println("(Relationship of the child): " + infoRelo);
        System.out.println("(Address) " + infoAddress);
        System.out.println("(Date) " + infoDate);
        System.out.println("");
        System.out.println("21. Prepared by: ");
        System.out.println("(Name in print) " + preName);
        System.out.println("(Title or Position) " + preTitle);
        System.out.println("(Date) " + preDate);
        System.out.println("");
        System.out.println("22. Received at the office of civil registrar: ");
        System.out.println("(Name in print) " + regiName);
        System.out.println("(Title or Position) " + regiTitle);
        System.out.println("(Date) " + regiDate);
        System.out.println("");
        
        
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
            sc.nextLine();
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
            System.out.println("========== 6. MOTHER NAME ==========");
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
        
        // a. total child born alive
        
        System.out.println("");
        System.out.println("========== 9. A TOTAL NUMBER OF CHILDREN BORN ALIVE ==========");
        System.out.println("");
        System.out.print("Enter total: ");
        a_totalNum = sc.nextInt();
        
        //b. child still alive
        
        System.out.println("");
        System.out.println("========== B.  NO OF CHILDREN STILL LIVING INCLUDING THIS BIRTH ==========");
        System.out.println("");
        System.out.print("Enter total: ");
        b_stillLive = sc.nextInt();
        
        //c. born alive but dead now
        
        System.out.println("");
        System.out.println("========== C.  NO OF CHILDREN BORN ALIVE BUT ARE NOW DEAD ==========");
        System.out.println("");
        System.out.print("Enter total: ");
        c_childDied = sc.nextInt();
        
        // mother job
        
        System.out.println("");
        System.out.println("========== 10. OCCUPATION ==========");
        System.out.println("");
        System.out.print("Enter Occupation: ");
        motherOccu = sc.next();
        
        // mother age
        
        System.out.println("");
        System.out.println("========== 11. AGE AT THE TIME OF THIS BIRTH ==========");
        System.out.println("");
        System.out.print("Enter age: ");
        motherAge = sc.nextInt();
        
        // mother residence
        
   
    }
    
    public void getmotherResidence(){
        
          String answer01;
        do {
            System.out.println("");
            System.out.println("========== 12. RESIDENCE ==========");
            System.out.println("");
            sc.nextLine();
            System.out.print("Enter House No, Street Barangay: ");
            houseNo = sc.nextLine();
           
            System.out.print("Enter City/Municipality: ");
            cityMuni = sc.nextLine();
         
            System.out.print("Enter Province: ");
            province = sc.nextLine();
           
                                                                            //checks if the user tried to enter or space only
            if (  houseNo.isEmpty() ||   houseNo.equals(" ") || cityMuni .isEmpty() || cityMuni .equals(" ")
                || province.isEmpty() || province.equals(" ")) 
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
    
    
    public void getFatherInfo(){
        
          String answer01;
        do {
            System.out.println("");
            System.out.println("========== 13. FATHER NAME ==========");
            System.out.println("");
            System.out.print("Enter First Name: ");
            f_firstname = sc.nextLine();
            System.out.print("Enter Middle Name: ");
            f_middlename = sc.nextLine();
            System.out.print("Enter Last Name: ");
            f_lastname = sc.nextLine();
                                                                            //checks if the user tried to enter or space only
            if (  f_firstname.isEmpty() ||   f_firstname.equals(" ") || f_middlename .isEmpty() || f_middlename .equals(" ")
                || f_lastname.isEmpty() || f_lastname.equals(" ")) 
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
        
            // father citizenship
            System.out.println("");
            System.out.println("========== 14. CITIZENSHIP ==========");
            System.out.println(""); 
            System.out.print("Enter Citizenship: ");
            fatherCite = sc.nextLine();
        
            // father religion
        
            System.out.println("");
            System.out.println("========== 15. RELIGION ==========");
            System.out.println(""); 
            System.out.print("Enter Religion: ");
            fatherReli = sc.nextLine();  
            
            
            // father job
            
            System.out.println("");
            System.out.println("========== 16. OCCUPATION ==========");
            System.out.println("");
            System.out.print("Enter Occupation: ");
            fatherOccu = sc.next();
    
            // father age
            
            System.out.println("");
            System.out.println("========== 17. AGE AT THE TIME OF THIS BIRTH ==========");
            System.out.println("");
            System.out.print("Enter age: ");
            fatherAge = sc.nextInt();
    
    }
    
    public void getaddtionalInfo(){
        
          String answer01;
        do {
            System.out.println("");
            System.out.println("========== 18. DATE AND PLACE OF MARRIAGE OF THE PARENTS ==========");
            System.out.println("");
            System.out.print("Enter info: ");
            datePlace = sc.nextLine();
                                                                            //checks if the user tried to enter or space only
            if ( datePlace.isEmpty() ||  datePlace.equals(" "))
                
            {
                System.out.println("");
                System.out.println("-------------------------------------");
                System.out.println("Fill the blank / Try Again ... Thank you");
                answer01 = "1";
                
            } else {
                askUserAgain();
                System.out.print("Enter: ");
                answer01 = sc.nextLine();
            }
        } while (answer01.equals("1")); // propmts user again if the input is 1
    
    }
    
    public void geta_Attendant(){
        
         int askUser = 0; 
       
        String ch;
        
        do {
            try {
                System.out.println("");
                System.out.println("========== 19. ATTENDANT ==========");
                System.out.println("");
                System.out.println("[1] --> Physician ");
                System.out.println("[2] --> Nurse  ");
                System.out.println("[3] --> Midwife  ");
                System.out.println("[4] --> Hilot(Traditonal Midwife)  ");
                System.out.println("[5] --> Others, Specify ");
              
                
                System.out.println("");
                System.out.print("Enter selected number: ");
                ch = sc.nextLine();
                // askUserAgain();
                // System.out.print("Enter: ");
                // askUser = s.nextInt();

                if(ch.equalsIgnoreCase("1")){
                    
                     a_attendant = "Physician";
                   
                    askUser = 0;
                }
                else if(ch.equalsIgnoreCase("2")){
                    
                    a_attendant = "Nurse";
                   
                    askUser = 0;
                    
                }else if(ch.equalsIgnoreCase("3")){
                    
                    a_attendant = "Midwife";
                   
                    askUser = 0;
                }
                else if(ch.equalsIgnoreCase("4")){
                    
                     a_attendant = "Hilot(Traditonal Midwife)";
                     askUser = 0;
                }
                 else if(ch.equalsIgnoreCase("5")){
                    
                     System.out.print("Specify: ");
                     a_attendant = sc.nextLine();
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
   
    public void  getbCertificationBirth(){
        
          String answer01;
        do {
            System.out.println("");
            System.out.println("========== B. CERTIFICATION OF BIRTH ==========");
            System.out.println("");
            System.out.print("I hereby that i attended the birth of the child who  was born alive at () o clock am/pm on the date stated about: ");
            timeAttend = sc.nextLine();
            System.out.print("Enter Name in print (ALL CAPITAL): ");
            attendName = sc.nextLine();
            System.out.print("Enter Title or Positon: ");
            attendTitle = sc.nextLine();
            System.out.print("Enter Address: ");
            attendAdress = sc.nextLine();
            System.out.print("Enter Date: ");
            attendDate = sc.nextLine();
            
          
            
                    //checks if the user tried to enter or space only
            if ( timeAttend.isEmpty() ||  timeAttend.equals(" ") || attendName.isEmpty() ||  attendName.equals(" ") 
                || attendTitle.isEmpty() ||  attendTitle.equals(" ") || attendAdress.isEmpty() ||  attendAdress.equals(" ") 
                    || attendDate.isEmpty() ||  attendDate.equals(" ") )
            {
                System.out.println("");
                System.out.println("-------------------------------------");
                System.out.println("Fill the blank / Try Again ... Thank you");
                answer01 = "1";
                
            } else {
                askUserAgain();
                System.out.print("Enter: ");
                answer01 = sc.nextLine();
            }
        } while (answer01.equals("1")); // propmts user again if the input is 1
    
    }
    
     public void  getInformant(){
        
          String answer01;
        do {
            System.out.println("");
            System.out.println("========== 20. INFORMANT ==========");
            System.out.println("");
            System.out.print("Enter Name in print (ALL CAPITAL): ");
            infoName = sc.nextLine();
            System.out.print("Enter Relationship of the child: ");
            infoRelo = sc.nextLine();
            System.out.print("Enter Address: ");
            infoAddress = sc.nextLine();
            System.out.print("Enter Date: ");
            infoDate = sc.nextLine();
            
          
            
                    //checks if the user tried to enter or space only
            if ( infoName.isEmpty() ||  infoName.equals(" ") || infoRelo.isEmpty() ||  infoRelo.equals(" ") 
                || infoAddress.isEmpty() ||  infoAddress.equals(" ") || infoDate.isEmpty() ||  infoDate.equals(" "))    
            {
                System.out.println("");
                System.out.println("-------------------------------------");
                System.out.println("Fill the blank / Try Again ... Thank you");
                answer01 = "1";
                
            }else {
                askUserAgain();
                System.out.print("Enter: ");
                answer01 = sc.nextLine();
            }
        } while (answer01.equals("1")); // propmts user again if the input is 1
    
    }
    
      public void  getPreparedBy(){
        
          String answer01;
        do {
            System.out.println("");
            System.out.println("========== 21. PREPARED BY ==========");
            System.out.println("");
            System.out.print("Enter Name in print (ALL CAPITAL): ");
            preName = sc.nextLine();
            System.out.print("Enter Title or Position: ");
            preTitle = sc.nextLine();
            System.out.print("Enter Date: ");
            preDate = sc.nextLine();
            
          
            
                    //checks if the user tried to enter or space only
            if ( preName.isEmpty() ||  preName.equals(" ") || preTitle.isEmpty() ||  preTitle.equals(" ") 
                || preDate.isEmpty() ||  preDate.equals(" "))    
            {
                System.out.println("");
                System.out.println("-------------------------------------");
                System.out.println("Fill the blank / Try Again ... Thank you");
                answer01 = "1";
                
            }else {
                askUserAgain();
                System.out.print("Enter: ");
                answer01 = sc.nextLine();
            }
        } while (answer01.equals("1")); // propmts user again if the input is 1
    
    }
      
     public void  getRegistar(){
        
          String answer01;
        do {
            System.out.println("");
            System.out.println("========== 22.  Received at the office of civil registrar ==========");
            System.out.println("");
            System.out.print("Enter Name in print (ALL CAPITAL): ");
            regiName = sc.nextLine();
            System.out.print("Enter Title or Position: ");
            regiTitle = sc.nextLine();
            System.out.print("Enter Date: ");
            regiDate = sc.nextLine();
            
          
            
                    //checks if the user tried to enter or space only
            if ( regiName.isEmpty() ||  regiName.equals(" ") || regiTitle.isEmpty() ||  regiTitle.equals(" ") 
                || regiDate.isEmpty() ||  regiDate.equals(" "))    
            {
                System.out.println("");
                System.out.println("-------------------------------------");
                System.out.println("Fill the blank / Try Again ... Thank you");
                answer01 = "1";
                
            }else {
                askUserAgain();
                System.out.print("Enter: ");
                answer01 = sc.nextLine();
            }
        } while (answer01.equals("1")); // propmts user again if the input is 1
    
    }
    
     public void successDisplay(){
         
         System.out.println("");
         System.out.println("========== Registered Successfully ==========");
         System.out.println("");

     }
     
}
