import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]= {5,2,3,9,6,1,7};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static  void quickSort(int arr[], int left, int right)
    {
        if(left>=right)
        {
            return;
        }
        int pivotIndex= Partition(arr, left, right);
        quickSort(arr, left,pivotIndex-1);
        quickSort(arr, pivotIndex+1, right);

    }
    public  static int Partition(int arr[], int left, int right)
    {
        int pivot=arr[right];
        int i=left;
        for (int j= left; j<right; j++)
        {
            if(arr[j]<=pivot)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
        int temp= arr[right];
        arr[right]=arr[i];
        arr[i]=temp;
        return i;
    }
}
