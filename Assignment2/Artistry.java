/*
 * File: Artistry.java
 * Name:
 * Section Leader:
 * ==========================================================
 * Replace these comments with a description of your program.
 * Since this program is more freeform than the rest, tell us
 * a bit about it in these comments!
 */
import acm.graphics.GLabel;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;
import java.awt.*;

public class Artistry extends GraphicsProgram {
	public final static int houseWidth = 300;
	public final static int houseHeight = 300;
	public final static int windowWidth = 50;
	public final static int windowHeight = 50;
	public final static int doorWidth = 100;
	public final static int doorHeight = 150;
	public final static int diameter = 10;
	
	
	public void run() {
		/* You fill this in.  Remember that you must have
		 * 
		 * 1. At most twenty GObjects,
		 * 2. At least one filled object,
		 * 3. At least two different colors of objects, and
		 * 4. At least three different types of objects (not
		 *    counting the GLabel you use to sign your name).
		 * 
		 * Also, be sure to sign your name in the bottom-right
		 * corner of the canvas.
		 */
		
			int widthWindow = getWidth();
			int heightWindow = getHeight();
			
			int x = (widthWindow-houseWidth)/2;
			int y = (int) ((heightWindow - (0.5 * houseHeight)) / 2);
			
			
			
			GRect rectangleHouse = new GRect (x, y, houseWidth, houseHeight);
			add (rectangleHouse);
		    
		    GRect rectangleWindowLeft = new GRect (x + (windowWidth*0.5), y + windowHeight, windowWidth, windowHeight);
		    rectangleWindowLeft.setFilled(true);
		    rectangleWindowLeft.setFillColor(Color.GRAY);
		    add (rectangleWindowLeft);
		    
		    GRect rectangleWindowRight = new GRect (x + (windowWidth*4.5), y + windowHeight, windowWidth, windowHeight);
		    rectangleWindowRight.setFilled(true);
		    rectangleWindowRight.setFillColor(Color.GRAY);
		    add (rectangleWindowRight);
		    
		    GRect rectangleDoor = new GRect (x + (windowWidth*2), y + (3*windowHeight), doorWidth, doorHeight);
		    rectangleDoor.setFilled(true);
		    rectangleDoor.setFillColor(Color.BLACK);
		    add (rectangleDoor);
		    
		    GOval oval = new GOval (x + (windowWidth*3.5), y + (4.5*windowHeight), diameter, diameter);
		    oval.setFilled(true);
		    oval.setFillColor(Color.WHITE);
		    add (oval);
		    
		    add (new GLine ((widthWindow/2),50,x,y));
		    
		    add (new GLine ((widthWindow/2),50,2.32*x, y));
		    
		    add (new GLabel ("Artistry by dhana_vj", (windowWidth*0.5), windowHeight));
		}
		
}
