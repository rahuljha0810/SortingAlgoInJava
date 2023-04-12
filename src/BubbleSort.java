import java.util.Arrays;
                                                            //Bubble Sort
public class BubbleSort {
    public static void main(String[] args)
    {
       //to sort n number of elements we need n-1 number of passes

        int[] arr={5,2,3,6,1,7};
        int n= arr.length;
        for (int i=0; i<n-1; i++)
        {
            for (int j=0; j<n-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    // if the upper element is larger
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
