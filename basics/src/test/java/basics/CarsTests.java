package basics;

import static org.junit.Assert.*;

import org.junit.Test;

public class Cars {

	@Test
	public void canBuildCar() {
		Car myCar = new Car("Corvette");
		myCar.start();
	}
	
	public void canDriveBike() {
		Bike myBike = new Bike();
		int distance = 5;
		int initialOdometer = myBike.getOdometer();
		
		myBike.drive(distance);
		
		assertTrue(initialOdometer == myBike.getOdometer());
	}
	
	public void canIncrementOdometer(){
		
	}
	
	public void canBuildDifferentCars(){
		
	}
	
	public void canBuildConvertible(){
		
	}
	
	public void canMoveConvertibleTop(){
		
	}
}
