package Matrix;

import java.util.ArrayList;

public class SpiralTraversing {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int T,B,L,R,dir;
        T=0;
        B=matrix.length-1;
        L=0;
        R=matrix[0].length-1;
        dir=0;
        int i;
        
    
        while(T<=B && L<=R)
        {
            if(dir==0)
            {
                for(i=L;i<=R;i++)
                    ans.add(matrix[T][i]);
                T++;
            }
            else if(dir==1)
            {
                for(i=T;i<=B;i++)
                    ans.add(matrix[i][R]);
                R--;
            }
            else if(dir==2)
            {
                for(i=R;i>=L;i--)
                    ans.add(matrix[B][i]);
                B--;
            }
            else if(dir==3)
            {
                for(i=B;i>=T;i--)
                    ans.add(matrix[i][L]);
                L++;
            }
            dir=(dir+1)%4;
        }
        return ans;
    }

    public static void main(String[] args) {
        int r = 4;
        int c = 4;
        int matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}};
        ArrayList<Integer> sol = spirallyTraverse(matrix, r, c);
        System.out.println(sol);
    }
}
