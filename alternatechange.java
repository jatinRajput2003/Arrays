
public class alternatechange {
    
    public static void print(int arr[])
    {

        for(int i =0;i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void ater(int arr[])
    {

        int temp = 0;
        for(int i =0;i < arr.length;i+=2)
        {

             temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;

        }
    }
    public static void main(String args[])
    {

        int arr1[] = {27,9,2,0,1};
        int arr2[] = {5,9,2,0,1,8};

        ater(arr1);
        print(arr1);

        System.out.println();

        ater(arr2);
        print(arr2);

    }
}
