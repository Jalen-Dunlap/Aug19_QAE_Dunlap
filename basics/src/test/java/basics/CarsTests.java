package basics;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarsTests {
	
	@Test
	public void canDriveBike() {
		Bike myBike = new Bike();
		int distance = 5;
		int initialOdometer = myBike.getOdometer();
		
		myBike.drive(distance);
		int postDriveOdometer = myBike.getOdometer();
		
		assertTrue("This bike cannot be driven",initialOdometer+distance == postDriveOdometer);
	}
	
	@Test
	public void canIncrementOdometer(){
		Car myCar = new Car("Mustang", new LargeEngine());
		int distanceToDrive = 20;
		int preDriveMileage = myCar.getOdometer();
		
		myCar.start();
		myCar.drive(distanceToDrive);
		
		assertTrue("The odometer does not tack mileage.",preDriveMileage+distanceToDrive == myCar.getOdometer());
	}
	
	@Test
	public void canBuildDifferentCars(){
		Car largeCar = new Car("F150", new LargeEngine());
		Car smallCar = new Car("2020 Chevy Camero", new SmallEngine());
		
		int largeCarCylinders = largeCar.getEngine().getCylinderCount();
		int smallCarCylinders = smallCar.getEngine().getCylinderCount();
		
		assertTrue("Large car cylinder count is wrong.", largeCarCylinders == 8);
		assertTrue("Large car cylinder count is wrong.", smallCarCylinders == 4);
	}
	
	@Test
	public void canBuildConvertible(){
		Convertible myConvertible = new Convertible("2020 Chevy Camaro",new SmallEngine());
		
		myConvertible.start();
		
		assertTrue(myConvertible.getEngine().getCylinderCount() == 4);
	}
	
	@Test
	public void canMoveConvertibleTop(){
		Convertible myConvertible = new Convertible("Chevy Camaro",new SmallEngine());
		
		
		myConvertible.lowerTop();
		boolean afterLower = myConvertible.getTopStatus();
		
		assertTrue(afterLower);
		
		myConvertible.raiseTop();
		boolean afterRaise = myConvertible.getTopStatus();
		
		assertTrue(afterRaise);		
	}
}
