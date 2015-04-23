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
	public void run() {
		RepairTheTiles();/*
						 * This condition makes sure Karel is not at the end of
						 * the street
						 */

	}

	private void RepairTheTiles(){
		while (leftIsClear()){
				MoveUp();   		  		/*Karel checks if there is a tile in place then moves on, if not puts one */
				MoveDown();/* Makes Karel to come back to first avenue*/
				CheckIfEnd();
	}
	}
	}
	private void MoveUp() {
		turnLeft();
		while (frontIsClear()) {
			CheckForTile();
			move();
		}
		CheckForTile();
	}

	private void MoveDown() {
		turnRight();
		turnRight();
		while (frontIsClear()) {
			move();
		}
		turnLeft();

	}

	private void CheckForTile() {
		if (noBeepersPresent()) {
			putBeeper();
		}
	}
	private void CheckIfEnd(){
		if (frontIsClear()){
			MoveToNextPlace();
		}
			else {
				turnRight();
			}
	}

	private void MoveToNextPlace() {	/* This method moves Karel to avenues 4 blocks apart*/

		int i = 1;
		while (i % 5 != 0) {
			move();
			i++;
		}

	}
}