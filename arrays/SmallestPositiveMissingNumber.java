package arrays;

import java.util.Arrays;

public class SmallestPositiveMissingNumber {
    static int missingNumber(int arr[], int size)
    {
        Arrays.sort(arr);
        int temp = 0;
        for(int i:arr){
            if(i == temp + 1){
                temp += 1;
            }
        }
        return temp+1;   
    }

    public static void main(String[] args) {
        int[] arr ={0,-10,1,3,-20};
        int size=5;
        int ans = missingNumber(arr, size);
        System.out.println(ans);
    }
    
}
