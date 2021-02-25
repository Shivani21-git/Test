import java.util.Arrays;

// The good thing about selection sort is it never makes more than O(n) swaps(i.e space complexity is O(1)  and can be useful when memory write is a costly operation.//
public class SelectionSort {
    public static void main(String[] args)
    {
        int a[] = {9,1,1,3,7,5,4,6,6};

        for(int i=0;i<=a.length-1;i++)
        {
           findMin(a,i,a.length-1);

        }
        System.out.println("Printing sorted array");
        for(int i : a)
        {
            System.out.println(i);
        }
    }
    public static void findMin(int a[],int startindex,int endindex)
    {
        int min = a[startindex];
        int index=startindex;
        int temp;
        for(int i = startindex+1; i<=endindex;i++)
        {
            if(min>a[i])
            {
                min=a[i];
                index =i;
            }

        }
        temp = a[startindex];
        a[startindex]=min;
        a[index] = temp;


    }
}
