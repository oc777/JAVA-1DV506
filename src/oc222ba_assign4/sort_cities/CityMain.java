/**
 * 
 */
package oc222ba_assign4.sort_cities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author olgachristensen
 *
 */
public class CityMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<City> list = new ArrayList<City>();
		String path = "/Users/olgachristensen/documents/LNU/Java 1/javatxt/cities.txt";
		int count = 0;
		
		try {
			File file = new File(path);
			Scanner scan = new Scanner(file);
			
			while (scan.hasNext()) {
				String CityName = scan.next();
				//CityName = CityName.replace(';', ' ');
				CityName = CityName.substring(0, CityName.length()-1);
				int CityZip = scan.nextInt();
				
				City city = new City(CityZip, CityName);
				list.add(city);
				count++;	
			}
			scan.close();
		}
		
		catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		System.out.println("Reading from a file: " + path);
		System.out.println("Number of cities found: " + count);
		
		
		Collections.sort(list);
		
		for (City x : list) {
			System.out.println(x.toString());
		}

		
	}

}
