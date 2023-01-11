
package finalproject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.APPEND;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;


public class Data  {
    
    //HashMap<Integer, Set<String>> hashMap = new HashMap<Integer, Set<String>>();
   // HashMap<Integer, ArrayList<String>> map = new  HashMap<Integer, ArrayList<String>>();
   // ArrayList array = new ArrayList();
    //ArrayList list = new ArrayList();
    
    Collection<Details> collect = new ArrayList<Details>();
    
   // Path filePath = Paths.get("C:\\Users\\Lenovo\\Desktop\\records.txt");
    
    File file = new File("C:\\Users\\Lenovo\\Desktop\\psa_records.txt");
    ObjectOutputStream write = null;
    ObjectInputStream read = null;
    ListIterator li = null;
    
    int ranID;
    
    String c_firstname, c_middlename, c_lastname;
    int day, month, year;  
    
    String childName, childSex, childBirth, a_typeBirth, b_ifBirth, c_childOrder;
    double weight;
    
    
    
    
    
    public void collectData() throws FileNotFoundException, IOException{
        
      
      childName =  c_lastname + "," + c_firstname + " " + c_middlename;
      childBirth = day + "/" + month + "/" + year;
      
      
      // data collection
      collect.add(new Details(ranID, childName, childSex, childBirth));
      
      /*
      OutputStream output = new BufferedOutputStream(Files.newOutputStream(filePath,APPEND));
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
      
      writer.
      */
      
      write = new ObjectOutputStream(new FileOutputStream(file));
      write.writeObject(collect);
      write.close();
     
    }
    
    public void viewFile(){
        /*
        if(file.isFile()){
         read = new ObjectInputStream(new FileInputStream(file));
         collect = (ArrayList<Details>)read.readObject();
         read.close();
        
     }
       */
    
    
    }
     
}
