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

			Put();
			
			
}
	private void know() {
		int j=0;
		int i=0;
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
		while (i!=0){
			
		}
	}

	private void Put() {
		int i = 1;
		while (frontIsClear()) { 
			while (leftIsClear()){
			if (frontIsClear()){
			if (i % 2 !=0) {
				putBeeper();
				i++;
				move();
			} else {
				move();
				i++;
			}
		} else {
			goUp();
		}
		}
		goUp();
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
