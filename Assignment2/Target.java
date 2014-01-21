/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	private final static double outerCircleRadius = 72;
	private final static double whiteCircleRadius = 0.65 * outerCircleRadius;
	private final static double innerCircleRadius = 0.3 * outerCircleRadius; 
	
	public void run() {
		/* You fill this in.
		Radius Outer Red Oval = 1 inch (72 pixel)
		Radius White Oval = 0.65 inch
		Radius Inner Red Oval = 0.3 inch
		 */
		
		//Get x-coordinate of midpoint
		int widthWindow = getWidth();
		
		//Get y-coordinate of midpoint
		int heightWindow = getHeight();
		
		//Get x-coordinate of Red outer circle
		double xOuterRed = (widthWindow - (outerCircleRadius*2))/2;
		
		//Get y-coordinate of Red outer circle
		double yOuterRed = (heightWindow - (outerCircleRadius*2))/2;
		
		//Create outer red filled Oval
		GOval outerRedOval = new GOval (xOuterRed, yOuterRed, (outerCircleRadius*2), (outerCircleRadius*2));
		outerRedOval.setColor(Color.RED);
		outerRedOval.setFilled(true);
		outerRedOval.setFillColor(Color.RED);
		add(outerRedOval);

		//Get x-coordinate of white circle
		double xWhite = (widthWindow - (whiteCircleRadius*2))/2;
		
		//Get y-coordinate of white circle
		double yWhite = (heightWindow - (whiteCircleRadius*2))/2;
		
		//Create white filled Oval
		GOval whiteOval = new GOval (xWhite,yWhite, (whiteCircleRadius*2), (whiteCircleRadius*2));
		whiteOval.setColor(Color.WHITE);
		whiteOval.setFilled(true);
		whiteOval.setFillColor(Color.WHITE);
		add(whiteOval);
		
		//Get x-coordinate of red inner circle
		double xInnerRed = (widthWindow - (innerCircleRadius*2))/2;
		
		//Get y-coordinate of red inner circle
		double yInnerRed = (heightWindow - (innerCircleRadius*2))/2;
		
		//Create inner red filled Oval
		GOval innerRedOval = new GOval (xInnerRed,yInnerRed, (innerCircleRadius*2), (innerCircleRadius*2));
		innerRedOval.setColor(Color.RED);
		innerRedOval.setFilled(true);
		innerRedOval.setFillColor(Color.RED);
		add(innerRedOval);
	}
	
}
