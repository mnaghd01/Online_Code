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
			GetReadyForNext();
			MoveToNext();
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
		int n=0
		int m=0
		for (int i=1,i=<3; i++){
			if (BeeperIsPresent()){
				n++;
				peekBeeper();
		}
			else {
				m++
				move();
			}
		}
		turnLeft();
		turnLeft();
		if(n==3) {
			for (int i=1; i=<3;i++){
				putBeeper();
				move();
			} 
			else {
				move();
				turnRight();
			}
		}
	}
	
	private GetReadyForNext(){
		turnRight();
		turnRight();
		move();
		turnLeft();
	}
	private MoveToNext(){
		move();
	}
}
