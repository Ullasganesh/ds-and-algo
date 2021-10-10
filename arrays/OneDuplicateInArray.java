package arrays;

public class OneDuplicateInArray {
    public static int findDuplicate(int[] nums) {
        int n = nums.length,i;
        int[] b = new int[n];
        for(i=0;i<n;i++){
            if(b[nums[i]]==0)
                b[nums[i]]++;
            else
                return nums[i];
        
       }
       return 0;    
    }

    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);

    }
    
}
