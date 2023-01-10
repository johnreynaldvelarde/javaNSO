
package finalproject;

import java.util.*;

public class Certificate_Class extends Data {
    
 
    Scanner sc = new Scanner(System.in);
  
   // HashMap<Integer, Set<String>> hashMap = new HashMap<Integer, Set<String>>();
   // HashMap<Integer, ArrayList<String>> map = new  HashMap<Integer, ArrayList<String>>();
   // ArrayList array = new ArrayList();
    //ArrayList list = new ArrayList();
    
    Random id = new Random();
    
    // generating random number;
    public void generateID(){
       
        ranID = id.nextInt(10000);
    }
    
    // creating birth certificate // module case 1
    public void createBirth(){
        
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
        
        
        collectData();
        
       
    }
    
    // view the list of  birth certificate // module case 2
    public void viewBirth(){
        
        System.out.println("");
        System.out.println("Registry No: " + ranID);
        System.out.println("");
        System.out.println("Child Name: " + a_firstname +" "+ b_middlename +" "+ c_lastname);
        System.out.println("Sex: " + childSex);
     
        /*
         System.out.println("");
         System.out.println("===== VIEW DETAILS =====");
         Iterator i = collect.iterator();
         while(i.hasNext()){
                        
         Details ss = i.next();
         System.out.println(ss);
    
         }
        */
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
    // collection of combine me
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
            System.out.println("----------------Name----------------");
            System.out.println("");
            System.out.print("Enter First Name: ");
            a_firstname = sc.nextLine();
            System.out.print("Enter Middle Name: ");
            b_middlename = sc.nextLine();
            System.out.print("Enter Last Name: ");
            c_lastname = sc.nextLine();
                                                                            //checks if the user tried to enter or space only
            if (  a_firstname.isEmpty() ||   a_firstname.equals(" ") || b_middlename .isEmpty() || b_middlename .equals(" ")
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
                System.out.println("----------------Sex----------------");
                System.out.println("Press [F] for Female, Press [M] for Male");
                System.out.print("Enter Sex: ");
                sex = sc.next().charAt(0);
                // askUserAgain();
                // System.out.print("Enter: ");
                // askUser = s.nextInt();

                if( sex == 'M' || sex == 'm'){
                    
                    childSex = "Male";
                    System.out.println("Registered Sucess");
                    askUser = 0;
                }
                else if(sex == 'f' || sex == 'F' ){
                    
                    childSex = "Female";
                    System.out.println("Registered Sucess");
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
    
}
