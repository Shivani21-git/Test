import java.util.ArrayList;
import java.util.HashMap;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class SolutionTest {
    public static void main(String[] args)
    {
pair();
    }
    public static void pair()
    {
      int  boys_count = 3;

      int[]  boys_skill_list = {3,6,7};

      int  girls_count = 4;

     int[]  girls_skill_list = {7,5,7,10};

        ArrayList result = new ArrayList();
        int count =0;

     int length;
     int length1 ;

      if(boys_count>girls_count)
      {
          length = boys_count;
          length1 = girls_count;
      }
      else
      {
           length = girls_count;
           length1 = boys_count;
      }
      for(int i=0;i<length;i++)
      {

          for(int j=0;j<length1;j++)
          {
              int diff = girls_skill_list[i]-boys_skill_list[j];
              if(diff==-1)
              {
                  count++;

              }
          }
      }
    //  System.out.println(result.size());
      System.out.println(count);
    }
}
