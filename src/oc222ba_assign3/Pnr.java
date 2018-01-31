/**
 * 
 */
package oc222ba_assign3;


/**
 * @author olgachristensen
 *
 */
public class Pnr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//pnr: string "YYMMDD-NNNN"
		String pnr1 = "811218-9876";
		String pnrF = "830507-1261";
		String pnrM = "780631-7777";
		String pnr3 = "830507-1261";
		
		String firstPart = getFirstPart(pnr1);
		System.out.println("First part: "+ firstPart);
		
		String secondPart = getSecondPart(pnr1);
		System.out.println("Second part: "+ secondPart);
		
		System.out.println("Personal number belongs to a woman: " + isFemaleNumber(pnrF));
		System.out.println("Personal number belongs to a man: " + isMaleNumber(pnrM));

		System.out.println("The numbers are the same: " + areEqual(pnr3, pnrF));
		
		System.out.println("Personal number is correct: " + isCorrect(pnr1));
		System.out.println("Personal number is correct: " + isCorrect(pnrM));
		
	}
	
	private static String getFirstPart(String str) {
		//YYMMDD
		return getPart(str, 0, 6);	
	}
	
	
	private static String getSecondPart(String str) {		
		//NNNN
		return getPart(str, 7, 11);	
	}
	
	private static String getPart(String str, int start, int end) {
		String part;
		StringBuilder temp = new StringBuilder();
		
		for (int i = start; i < end; i++) {
			temp.append(str.charAt(i));
		}
		
		part = temp.toString();
		
		return part;	
	}
	
	
	private static int[] stringToArray(String str) {
		//turns string into array of numbers
		int[] arr = new int[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		
		return arr;
	}
	
	
	private static boolean isFemaleNumber(String str) {
		// true if n3 in second part is even
		int[] arr = stringToArray(getSecondPart(str));
		return (arr[2]%2 == 0);
	}
	
	
	private static boolean isMaleNumber(String str) {
		// if isFemale=false
		return (isFemaleNumber(str) == false);		
	}

	
	private static boolean areEqual(String x, String y) {
		// true if 2 PNR are the same
		return (x.compareTo(y) == 0);
	}
	
	
	private static boolean isCorrect(String str) {
		return (isDate(str) == true && isControlNumber(str) == true);
	}
	
	private static boolean isDate(String str) {
		//checks if the first part of pnr is correct
		boolean isDate = false;
		
		int[] arr = stringToArray(getFirstPart(str));

		int yy = arr[0] * 10 + arr[1];
		int mm = arr[2] * 10 + arr[3];
		int dd = arr[4] * 10 + arr[5];
		
		if (mm < 13 && dd < 32)
			isDate = true;
	
		//special case February
		if (yy%4 != 0 && mm == 2 && dd > 28) 
			isDate = false;
		
		if (yy%4 == 0 && mm == 2 && dd > 29) 
			isDate = false;
		
		//special case 30-day month
		if (mm == 4 || mm == 6 || mm == 9 || mm == 11) 
			if (dd > 30)
				isDate = false;
		
		return isDate;	
	}
	
	private static boolean isControlNumber(String str) {
		boolean isControlNumber = false;
		
		int[] first = stringToArray(getFirstPart(str)); 
		int[] second = stringToArray(getSecondPart(str));
		
		for (int i = 0; i<first.length; i+=2) {
			first[i] = first[i] * 2;
		}
		
		for (int i = 0; i<second.length; i+=2) {
			second[i] = second[i] * 2;
		}
		
		int sum = 0;
		
		for (int i = 0; i<first.length; i++) {
			if (first[i] < 11)
				sum += first[i];
			else {
				sum += first[i]/10;
				sum += first[i]%10;
			}
		}
		
		for (int i = 0; i<second.length-1; i++) {
			if (second[i] < 11)
				sum += second[i];
			else {
				sum += second[i]/10;
				sum += second[i]%10;
			}
		}
		
		int controlN = 10 - (sum % 10);
		
		if (controlN == second[3])
			isControlNumber = true;
		
		return isControlNumber;
	}

}

