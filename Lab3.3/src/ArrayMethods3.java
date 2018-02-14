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
		
		//base case
		if (list.length == 1)
		{
			return list;
		}
		//recursion
		return (merge(mergeSort(left), mergeSort(right)));
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		
	}
	
		public static int partition(int[] list1, int front, int back)
		{
		
		}
	
	
	
	
	//merge from Lab3.2
	public static String[] merge(String[] list1, String[] list2)
	{
		int x = list1.length;
		int y = list2.length;
		int z = x + y;
		String sorted[] = new String [z];
		int a= 0; //counting variable for list1
		int b = 0; //counting variable for list2
		int c = 0; //counting variable for the sorted array
		
		while(a < x && b < y) //makes sure it doesn't count out of bounds
		{
			if(list1[a].compareTo(list2[b]) <= 0 )
			{
				sorted[c] = list1[a];
				c++;
				a++;
			} else if(list1[a].compareTo(list2[b]) > 0) {
				sorted[c] = list2[b];
				c++;
				b++;
			}
		}
		
		//following two while loops is to fill in any leftover numbers
		while (a < x)
		{
			sorted[c] = list1[a];
			a++;
			c++;
		}
		
		while(b < y)
		{
			sorted[c] = list2[b];
			b++;
			c++;
		}
		
		return sorted;
		
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
