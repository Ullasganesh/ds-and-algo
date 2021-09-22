package arrays;
import java.util.Arrays;


public class KthElementSmallest {
    // Java code for kth smallest element
// in an array



	// Function to return k'th smallest
	// element in a given array
	public static int kthSmallest(int[] arr,
								int k)
	{
		// Sort the given array
		Arrays.sort(arr);

		// Return k'th element in
		// the sorted array
		return arr[k - 1];
	}

	
	public static void main(String[] args)
	{
		int arr[] = new int[]{ 12, 3, 5, 7, 19 };
		int k = 2;
		System.out.print("K'th smallest element is " + kthSmallest(arr, k));
	}




    
}
