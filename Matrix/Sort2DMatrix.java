package Matrix;

import java.util.Arrays;

public class Sort2DMatrix {
    static int[][] sortedMatrix(int N, int Mat[][]) {
        int arr[]=new int[N*N];
        int size=0;
        for(int i=0; i<N; i++)
            for (int j=0; j<N; j++)
                arr[size++]=Mat[i][j];
        Arrays.sort(arr);
        
        size=0;
        for(int i=0; i<N; i++)
            for (int j=0; j<N; j++)
                Mat[i][j]=arr[size++];
        
        return Mat;
    }
    public static void main(String[] args) {
        int Mat[][] = {{10,20,30,40},
                      {15,25,35,45}, 
                      {27,29,37,48},
                      {32,33,39,50}};
        int N=4;
        int[][] ans = sortedMatrix(N, Mat);
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }    
    }
}
