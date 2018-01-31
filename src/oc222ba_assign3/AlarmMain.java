/**
 * 
 */
package oc222ba_assign3;

/**
 * @author olgachristensen
 *
 */
public class AlarmMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AlarmClock alarm = new AlarmClock(23, 35);

		alarm.setAlarm(23, 48);
		
		alarm.displayTime();
		
		alarm.setAlarm(6, 15);
		
		for (int i=0; i < 500; i++) {
			alarm.timeTick();
		}
		
		alarm.displayTime();
		
	}

}
