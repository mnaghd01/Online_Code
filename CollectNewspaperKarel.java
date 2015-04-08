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
		move();
		/*
		 * knowing the world
		 */
		while (noBeepersInBag()) {
			checkForPath();
			checkForBeeper();
			twist();
			comeBack();

		}

	}

	private void checkForBeeper() {
		if (beepersPresent()) {
			pickBeeper();
		}
	}

	private void checkForPath() {
		while (leftIsBlocked()) {
			if (frontIsClear()) {
				move();

			} else {
				turnRight();
			}
		}
		move();
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