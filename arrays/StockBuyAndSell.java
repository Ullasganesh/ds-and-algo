package arrays;

import java.util.ArrayList;

public class StockBuyAndSell {
    static ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        
        ArrayList<ArrayList<Integer>> outerList = new ArrayList<ArrayList<Integer>>();
        int minIndex=0,maxIndex=0;
        for(int i=1;i<n;i++){
            ArrayList<Integer> innerList = new ArrayList<>();
            if(A[i]>A[i-1]){
                minIndex=i-1;
                while(i<n && A[i]>A[i-1])
                    i++;
                maxIndex=i-1;
                innerList.add(minIndex);
                innerList.add(maxIndex);
                outerList.add(innerList);
            }
        }
        return outerList;
    }

    public static void main(String[] args) {
        int[] A = {100,180,260,310,40,535,695};
        int n=7;
        ArrayList<ArrayList<Integer> > ans=stockBuySell(A,n);
        System.out.println(ans);
        int p = 0;
            for(int i=0; i<n-1; i++)
                p += Math.max(0,A[i+1]-A[i]);
        if(ans.size()==0)
                System.out.print("No Profit");
        else{
            int c=0;
            for(int i=0; i<ans.size(); i++)
                c += A[ans.get(i).get(1)]-A[ans.get(i).get(0)];
                
            if(c==p)
                System.out.print(1);
            else
                System.out.print(0);
            }System.out.println();
    }
}
    

