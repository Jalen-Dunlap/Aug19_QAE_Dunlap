package basics.basics;

public abstract class Vehicle {
	protected int odometer;
	
	abstract public void drive(int distance);
	
	abstract public int getOdometer();
}
