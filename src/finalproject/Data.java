
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
    String m_firstname, m_middlename, m_lastname;
    String f_firstname, f_middlename, f_lastname;
    String nameHospital, nameCityMuni, nameProvince;
    String houseNo, cityMuni, province;
   
    int day, month, year;  
    
    // child info
    String childName, childSex, childBirth, childPlace, a_typeBirth, b_ifBirth, c_childOrder;
    double weight;
    
    // mother info
    String motherName, motherCite, motherReli, motherOccu, motherResidence;
    int a_totalNum, b_stillLive, c_childDied, motherAge;
    
    // father info
    String fatherName, fatherCite, fatherReli, fatherOccu;
    int fatherAge;
   
    // another info;
    String datePlace, a_attendant;
    // b. certification
    String attendName, attendTitle, attendAdress, attendDate;
    String timeAttend;
    
    // 20. informant
    String infoName, infoRelo, infoAddress, infoDate;
    
    // 21.  prepared by
    String preName,preTitle, preDate;
    
    // 22.registar
    String regiName, regiTitle, regiDate;
    
    
    
    
    public void collectData() throws FileNotFoundException, IOException{
        
      
      childName =  c_lastname + "," + c_firstname + " " + c_middlename;
      motherName = m_lastname + "," + m_firstname + " " + m_middlename;
      fatherName = f_lastname + "," + f_firstname + " " + f_middlename;
      
      childPlace = nameHospital + " / " + nameCityMuni + " / "+ nameProvince;
      
      motherResidence = houseNo + " / " + cityMuni + " / " + province;
      
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
