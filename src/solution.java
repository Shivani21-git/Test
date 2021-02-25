import java.util.Scanner;

public class solution{
    public static void main(String[] args)
    {
        int testcase = 2;
        int boyst1 = 3;
        int[] boysillst1 = {3,6,7};
        int girlt1 = 4;
        int[] girlskillt1 = {7,5,7,10};
        int boyt2 = 3;
        int[] boyskillst2 = {2,9,1};
        int girlt2 = 5;
        int[] girlskillst2 = {2,7,2,7,11};

     //   Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter the number of test cases");
    //    int t = sc.nextInt();
     /*   for(int i=1; i<=t ; i++)
        {
            System.out.println("Please enter no of boys for "+i+" test case");
            int boysno = sc.nextInt();
            int[] boyskills = new int[boysno];
        //    int [] fillboyskills = getBoysSkills(boyskills);

            System.out.println("Please enter no of girls for "+i+" test case");
            int girlsno = sc.nextInt();
            int[] girlskills = new int[girlsno];
            int[] fillgirlskills = getGirlsSkills(girlskills); */

            pair(girlskillt1,boysillst1);
            pair(girlskillst2,boyskillst2);
        }

  /*  public static int[] getBoysSkills(int[] boyskills)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter skills of boys");
        for(int j = 0 ; j<boyskills.length; j++)
        {
            boyskills[j]= sc.nextInt();
        }
        return boyskills;
    } */
  /*  public static int[] getGirlsSkills(int[] girlskills)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter skills of girls");
        for(int k=0;k<girlskills.length;k++)
        {

            girlskills[k] = sc.nextInt();
        }
        return girlskills;
    } */

    public static void pair(int[] fillgirlskills, int[] fillboyskills)
    {

            int count = 0;


            for(int m =0; m<fillgirlskills.length;m++)
            {
                for(int n=0;n<fillboyskills.length;n++)
                {
                    if(fillgirlskills[m]-fillboyskills[n] == 1 )
                    {
                        count++;

                    }

                }
            }
            System.out.println(count);

    }



}