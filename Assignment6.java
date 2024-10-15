public class Assignment6 {
    
    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int partation(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low;
        int j = high-1;

        while(i<=j)
        {
            while(i<=j && arr[i]< pivot)
            {
                i++;
            }

            while(i<=j && arr[j]>=pivot)
            {
                j--;
            }

            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;

    }   

    public static void quicksort(int arr[], int low ,int high)
    {
        if(low < high)
        {
            int pivot_index = partation(arr,low,high);

            quicksort(arr, low, pivot_index-1);
            quicksort(arr, pivot_index+1, high);
        }
    }
    public static void main(String args[])
    {
        int arr[] = {2,6,5,0,8,7,1,3};
        System.out.println("Array Before sorting...");
        print(arr);
        quicksort(arr,0,arr.length-1);
        System.out.println("Array After sorting...");
        print(arr);
        
    }    
}
