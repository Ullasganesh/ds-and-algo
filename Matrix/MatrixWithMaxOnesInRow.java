package Matrix;

public class MatrixWithMaxOnesInRow {
    static int rowWithMax1s(int arr[][], int n, int m) {
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                if(arr[j][i]==1)
                return j;
            }
        }
        return -1;
    
    }
    public static void main(String[] args) {
        int arr[][] = {{0, 1, 1, 1},
                      {0, 0, 1, 1},
                      {1, 1, 1, 1},
                      {0, 0, 0, 0}};
        int n=4;
        int m=4;
        int ans = rowWithMax1s(arr, n, m);
        System.out.println(ans+1);
    }
}
