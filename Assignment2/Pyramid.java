/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		
		//Get x-coordinate of midpoint
		double widthWindow = getWidth();
		
		//Get y-coordinate of midpoint
		double heightWindow = getHeight();
		
	
		//Build the next bottom row of pyramid centered
		//Next row reduces each time by one and its height changes by the height width
		for (int nextRow = BRICKS_IN_BASE; nextRow > 0; nextRow--) {
			
			//Get x-coordinate of brick in bottom row aligned to the left
			double xStartRow = (widthWindow - (BRICK_WIDTH * nextRow))/2;
			
			//Get y-coordinate of brick in bottom row aligned to the left
			double yStartRow = heightWindow - (BRICK_HEIGHT * (BRICKS_IN_BASE - nextRow));
			
			//Build bottom row of pyramid centered
			//Bottom row has 14 bricks
			for (int start = 0; start < nextRow; start++) {
				GRect brickRow = new GRect ((xStartRow + (start * BRICK_WIDTH)), yStartRow, BRICK_WIDTH, BRICK_HEIGHT);
				add (brickRow);
			}
			
		}
	}
}

