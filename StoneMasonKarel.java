/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;
/* In the following code. Karel moves to the end of each street, and in the process stops at the avenues that need tile repair;
 * then at the end of the street comes back and moves one street up, then does the same thing. 
 */
public class StoneMasonKarel extends SuperKarel {
	public void run() {
		int j=1;
		while (j!=6) {			/*This counter makes sure Karel would not go to higher streets than intended */
		if (frontIsClear()) {   /* This condition makes sure Karel is not at the end of the street*/
			CheckForTile();     /*Karel checks if there is a tile in place then moves on, if not puts one */
			MoveToNextPlace(); 	/* This method moves Karel to avenues 4 blocks apart*/
		} else {
			CheckForTile();   /*This was put into place for the Off_By_One error*/
			ComeBack();      /* Makes Karel to come back to first avenue*/
			GoToNextRow();   /* Makes Karel to go up one street*/
			j++;
		}
	}
	}
private void CheckForTile() {
		if (noBeepersPresent()) {
			putBeeper();
			}
	}
private void MoveToNextPlace() {
	int i=1;
	while (i%5!=0){
		move();
		i++;
	}
	
	}
private void GoToNextRow() {
	turnLeft();
	if (frontIsClear()) {
		move();
}
	turnRight();
}
private void ComeBack() {
	turnLeft();
	turnLeft();
	while (frontIsClear()){
	move();
	}
	turnLeft();
	turnLeft();
}
}
