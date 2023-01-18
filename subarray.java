public class subarray {
    
    public static void sub(int arr[])
    {
        int sum =0;
        for(int i = 0;i < arr.length;i++)
        {
            for(int j = i;j < arr.length;j++)
            {

                for(int k = i;k <= j;k++)
                {

                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                  System.out.println();
                System.out.println("sum of this sub arry is "+sum);

            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
      
        int ar[] = {8,12,45,92};

      sub(ar);

    }
}
