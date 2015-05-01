/* File: ChadKarel.java
 * 
 * A program in which Karel cleans up hanging chads from a
 * ballot.  The specifications of this program are set out in
 * "Handout 08: Section Handout #1"
 */

import stanford.karel.*;

public class ChadKarel extends SuperKarel {
/*
 * In this program Karel checks every alley at first picking every beeper if the number is 3,
 * then puts them back and moves to another alley if not, just goes to the next alley without putting
 * anything back.
 */
	public void run() {
		while (frontIsClear()){     //Checks if Karel has reached the end of the avenue or not.
			GoToEnd();                //Moves Karel to the end of the alley to start checking for beepers
			CheckForBeeper();		//Picks beepers and if they were intact puts them back
			MoveToNext();			//Moves Karel to the next street (alley)
	}
		GoToEnd();
		CheckForBeeper();
	}

	private void GoToEnd() { // Karel starts in the middle of the alley so this method pushes it to the north bound and faces south bound
		turnLeft();
		while (frontIsClear()) {
			move();
		}
		turnRight();
		turnRight();
	}
	
	

	private void CheckForBeeper(){ //Karel starts to pickup beeper and counting them while moving towards the south of the alley 
		int n=0;
		int m=0;
		for (int i = 1 ;i <= 3; i++){
			while (beepersPresent()){
				n++;
				pickBeeper();
			}
			m++;
			if (frontIsClear()){
			move();
			}
		}
		turnLeft();
		turnLeft();
		if(n==3) {						//If the number is three this means the chads were intact and should be put back else Karel will come to the middle and wait for next alley
			for (int i=1; i<=3;i++){
				putBeeper();
				if (frontIsClear()){
				move();
				}
			}							//If the number of beepers were not 3 then there is no need to put the beepers back, so Karel gets ready for the next alley
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
	
	private void MoveToNext(){			// Moves Karel to the next alley
		move();
	}
	
}
