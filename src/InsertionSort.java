import java.util.*;
public class InsertionSort {
    // Insertion sort
    //[5,6,9,3,6]
    public static int[] insertion(int[] arr)
    {
        for (int i=1; i<arr.length; i++)
        {
            int j=i-1;
            while(j>=0 && (arr[j] > arr[j+1])) // swapping only happened when the previous element is smaller
            {
                // swap element till it find great fit
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] arr={5,6,9,3,6};
        int[] temp=insertion(arr);
        System.out.println(Arrays.toString(temp));
    }
}