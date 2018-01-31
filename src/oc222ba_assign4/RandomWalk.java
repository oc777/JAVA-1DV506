package oc222ba_assign4;
/**
 * 
 */


import java.util.Random;

/**
 * @author olgachristensen
 *
 */
public class RandomWalk {
	
	private int positionX;
	private int positionY;
	private int stepsMax;
	private int stepsTaken;
	private int planeSize;
	
	// the maximum number of steps is max and size is the size of the plane 
	// the start position is set to (0, 0)
	public RandomWalk(int max, int size) {
		positionX = 0;
		positionY = 0;
		setStepsMax(max);
		stepsTaken = 0;
		setPlaneSize(size);
	}
	
	// sets maximum number of steps
	// if negative int is entered, changes it to positive
	private void setStepsMax(int max) {
		if (max > 0)
			stepsMax = max;
		else
			stepsMax = -max;
	}
	
	// sets the size of the plane
	// if negative int is entered, changes it to positive
	private void setPlaneSize(int size) {
		if (size < 0)
			planeSize = -size;
		else
			planeSize = size;
	}
	
	// returns number of steps taken
	public int getStepsTaken() {
		return stepsTaken;
	}
	
	// returns a string containing the number of steps taken so far and the current position
	public String toString() {
		String result = "Steps taken: " + stepsTaken + "; Current position: (" + positionX + ", " + positionY + ")";
		return result;
	}
	
	// simulates taking a single step
	public void takeStep() {
		stepsTaken++;
		Random r = new Random();
		int nextStep = r.nextInt(4) + 1;
		switch (nextStep) {
		case 1:
			positionY++;
			break;
		case 2:
			positionX++;
			break;
		case 3:
			positionY--;
			break;
		case 4:
			positionX--;
			break;
		}
		//System.out.println(this.toString()); // testing
	
	}
	
	// returns true if the number of steps taken is less than the maximal number of steps
	public boolean moreSteps() {
		return (stepsTaken < stepsMax);
	}
	
	// returns true if the current position is inside the boundary of the plane
	public boolean inBounds() {
		return (positionX < planeSize && positionX > (-planeSize) && positionY < planeSize && positionY > (-planeSize));
	}
	
	// simulates a random walk, i.e. steps are taken until the maximum number of steps has been taken 
	// or until a step goes outside the boundary of the plane
	public void walk() {
		while (moreSteps() && inBounds()) {
			takeStep();
		}
	}

}
