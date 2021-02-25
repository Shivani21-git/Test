import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstDupeChar {
    public static void main(String[] args)
    {
        String str = "shivani";
       // String[] array =   str.split("\\s");
       char[] array = str.toCharArray();
        int value =1;
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char s : array)
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



    }
}
