/**
 * 
 */
package oc222ba_lab1;


/**
 * @author olgachristensen
 *
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Distance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// distance = Sqrt( (x1-x2)^2 + (y1-y2)^2 )

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Provide coordinates x1 y1 x2 y2: ");
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		
		double d = Math.sqrt( Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) );
		
		DecimalFormat xxx = new DecimalFormat("0.###");

		String dist = xxx.format(d);
		
		System.out.print(dist);
		
		scan.close();
		
		
	}

}
