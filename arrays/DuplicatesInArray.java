package arrays;

import java.util.ArrayList;

public class DuplicatesInArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer>  al = new ArrayList<>();
       
       int count[] = new int[n];
       
       for(int i = 0;i<n;i++)
       {
           int x = arr[i];
           
           count[x]++;
       }
       for(int i = 0;i<n;i++)
       {
           if(count[i]>1)
           {
               al.add(i);
           }
       }
       if(al.isEmpty())
       {
           al.add(-1);
           return al;
       }
       return al;
   
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,2,3};
        int n=5;
        ArrayList<Integer> ans=duplicates(arr, n);
        System.out.println(ans);
        
    }
    
}
