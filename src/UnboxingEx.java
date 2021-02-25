import java.util.Scanner;

public class UnboxingEx {
    public static void main(String[] args)
    {
        Integer ob = new Integer(20);
        int a = ob;
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        for(int i=0;i<array.length;i++)
        {
            array[i]= sc.nextInt();
        }
       testMethod(array);
    }
    public static void testMethod(int[] array)
    {

    }
}
