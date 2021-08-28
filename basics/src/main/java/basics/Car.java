package basics;

public class Car {
	private int odometer;
	private IEngine engine;
	public String model;
	
	Car(String model){
		this.setEngine(new LargeEngine());
		this.setModel(model);
	}
	
	public void drive(int distance) {
	}
	
	public void start() {
		engine.start();
	}

	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public IEngine getEngine() {
		return engine;
	}
	
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

	public int getOdometer() {
		return odometer;
	}
}
