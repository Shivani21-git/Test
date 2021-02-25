public class Test {

    int a;
    int b;
    Test(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    Test()
    {

    }
}

/*
import java.util.Scanner;

public class solution{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t = sc.nextInt();
        for(int i=1; i<=t ; i++)
        {
            System.out.println("Please enter no of boys for "+i+" test case");
            int boysno = sc.nextInt();
            int[] boyskills = new int[boysno];
            int [] fillboyskills = getBoysSkills(boyskills);

            System.out.println("Please enter no of girls for "+i+" test case");
            int girlsno = sc.nextInt();
            int[] girlskills = new int[girlsno];
            int[] fillgirlskills = getGirlsSkills(girlskills);

            pair(i,fillgirlskills,fillboyskills);
        }

    }
    public static int[] getBoysSkills(int[] boyskills)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter skills of boys");
        for(int j = 0 ; j<boyskills.length; j++)
        {
            boyskills[j]= sc.nextInt();
        }
        return boyskills;
    }
    public static int[] getGirlsSkills(int[] girlskills)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter skills of girls");
        for(int k=0;k<girlskills.length;k++)
        {

            girlskills[k] = sc.nextInt();
        }
        return girlskills;
    }

    public static void pair(int i,int[] fillgirlskills, int[] fillboyskills)
    {

              int count = 0;
            for(int m =0; m<fillgirlskills.length;m++)
            {
                for(int n=0;n<fillboyskills.length;n++)
                {
                    if(fillgirlskills[m]-fillboyskills[n] == 1 )
                    {
                        count++;
                        System.out.println("Pair found");
                    }

                }
            }
            System.out.println("No of Pair for "+i+" test case is "+count);

    }



}
 */