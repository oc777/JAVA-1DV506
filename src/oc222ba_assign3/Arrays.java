/**
 * 
 */
package oc222ba_assign3;

/**
 * @author olgachristensen
 *
 */
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 7, 5, 9};
		
		int s = sum(arr);
		System.out.println("Sum of all integers in arr is "+s);
		
		String string = toString(arr);
		System.out.println("Array to string: "+string);
		
		String stringAddN = toString(addN(arr, 3));
		System.out.println("Adding a number: "+ stringAddN);
		
		String stringReverse = toString(reverse(arr));
		System.out.println("Reversed array: "+ stringReverse);
		
		System.out.println("Contains number: "+hasN(arr, 3));
		
		replaceAll(arr, 1, 7);
		System.out.println("After replacing: " + toString(arr));
		
		String stringSorted = toString(sort(arr));
		System.out.println("Sorted array: " + stringSorted);
		
		int [] sub = {7, 5, 9};
		System.out.println("Contains substring: " + hasSubsequence(arr, sub));
	}

	private static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	private static String toString(int[] arr) {
		int l = arr.length;
		String str = "{";							
		for (int i = 0; i<l; i++) {
			str += arr[i];
			if (i != l-1) 
				str += ", ";
		}
		str += "}";
		return str;
	}
	
	private static int[] addN(int[] arr, int n) {
		int [] arrN = new int [arr.length];
		for (int i=0; i<arr.length; i++) {
			arrN[i] = arr[i] + n;
		}
		return arrN;
	}
	
	private static int[] reverse(int[] arr) {
		int [] reverseArr = new int [arr.length];
		for (int i=0; i <arr.length; i++) {
			reverseArr[i] = arr[arr.length-1-i];	
		}
		return reverseArr;	
	}
	
	private static boolean hasN(int[] arr, int n) {
		boolean hasN = false;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == n){
				hasN = true;
				break;
			}
		}
		return hasN;
	}
	
	private static void replaceAll(int[] arr, int old, int nw) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == old)
				arr[i] = nw;
		}
		
	}
	
	private static int[] sort(int[] arr) {
		int [] sorted = new int [arr.length]; 
		
		for (int i=0; i<arr.length; i++) {
			sorted[i] = arr[i];
		}
		
		for (int i = sorted.length-1; i>=0; i--) {
			for (int j=1; j<=i; j++) {
				int temp = sorted[j - 1];
				if (sorted[j - 1] > sorted[j]) {
					sorted[j - 1] = sorted[j];
					sorted[j] = temp;
				}
				else {
					sorted[j-1] = sorted[j-1];
					sorted[j] = sorted[j];
				}
			}
		}
		return sorted;
	}

	private static boolean hasSubsequence(int[] arr, int[] sub) {
		boolean hasSub = false;
		
		if (arr.length >= sub.length) {
			for (int i=0; i<arr.length; i++) {
				if (arr[i] == sub[0]) {
					if (sub.length <= arr.length-i) {
						for (int j=0; j<sub.length; j++) {
							if (sub[j] == arr[j+i]) {
								hasSub = true;
							}
							else {
								hasSub = false;
								break;
							}
						}
					}
				}
			}
		}
		
		
		
		return hasSub;
	}
}

