/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	public void run() {
		/*
		 * knowing the world
		 */
			goToCorner();
			goToBeeper();
			Beeper();
			twist();
			comeBack();

		}

	}

	private void Beeper() {
		if (beepersPresent()) {
			pickBeeper();
		}
	}

	private void goToCorner() {
		while (frontIsClear()) {
				move();
			}
		turnRight();
	}
	private void goToBeeper(){
		turnRight();
		move();
		turnLeft();
		
	}
	private void twist(){
		turnLeft();
		turnLeft();
	}

	private void comeBack() {
		while (frontIsClear()) {
		move();	
				}
		turnRight();

	}

}