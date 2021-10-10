package arrays;

public class MinStepsToJump {
    static int minJumps(int[] arr){
        int jump=1,m=arr[0],step=arr[0],n=arr.length;
        if(n<=1)
            return 0;
        if(arr[0]==0)
            return -1;
        for(int i=1;i<n-1;i++){
            m=Math.max(m,i+arr[i]);
            step--;
            if(m==n) return jump+1;
            if(step==0){
                jump++;
                if(i>m-1)
                    return -1;
                step=m-i;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,1,2,4,2,0,1,1};
        int ans=minJumps(arr);
        System.out.println(ans);
    
    }
    
}
