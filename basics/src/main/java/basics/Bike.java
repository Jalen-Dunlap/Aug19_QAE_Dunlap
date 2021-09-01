package basics;

public class Bike extends Vehicle{
	protected int odometer;
	
	public Bike(){
		this.odometer = 0;
	}
	
	public void drive(int distance) {
		this.odometer += distance;
	}

	public int getOdometer() {
		return this.odometer;
	}

}
