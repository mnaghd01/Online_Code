/* File: ChadKarel.java
 * 
 * A program in which Karel cleans up hanging chads from a
 * ballot.  The specifications of this program are set out in
 * "Handout 08: Section Handout #1"
 */

import stanford.karel.*;

public class ChadKarel extends SuperKarel {

	public void run() {
			GoToEnd();
			CheckForBeeper();
	}

	private void GoToEnd() {
		turnLeft();
		while (frontIsClear()) {
			move();
		}
		turnRight();
		turnRight();
	}

	private void CheckForBeeper(){
		int n=0;
		int m=0;
		for (int i = 1 ;i <= 3; i++){
			if (beepersPresent()){
				n++;
				pickBeeper();
				move();
		}
			else {
				m++;
				move();
			}
		}
		turnLeft();
		turnLeft();
		if(n==3) {
			for (int i=1; i<=3;i++){
				putBeeper();
				move();
			}
			turnRight();
			turnRight();
			move();
			turnLeft();
		} 
			else {
				move();
				turnRight();
			}
	}
	
}
