
public class squareroot {
    
public static int root(int n)
{

    int s = 1;
    int e = n;

    int mid = s + (e-s)/2;

    int element = mid * mid;
    int ans = -1;

    while(s < e)
    {

        if(element == n)
        {
          return mid;
        }
        
        else if(element < n)
        {
            ans = element;
            s = mid + 1;

        }
        else
        {
            e = mid -1;
        }   
        mid = s + (e - s)/2;
    }

    return ans;

}

    public static void main(String args[])
    {
        
        System.out.print("square root of number is "+root(1000000));

    }
}
