package basics;

public class Car extends Vehicle {
	private int odometer;
	private IEngine engine;
	public String model = "Unknown";
	
	public Car(String model){
		this.engine = new LargeEngine();
		this.setModel(model);
	}

	public Car(String string, IEngine engine) {
		this.setModel(model);
		this.engine = engine;
	}

	public void drive(int distance) {
		this.odometer += distance;
	}
	
	public void start() {
		this.engine.start();
	}

	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public IEngine getEngine() {
		return this.engine;
	}

	public int getOdometer() {
		return this.odometer;
	}
}
