import java.util.HashMap;
import java.util.Map;

// Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to ‘sum’.
public class PairOfSum {
    public static void main(String[] args)
    {
        int a[] = {1,5,7,-1};
        int sum = 6;
        findPair(a,sum);
    }
    public static void findPair(int a[], int sum)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]+a[i+1]==sum)
            {
                map.put(a[i],a[i+1]);
            }
        }
        System.out.println("No of pairs is "+map.size());
        for(Map.Entry entry : map.entrySet())
        {
            System.out.println("Pairs are : ("+entry.getKey()+","+entry.getValue()+")");
        }
    }
}
