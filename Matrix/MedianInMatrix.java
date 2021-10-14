package Matrix;

import java.util.Arrays;

public class MedianInMatrix {
    static int median(int matrix[][], int r, int c) {
        int arr[]=new int[r*c];
        int size=0;
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                arr[size++]=matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[arr.length/2];
    
    }
    public static void main(String[] args) {
        int[][] matrix ={{1, 3, 5}, 
                        {2, 6, 9}, 
                        {3, 6, 9}};
        int r=3;
        int c=3;
        int ans = median(matrix,r,c);
        System.out.println(ans);
   
    }
    
}
