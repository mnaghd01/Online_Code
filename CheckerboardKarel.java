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

			know();
			
			
}
	private void know() {
		int j=0;
		int i=0;
		int k=0;
		while(frontIsClear()){
			move();
			i++;
		}
		while(leftIsClear()){
		turnLeft();
		move();
		j++;
		turnRight();
		}
		k=i;
		turnLeft();
		turnLeft();
		while (j!=-1){
			i=k;
			for (int l=i;l>=1;l--){
				if (l*j%2!=0){
					putBeeper();
					move();
				} else {
					move();
				}
			}
			j--;
			GoDown();
			}
	}

	private void GoDown() { /*Checks which avenue Karel is, then decides how it should go up*/
		if (facingWest()) {
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
