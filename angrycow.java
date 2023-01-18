import java.util.*;
public class angrycow {
    
    public static boolean possible(int arr[],int m,int mid)
    {

         int last = arr[0];
         int cowcount = 1;

         for(int i =0;i <arr.length;i++)
         {
            if(arr[i] - last >= mid)
            {
                cowcount++;

                if(cowcount == m)
                {
                    return true;
                }
                
                last = arr[i];
            }
           
         }
         
         return false;
        
    }

    public static int Search(int arr[],int n,int m)
    {

        Arrays.sort(arr);
        int s = 0;

        int max = Integer.MIN_VALUE;

        for(int i =0;i < n;i++)
        {
            max = Math.max(arr[i],max);
        }

        int e = max;
            int mid = s + (e-s)/2;
            int ans = -1;

        while(s <= e)
        {

            if(possible(arr,m,mid))
            {
                
              ans = mid;
              s = mid + 1;
              
            }
            else
            {

                e = mid - 1;

            }

            mid = s + (e-s)/2;

        }

        return ans;

    }
    public static void main(String args[])
    {

        int arr[] = {4,2,1,3,6};

     System.out.println("The maximum minimum distance between cow is " + Search(arr,arr.length,2));

    }
}
