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

public class WindChill {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Temperature in C: ");
		double t = scan.nextDouble();
		System.out.print("Wind speed in m/s: ");
		double v = scan.nextDouble();
		
		//Tapparent(°C) = 33 + (Tair- 33)*(0.474 + 0.454√(v)-0.0454.v)

		double wct = (33 + (t -33)*(0.474 + 0.454*Math.sqrt(v) - 0.0454*v));
		
		DecimalFormat x = new DecimalFormat("0.#");
		String str = x.format(wct);
		
		System.out.print(str);
		scan.close();
	}

}
