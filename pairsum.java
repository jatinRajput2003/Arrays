import java.util.*;
public class pairsum {
    
    public static ArrayList pair(int arr[],int s)
    {
         
        ArrayList<Integer> l = new ArrayList<>();

        for(int i =0;i < arr.length;i++)
        {
            for(int j = i+1;j < arr.length;j++)
            {

                if(arr[i] + arr[j] == s)
                {
                    l.add(arr[i]);
                    l.add(arr[j]);
                    Collections.sort(l);
                }
            }
        }
        return l;

    }
    public static void main(String args[])
    {

        int arr[] = {2,7,9,1,4};

        int sum = 9;


         System.out.print("the pairs are "+pair(arr,sum));
         
    }
}
