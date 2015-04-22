/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run() {

		while (noBeepersPresent()) {
			PaceTheWay();
			ComeBack();
			TheBper();
		}
	}

	private void PaceTheWay() {
		int i = 1;
		while (frontIsClear()) {
			i++;
			move();
		}
		if (i % 2 == 0) {

			int j = 0;
			int k = 0;
			j = i;

			while (k != j / 2) {

				move();
				k--;
			}
		} else {
			int j = 0;
			int k = 0;
			j = i;
			while (k != j / 2 + 1) {
				move();
				k--;
			}
		}
	}

	private void ComeBack() {

		turnLeft();
		turnLeft();
	}

	private TheBper() {

		putBeeper();
	}

}
