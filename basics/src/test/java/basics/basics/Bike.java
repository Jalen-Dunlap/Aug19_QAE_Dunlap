package basics.basics;

import basics.basics.foundation.Vehicle;

public class Bike extends Vehicle {
	@Override
	public void drive(int distance) {
		this.odometer += distance;
	}

	@Override
	public int getOdometer() {
		return this.odometer;
	}
}
