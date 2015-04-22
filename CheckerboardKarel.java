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
		while (frontIsClear()) {
			PutaRow();
		}
		if (frontIsClear()){
			goUp();
 }
}

private void PutaRow(){
	int i=1;
	int j=1;
	while (i!=0) {
		putBeeper();
		i--;
	}
	move();
}
private void goUp(){
	turnLeft();
	move();
	turnLeft();
}
}