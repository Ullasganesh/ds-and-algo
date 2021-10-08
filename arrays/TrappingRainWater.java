package arrays;

public class TrappingRainWater {
    static long trappingWater(int arr[], int n) { 
        
        long water = 0;
        int start = 0, end = n - 1;
        int leftmax = 0, rightmax = 0;

        while(start < end){
            
            leftmax = Math.max(leftmax, arr[start]);
            rightmax = Math.max(rightmax, arr[end]);

            if(leftmax < rightmax)
                water += leftmax - arr[start++];
        
            else
                water += rightmax - arr[end--];
        }

        return water;
    }
    public static void main(String[] args) {
        int[] arr= {3,0,0,2,0,4};
        int n=6;
        long ans =trappingWater(arr, n);
        System.out.println(ans);
    }
    
}
