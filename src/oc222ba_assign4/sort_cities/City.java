/**
 * 
 */
package oc222ba_assign4.sort_cities;


/**
 * @author olgachristensen
 *
 */
public class City implements Comparable<City>{
	private String CityName;
	private int CityZip;
	
	
	public City (int n, String s) {
		CityName = s;
		CityZip = n;
	}
	
	public String getName() {
		return CityName;
	}
	
	public int getZip() {
		return CityZip;
	}
	
	public String toString() {
		return CityZip + " " + CityName;
	}
	
	public int compareTo(City x) {
		return CityZip - x.getZip();
	}

}
