/**
 * 
 */
package oc222ba_assign3;

/**
 * @author olgachristensen
 *
 */
public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d) {
		setNumerator(n);
		setDenominator(d);
	}
	
	private void setNumerator(int n) {
		numerator = n;
	}
	
	private void setDenominator(int d) {
		if (d == 0)
			System.err.println("Denominator cannot iqual zero!");
		if (d > 0)
			denominator = d;
		if (d < 0) {
			numerator = -numerator;
			denominator = -d;
		}
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public boolean isNegative() {
		return numerator < 0;
	}
	
	public void reduce() {
		int n = numerator;
		int d = denominator;
		int max;
		int gcd = 0;
		
		if (n > d)
			max = n;
		else
			max = d;
		
		for (int i = max; i >= 2; i--) {
			if (n % i == 0 && d % i == 0) {
				gcd = i;
				break;
			}
		}
			
		if (gcd != 0) {
				numerator = numerator / gcd;
				denominator = denominator/ gcd;
			}
	}
	
	public String toString() {
		this.reduce();
		String str = "";
		str += numerator + "/" + denominator;
		return (str);
	}
	
	
	public Fraction add(Fraction f) {
		int n, d;
		if (denominator != f.denominator) {
			n = numerator*f.denominator + f.numerator*denominator;
			d = denominator*f.denominator;
		}
		else {
			n = numerator + f.numerator;
			d = denominator;
		}
		Fraction result = new Fraction(n, d);
		//result.reduce();
		return result;
	}
	
	
	public Fraction subtract(Fraction f) {
		int n, d;
		if (this.denominator != f.denominator) {
			n = this.numerator*f.denominator - f.numerator*this.denominator;
			d = this.denominator*f.denominator;
		}
		else {
			n = this.numerator - f.numerator;
			d = this.denominator;
		}
		Fraction result = new Fraction(n, d);
		result.reduce();
		return result;
	}
	

	public Fraction multiply(Fraction f) {
		int n, d;
		n = this.numerator * f.numerator;
		d = this.denominator * f.denominator;
		Fraction result = new Fraction(n, d);
		result.reduce();
		return result;
	}
	

	public Fraction divide(Fraction f) {
		int n, d;
		n = this.numerator * f.denominator;
		d = this.denominator * f.numerator;
		Fraction result = new Fraction(n, d);
		result.reduce();
		return result;
	}

	
	public boolean isEqualTo(Fraction f) {
		this.reduce();
		f.reduce();
		return (this.numerator == f.numerator && this.denominator == f.denominator);
	}
}
