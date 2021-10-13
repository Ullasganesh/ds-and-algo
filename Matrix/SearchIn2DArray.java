package Matrix;

public class SearchIn2DArray {
    public static boolean binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            
            int mid = start + (end - start)/2;
            
            if(arr[mid] == x){
                return true;
            }
            else if(x > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            
        }
        
        return false;
        
    }
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        
        // Step 1: Find rows & columns count
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        // Step 2: Find the row in which target lies
        for(int i=0;i<rows;i++){
            if(matrix[i][columns-1] >= target){
                
                // Step 3: Once row is found, apply binary search on that row
                return binarySearch(matrix[i],target);
            }
        }
        
        return false;
        
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean ans = searchMatrix(matrix,target);
        System.out.println(ans);

    }
    
}
