/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	// Create Sentinel
	private static final int SENTINEL = 0;
	
	public void run() {
		println ("This program finds the largest and smallest numbers.");
		
		int value = readInt (" ? ");
		
		if (value == SENTINEL) {
			println ("Error. Please write a value.");
		}
		else {
			int min = value; 
			int max = value;
			
			while (value != SENTINEL) {
				value = readInt (" ? ");
				if (value == SENTINEL) {
					break;
				}
				if (min > value) {
					min = value;
				}
				if (max < value) {
					max = value;
				}
			}
			println ("smallest: " + min);
			println ("largest:" + max);
		}	
	}
	
}

