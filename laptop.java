import java.util.ArrayList;
import java.util.Comparator;
import java.util.List; 

    public class laptop {  
    public static void main(String[] args) {
  ///  Comparator<String> dbn =  new Comparator<T>() 
    {
    //    public String compare(String i, String j)
      
    };
      {
    List<String> Students = new ArrayList<>(); 
    {
   Students.add("kevin");
     Students.add("agpx");
       Students.add("unoinr");
           Students.add("xrp");
             Students.sort(Comparator.comparing(String::length));
    }
 Students.forEach(System.out::println);
}
    }
}