public class QuickSort
{
    static int[] a = {1,5,3,6,7,2,3};
    public static void main(String[] args)
    {
        sortMethod(0,a.length-1);
        for(int i : a)
        {
            System.out.println(i);
        }

    }
    public static void sortMethod(int low,int high)
    {
        int i=low;
        int j= high;
        int pivot = a[low + (high - low) / 2];
        while (i<=j)
        {
            while (a[i]<pivot)
            {
                i++;
            }
            while (a[j]>pivot)
            {
                j--;
            }
            if(i<=j)
            {
                int temp;
                temp = a[i];
                a[i] = a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        if(low<j)
        {
            sortMethod(low,j);
        }
        if(i<high)
        {
            sortMethod(i,high);
        }
    }
}