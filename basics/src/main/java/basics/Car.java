package basics;

public class Car extends Vehicle {
	private IEngine engine;
	public String model;
	private boolean isStarted;
	
	public Car(String string, IEngine engine) {
		this.setModel(model);
		this.engine = engine;
	}

	@Override
	public void drive(int distance) {
		if(isStarted) {
			this.odometer += distance;
		}
	}
	
	public void start() {
		isStarted = true;
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

	@Override
	public int getOdometer() {
		return this.odometer;
	}
}
