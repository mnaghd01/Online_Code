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
		RepairTheTiles();/*						 */
	}

	private void RepairTheTiles() {	/*Initial process to do the repair job,*/
		while (frontIsClear()) {
			MoveUp();				/*moves Karel up the avenues of the map and meanwhile checks for the missing tiles.*/
			MoveDown();				/*moves Karel down the avenue to the first street*/
			CheckIfEnd();			/*Checks if Karel has reached to the block */
		}
		ErSafe();					/*This is to vouch for the OFF_BY_One error.*/
	}

	private void MoveUp() {  /*turns Karel to the left, moves it up till it reaches the top*/
		turnLeft();
		while (frontIsClear()) {
			CheckForTile();
			move();
		}
		CheckForTile();      /* This is in case top was blocked*/
		turnRight();
	}

	private void MoveDown() { /* Makes Karel to come back.*/
		turnRight();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
	}

	private void CheckForTile() { /*
								 * Karel checks if there is a tile in place then
								 * moves on, if not puts one
								 */
		if (noBeepersPresent()) {
			putBeeper();
		}
	}

	private void CheckIfEnd() {
		if (frontIsClear()) {
			MoveToNextPlace();
		} else {
			turnRight();
		}
	}

	private void MoveToNextPlace() { /*
									 * This method moves Karel to avenues 4
									 * blocks apart
									 */
		int i = 1;
		while (i % 5 != 0) {
			move();
			i++;
		}
	}

	private void ErSafe() {
		MoveUp();
		MoveDown();
	}
}