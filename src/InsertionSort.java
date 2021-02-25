public class InsertionSort {
    public static void main(String[] args)
    {
        int a[] = {8,44,5,6,1,2,5};
        insertionSort(a);
        for(int i : a)
        {
            System.out.println(i);
        }
    }
    public static void insertionSort(int a[])
    {
        int temp;
        for(int i=1;i<a.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]= temp;
                }
            }
        }
    }
}
