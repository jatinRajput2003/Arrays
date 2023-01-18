public class Sumsub2 {
    public static void sub(int arr[])
    {
        int max = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];
    prefix[0] = arr[0];

        for(int i =1;i < prefix.length;i++)
        {
            prefix[i] = prefix[i-1]+ arr[i];
        }

        for(int i = 0;i < arr.length;i++)
        {
            
            for(int j = i;j < arr.length;j++)
            {
                int sum = 0;
    
                sum = i == 0?prefix[j]:prefix[j] -  prefix[i-1];
              
                System.out.println("sum of this sub arry is "+sum);
                
                max = Math.max(max,sum);
            }
            System.out.println();
        }   
    
        System.out.println("Maximum sum "+max);
    
    }

    public static void main(String args[])
    {
      
        int ar[] = {8,12,45,92};

      sub(ar);

    }


}
