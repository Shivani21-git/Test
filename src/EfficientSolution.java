import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class EfficientSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of test cases");
        int testcase = sc.nextInt();
        for (int i = 1; i <= testcase; i++) {
            System.out.println("Enter no of boys in " + i + " case");
            int boysno = sc.nextInt();
            int[] boyskill = new int[boysno];
            int[] fillboyskill = inputBoysSkill(boyskill);
            System.out.println("Enter no of girls in " +i+" case");
            int girlsno = sc.nextInt();
            int[] girlskill = new int[girlsno];
            int[] fillgirlskill = inputgirlSkill(girlskill);
            int count = solutionLogic(fillboyskill,fillgirlskill);
            System.out.println("No of pairs in "+i+ " test case is "+count);

        }

    }
    public static int[] inputBoysSkill(int[] boyskill)
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter skills of boys");
        for(int i=0;i<boyskill.length;i++)
        {
            boyskill[i] = sc1.nextInt();
        }
        return boyskill;
    }
    public static int[] inputgirlSkill(int[] girlskill)
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter skills of girls");
        for(int i=0;i<girlskill.length;i++)
        {
            girlskill[i] = sc1.nextInt();
        }
        return girlskill;
    }
    public static int solutionLogic(int[] boyskill,int[] girlskill)
    {
        int count =0;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        int value = 1;
        for(int i : boyskill)
        {
            if(!map.containsKey(i)) {
                map.put(i, value);
            }
            else
            {
                int val = map.get(i);
                map.put(i,value+val);
            }

        }
        for(int i : girlskill)
        {
            if(map.containsKey(i+1))
            {
                if(map.get(i+1)!=0)
                {
                    int val=map.get(i+1);
                    map.put(i+1,val-1);
                    System.out.println("Pair found");
                    count++;
                }
            }
            if(map.containsKey(i-1))
            {
                if(map.get(i-1)!=0)
                {
                    int val = map.get(i-1);
                    map.put(i-1,val-1);
                    System.out.println("Pair found");
                    count++;
                }
            }
        }
        return count;

}

}

