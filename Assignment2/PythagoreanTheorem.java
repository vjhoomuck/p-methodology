/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println ("Enter values to compute Pythagorean theorem.");
		
		//Add values of a and b as double.
		double a = readDouble ("a: ");
		double b = readDouble ("b: ");
		
		//Calculate the solution of c as double.
		double x = (Math.pow(a, 2)) + (Math.pow(b, 2));
		double c = Math.sqrt(x);
			println ("c = " + c);
	}
	
}
