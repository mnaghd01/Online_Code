/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	public void run() {
		while (leftIsClear()) { /*Checks to see if it has reached the top*/
			PutaRow();          /* Puts a beeper in a row back and forth*/
			goUp();         /*If reached at the end of a street, goes up one avenue*/
		}
	}

	private void PutaRow() {
		while (frontIsClear()) {
			int i = 1;
			while (i != 0) {
				putBeeper();
				i--;
				move();
			}
			if (frontIsClear()){
				move();
			}
		}
	}

	private void goUp() {
		if (facingEast()) {
			turnLeft();
			move();
			turnLeft();
		} else {
			turnRight();
			if (frontIsClear()){
			move();
			turnRight();
			}
		}
	}
}
