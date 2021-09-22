package basics.basics;

import basics.basics.foundation.IEngine;

public class SmallEngine implements IEngine{
	private final int cylinderCount = 4;
	
	public void start() {
		System.out.println("Small Engine Started");
	}
	
	public int getCylinderCount() {
		return this.cylinderCount;
	}
}
