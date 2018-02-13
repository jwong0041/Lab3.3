//Author: Joyin Wong
import java.util.Arrays;
public class ArrayMethods3 
{
	public static void main(String[] args) 
	{ 
		String[] list = {"a", "f", "i", "d", "e", "b", "g", "h", "j", "c"};
		int[] list1 = {4, 8, 3, 1, 0, 2, 6, 5, 7, 9};
		
		
	}
	/* Merge Sort PseudoCode Example, provided by GeeksforGeeks.org
	 * 
	 MergeSort(arr[], l,  r)
If r > l
     1. Find the middle point to divide the array into two halves:  
             middle m = (l+r)/2
     2. Call mergeSort for first half:   
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
	 * 
	 */
	public static String[] mergeSort(String[] list)
	{
		int left = 0; //the first position? which would just be zero i guess?
		int right = list.length; //the last position or the right most number.
		int middle = (left + right)/2; //find the middle to begin splitting in half
	}
	
	public static int partition(int[] list1, int front, int back)
	{
		
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		
	}
	
	
	//copying the array every time it splits 
	public static int[] copyOfRange(int[] original_array, int from_index, int to_index)
	{
			
	}
	//swap methods in case i need them
	public static void swapS(String[] arr, int index1, int index2)
	{
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void swapI(int[] arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
