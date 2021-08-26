package basics;

import static org.junit.Assert.*;

import org.junit.Test;

public class Cars {

	@Test
	public void canBuildCar() {
		Car myCar = new Car("Corvette");
		myCar.start();
	}

}
