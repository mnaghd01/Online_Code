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
		int j = 1;
		while (frontIsClear()) {
			move();
			i++;
		}
		turnLeft();
		while (frontIsClear()) {
			move();
			j++;
		}
		turnLeft();
		while (j != (2*j -1)) {
			int k = i;
			while (k != 0) {
				if ((k ^ 2 + j ^ 2) % 2 != 0) {
					putBeeper();
					move();
					k--;
				} else {
					move();
					k--;
				}
			}
			k = i;
			GoBack();
			GoDown();
			j--;
		}
	}

	private void GoBack() {
		turnLeft();
		turnLeft();
		while(frontIsClear()){
			move();
		}
		turnRight();
		turnRight();
	}
	private void GoDown(){
		turnLeft();
		move();
		turnRight();
	}
}
