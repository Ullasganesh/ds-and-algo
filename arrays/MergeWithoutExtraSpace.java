package arrays;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void merge(int arr1[], int arr2[], int n, int m) {
        int i=n-1,j=0;
        while(i>=0 &&j<m)
        {
                if(arr1[i]>arr2[j])
                {
                    arr1[i]=arr1[i]+arr2[j];
                    arr2[j]=arr1[i]-arr2[j];
                    arr1[i]= arr1[i]-arr2[j];
                    
                }
                i--;j++; 
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for( i=0;i<n;i++){
           System.out.print(arr1[i]);
        }
        for( i=0;i<m;i++){
            System.out.print(arr2[i]);
        }

    }
    public static void main(String[] args) {
        int[] arr1={1, 3, 5, 7};
        int[] arr2={0, 2, 6, 8, 9};
        int n=4;
        int m=5;
        merge(arr1, arr2, n, m);
    }
    
}
