/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;
/* In the program below, Karel will go through every street and checks if the coordinates of the blocks power to an even or odd number
 * if the combination of (x^2+y^2) is an even number it will not put a beeper and vise versa.
 * then when it reached the end of each street,it has to come back to where is started and go up one street and do the same in the second street.
 * In order to eliminate the off_by_one_bug, several procedures were put in place.
 */

public class CheckerboardKarel extends SuperKarel {
	public void run() {
		int i = 1;
		int j=1;
		while (leftIsClear()) { /*Two while loops check the number of the streets (j) and avenues (i) respectively.*/
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
			if ((i ^ 2 + j ^ 2) % 2 != 0){ /* The condition was put in place in case Karel reached the end of the street and did not put beeper were it should*/
				putBeeper();
			}
			j = 1;
			GoBack();
			i++;
		}
		while (frontIsClear()) { /* This condition is put in place in case Karel reached the top of the "world" and did not put the beepers due to OBOBug*/
			if ((i ^ 2 + j ^ 2) % 2 != 0) {
				putBeeper();
				move();
				i++;
			} else {
				move();
				i++;
			}
		}
		if ((i ^ 2 + j ^ 2) % 2 != 0)	{/* This condition is in place just for the very end block at the top right of the world where Karel encounters another OBOBug*/
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
