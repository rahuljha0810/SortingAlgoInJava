public class MergeSort {
    static void mergeSort(int[] arr, int left, int right)
    {
        if(left >= right)
        {
            return ;
        }
        int mid=(left+right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }
    static void merge(int[] arr, int left, int mid, int right)
    {
        int[] b= new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=right)
        {
            if(arr[i]<=arr[j])
            {
                b[k]=arr[i];
                i++;
                k++;
            }
            else{
                b[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid)
        {
            b[k]=arr[i];
            i++;
            k++;
        }
        while(j<=right)
        {
            b[k]=arr[j];
            j++;
            k++;
        }
        k=0;
        for (int p= left; p<=right; p++)
        {
            arr[p]=b[k];
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr={5,2,3,6,9,1};
        mergeSort(arr, 0, arr.length-1);
        for(int d: arr)
        {
            System.out.print(d +" ");
        }

    }
}
