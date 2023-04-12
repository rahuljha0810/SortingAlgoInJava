import java.util.Arrays;

public class SelectionSort {
    public static void main(String []args)
    {
        int[] arr= { 5,2,3,6,9};
        int n= arr.length;
        // for selection sort we need n number of passes
        for (int i=0; i<n-1; i++)
        {
            int min=i;
            // finding min in the area of intrest
            for(int j=i+1; j< n; j++)
            {
                if (arr[min] > arr[j])
                {
                    min=j;
                }
            }
            // swapping of the min element
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
