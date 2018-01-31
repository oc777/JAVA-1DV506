/**
 * 
 */


import oc222ba_assign4.RandomWalk;

/**
 * @author olgachristensen
 *
 */
public class RandomWalkMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// test for RandomWalk.java
		
		RandomWalk walk = new RandomWalk(15, 5);
		
		System.out.println(walk.toString());
		
		/*
		walk.takeStep();
		System.out.println(walk.inBounds());
		System.out.println(walk.moreSteps());
		*/

		/*
		walk.takeStep();
		System.out.println(walk.toString());
		*/
		
		walk.walk();
		//System.out.println(walk.walk());

	}

}
