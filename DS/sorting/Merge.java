package DS.sorting;

public class Merge
{
   
     int array[];
     int temp[];
     int length;
    public static void main(String[] args)
    {
        int arr[]={10,50,22,85,32,2,14,62};
        Merge obj= new Merge();
        obj.op(arr);
        for(int x : arr )
        {
            System.out.println(x);
        }
       
    }
    void op(int[]arr)
    {
        this.array=arr;
        this.length=arr.length;
        this.temp=new int[length];
        divide(0,length-1);
    }
    void divide(int lowerindex,int higherindex)
    {
        if(lowerindex<higherindex)
        {
            int mid=lowerindex+(higherindex-lowerindex)/2;
            divide(lowerindex,mid);
            divide(mid+1,higherindex);
            merging(lowerindex,mid,higherindex);
        }
    }
    void merging(int lowerindex,int middle,int higherindex)
    {
        for(int i=0;i<=higherindex;i++)
        {
            temp[i]=array[i];
        }
        int i=lowerindex;
        int j=middle+1;
        int k=lowerindex;
        while(i<=middle && j<=higherindex)
        {
            //10,50,22,85,32,2,14,62
            if(temp[i]<=temp[j])
            {
                array[k]=temp[i];
                i++;
            }
            else
            {
                array[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=middle)
        {
            array[k]=temp[i];
            k++;
            i++;
        }
    }
}