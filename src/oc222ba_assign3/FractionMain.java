/**
 * 
 */
package oc222ba_assign3;

/**
 * @author olgachristensen
 *
 */
public class FractionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3, 15);
		Fraction f2 = new Fraction(-2, -5);
		
		System.out.println("Numerator: " + f2.getNumerator());
		System.out.println("Denominator: " + f2.getDenominator());
		
		System.out.println("Fraction is negative: " + f1.isNegative());
		System.out.println("Fraction is negative: " + f2.isNegative());
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		
		Fraction sum = f1.add(f2);
		System.out.println("SUM: " + sum.toString());
		
		Fraction subtract = f1.subtract(f2);
		System.out.println("SUB: " + subtract.toString());
		
		Fraction mult = f1.multiply(f2);
		System.out.println("MULT: " + mult.toString());
		
		Fraction div = f1.divide(f2);
		System.out.println("DIV: " + div.toString());
		
		System.out.println("Fractions are equal: " + f1.isEqualTo(f2));
	}

}
