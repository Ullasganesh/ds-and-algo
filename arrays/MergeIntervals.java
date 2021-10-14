package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] nums) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(nums, (a, b) -> {
            if(a[0] == b[0]) return a[1]-b[1];
            return a[0]-b[0];
        });
        ans.add(nums[0]);
        int x = 0;
        for(int i=1;i<nums.length;i++) {
            if(ans.get(x)[1] >= nums[i][0])
                ans.get(x)[1] = Math.max(ans.get(x)[1],nums[i][1]);
            else {
                ans.add(nums[i]);
                x++;
            }
        }
        nums = new int[ans.size()][2];
        nums = ans.toArray(nums);
        return nums;
    }

    public static void main(String[] args) {
        int nums[][] = {{1,3},{2,6},{8,10},{15,18}};
        int ans[][]= merge(nums);
        int n=ans.length;
        int m=ans[0].length;
        for(int i=0;i<n;i++){
            for( int j=0;j<m;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
