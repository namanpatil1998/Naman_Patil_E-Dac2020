package DS.sorting;

public class Quick
{
    public static void main(String[] args)
    {
        int arr[]={50,12,60,8,24,35,94};
        int length=arr.length;
        Quick obj= new Quick();
        obj.quicksort(arr, 0, length-1);
        obj.disp(arr);
        
    }
    int partion(int[] arr,int low ,int high)
    {
        int pivot=arr[(low+high)/2];
        while(low<=high)
        {
            while(arr[low]<pivot)
            {
                low++;
            }
            while(arr[high]>pivot)
            {
                high--;
            }
            if(low<=high)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
                
            }
        }
        return low;
    }
    void quicksort(int [] arr,int low,int high)
    {
        int pi=partion(arr,low,high);
        if(low<pi-1)
        {
            quicksort(arr,low,pi-1);
        }
        if(pi<high)
        {
            quicksort(arr,pi,high);
        }
    }
    void disp(int [] arr)
    {
        System.out.println("--------quick sort array-------- ");
        for(int x:arr)
        {
  
            System.out.println(x);
        }
    }
}