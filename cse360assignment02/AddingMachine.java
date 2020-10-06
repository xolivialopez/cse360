// @author Olivia Lopez
// https://github.com/xolivialopez/cse360
package cse360assignment02;

public class AddingMachine {
	private int total;
	private String s = "0";
	
	public AddingMachine() {
		total = 0; // not needed - included for clarity
	}
	
	// return total
	public int getTotal() {
		return total;
	}
	
	// add parameter value to total
	public void add(int value) {
		total += value;
		s += " + " + value; 
	}

	// subtract parameter value from total
	public void subtract(int value) {
		total -= value;
		s += " - " + value; 
	}
	
	// history of transactions starting from 0
	public String toString() {
		return s;
	}
	
	// clear memory
	public void clear() {
		s = "";
		total = 0;
	}
}
