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
		while (noBeepersInBag()) {
			goToCorner();
			goToBeeper();
			Beeper();
		}
		while (beepersPresent()){	
			twist();
			comeBack();

		}

	}

	public void Beeper() {
		if (beepersPresent()) {
			pickBeeper();
		}
	}

	public void goToCorner() {
		while (frontIsClear()) {
				move();
			}
		turnRight();
	}
	public void goToBeeper(){
		turnRight();
		move();
		turnLeft();
	}
	public void twist(){
		turnLeft();
		turnLeft();
	}

	public void comeBack() {
		while (frontIsClear()) {
		move();	
				}
		turnRight();

	}

}