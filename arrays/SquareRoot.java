package arrays;

public class SquareRoot {
    static long floorSqrt(long x)
	{
	    long low=1,high=x,mid;
        long ans=1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(mid*mid<=x)
                {
                    ans=mid;
                    low=mid+1;
                }
            else
                high=mid-1;
        }
        return ans;
		
	}
    public static void main(String[] args) {
        long x =10;
        long ans = floorSqrt(x);
        System.out.println(ans);
    }
    
}
