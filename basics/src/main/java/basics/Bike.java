package basics;

public class Bike extends Vehicle {
	protected int odometer = 0;
	
	@Override
	public void drive(int distance) {
		this.odometer += distance;
	}

	@Override
	public int getOdometer() {
		return this.odometer;
	}
}
