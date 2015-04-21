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

public class StoneMasonKarel extends SuperKarel {
	public void run() {
		int j=0;
		while (j!=5) {			
		if (frontIsClear()) {
			j++;
			CheckForTile();
			MoveToNextPlace();
		} else {
			ComeBack();
			GoToNextRow();
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
