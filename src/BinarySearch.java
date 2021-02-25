public class BinarySearch {
    static int arr[] = {2,3,6,8,9,10,14,18};
   static int element = 18;

    public static void main(String[] args) {
        int mid = (arr.length-1)/2;
        int element_found = find(arr,element,mid);
    }
    public static int find(int arr[], int element,int mid)
    {

        if(element==arr[mid])
        {
            System.out.println("Element found at index "+ mid);
        }
      else  if(element> arr[mid])
        {
            mid = ((mid+1)+ (arr.length-1))/2;
            find(arr,element,mid);


        }
  else      if(element<arr[mid])
        {
            mid= (0+(mid-1))/2;
            find(arr,element,mid);
    }
  return mid;
    }
}
