import java.util.*;
public class MergeOfTwoArray {
    public static void main(String[] args)
    {
        // you have given two sorted array
        int[] arr1={8,12,15,20};
        int[] arr2={2,10,20,25,35};
        int l1=arr1.length; // length of 1st arrays
        int l2=arr2.length;// length of second arrays

        int[] newArray= new int[l1+l2];
        int i=0; // travel in arr1;
        int j=0; // travel in arr2
        int k=0; // travel in new array

        while(i<l1 && j<l2)
        {
            if(arr1[i]>arr2[j])
            {
                newArray[k]=arr2[j];
                k++;
                j++;
            }
            else{
                newArray[k]=arr1[i];
                k++;
                i++;
            }
        }
        while(i<l1)
        {
            newArray[k]=arr1[i];
            k++;
            i++;
        }
        while(j<l2)
        {
            newArray[k]=arr2[j];
            k++;
            j++;
        }

        System.out.println(Arrays.toString(newArray));



    }
}
