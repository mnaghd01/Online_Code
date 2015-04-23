/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does everything
 */

import stanford.karel.*;

/* In the following code. Karel moves to the end of each street, and in the process stops at the avenues that need tile repair;
 * then at the end of the street comes back and moves one street up, then does the same thing. 
 */
public class StoneMasonKarel extends SuperKarel {
	public void run() {   /* This condition makes sure Karel is not at the end of the street*/
			MoveUp();     /*Karel checks if there is a tile in place then moves on, if not puts one */
			MoveToNextPlace(); 	/* This method moves Karel to avenues 4 blocks apart*/
			ComeBack();      /* Makes Karel to come back to first avenue*/
			GoToNextColumn();   /* Makes Karel to go up one street*/
		}
	}

	private void CheckForTile() {
		if (noBeepersPresent()) {
			putBeeper();
		}
	}

	private void MoveToNextPlace() {
		int i = 1;
		while (i % 5 != 0) {
			move();
			i++;
		}

	}
	private void MoveUp() {
		while (leftIsCLear()) {	
			CheckForTile();
			turnLeft();
			move();
			
		}
	}

	private void GoToNextColumn() {
		turnLeft();
		if (frontIsClear()) {
			move();
		}
		turnRight();
	}

	private void ComeBack() {
		turnLeft();
		turnLeft();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
		turnLeft();
	}
}
