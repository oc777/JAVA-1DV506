/**
 * 
 */
package oc222ba_assign3;

/**
 * @author olgachristensen
 *
 */
public class Point {
	private int x;
	private int y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	public Point(int a, int b) {
		x = a;
		y = b;
	}
	
	public void setX(int a) {
		x = a;
	}
	
	public void setY(int b) {
		y = b;
	}
	
	public String toString() {
		String str = "(" + x + "," + y + ")"; 
		return str;
	}
	
	public boolean isEqualTo(Point point) {
		return (x == point.x && y == point.y);
	}
	
	public double distanceTo(Point point) {
		double dist;
		
		dist = Math.sqrt( Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2) );
		
		return dist;
	}
	
	public void move(int a, int b) {
		setX(x + a);
		setY(y + b);
	}
	
	public void moveToXY(int a, int b) {
		setX(a);
		setY(b);
	}
	
}
