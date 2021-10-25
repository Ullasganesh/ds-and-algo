package Matrix;


public class SpecificPairMaxValue {
    
  

    // The function returns maximum value A(d,e) - A(a,b)
    // over all choices of indexes such that both d > a
    // and e > b.
    static int findMaxValue(int N,int mat[][])
    {
        
        int maxValue = Integer.MIN_VALUE;
      
        // Consider all possible pairs mat[a][b] and
        // mat1[d][e]
        for (int a = 0; a < N - 1; a++)
          for (int b = 0; b < N - 1; b++)
             for (int d = a + 1; d < N; d++)
               for (int e = b + 1; e < N; e++)
                  if (maxValue < (mat[d][e] - mat[a][b]))
                      maxValue = mat[d][e] - mat[a][b];
      
        return maxValue;
    }
      
    // Driver code
    public static void main (String[] args)
    {
        int N = 5;
 
        int mat[][] = {
            { 1, 2, -1, -4, -20 },
            { -8, -3, 4, 2, 1 },
            { 3, 8, 6, 1, 3 },
            { -4, -1, 1, 7, -6 },
            { 0, -4, 10, -5, 1 }
            };
 
        System.out.print("Maximum Value is " +findMaxValue(N,mat));
                         
    }
}
    

