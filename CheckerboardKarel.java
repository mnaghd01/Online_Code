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
		while (frontIsClear()) { /*Checks to see if it has reached the top*/
			while (leftIsClear()){
			Put();/* Puts a beeper in a row back and forth*/
         /*If reached at the end of a street, goes up one avenue*/
			}
			goUp();
			}
			
	}
	private void Put() {
		int i = 1;

			if (i % 2 !=0) {
				putBeeper();
				i++;
				move();
			} else {
				move();
				i++;
			}
		}
	
	private void ComeBack(){
		turnLeft();
		turnLeft();
		while (frontIsClear()){
			move();
		}if (rightIsClear());
		turnRight();
		turnRight();
	}

	private void goUp() { /*Checks which avenue Karel is, then decides how it should go up*/
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
