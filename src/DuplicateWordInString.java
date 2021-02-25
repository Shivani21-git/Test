import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateWordInString {
    public static void main(String[] args)
    {
       String str = "Hello Hi Hello Suman Shivani Suman Hi";
      String[] array =   str.split("\\s");
      int value =1;
        HashMap<String,Integer> map = new HashMap<>();
       for(String s : array)
       {
          // System.out.println(s);
           if(map.containsKey(s))
           {
               map.put(s,map.get(s)+1);
           }
           else {
               map.put(s, value);
           }
       }
     for(Map.Entry<String,Integer> entry : map.entrySet())
     {
         if(entry.getValue()>1)
         {
             System.out.println(entry.getKey());
         }
     }

    }
}
