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
		int i = 1;
		int j=1;
		while (leftIsClear()) {
			j = 1;
			while (frontIsClear()) {
				if ((i ^ 2 + j ^ 2) % 2 != 0) {
					putBeeper();
					move();
					j++;
				} else {
					move();
					j++;
				}
			}
			if ((i ^ 2 + j ^ 2) % 2 != 0){
				putBeeper();
			}
			j = 1;
			GoBack();
			i++;
		}
		while (frontIsClear()) {
			if ((i ^ 2 + j ^ 2) % 2 != 0) {
				putBeeper();
				move();
				i++;
			} else {
				move();
				i++;
			}
		}
		if ((i ^ 2 + j ^ 2) % 2 != 0)	{
			putBeeper();
		}
	}

	private void GoBack() {
		turnLeft();
		turnLeft();
		while (frontIsClear()) {
			move();
		}
		turnRight();
		if (frontIsClear()) {
			move();
		}
		turnRight();
	}
}
