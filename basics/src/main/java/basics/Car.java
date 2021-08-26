package basics;

public class Car {
	private int odometer;
	private LargeEngine engine;
	public String model;
	
	Car(String model){
		this.setEngine(new LargeEngine());
		this.setModel(model);
	}
	
	public void drive(int distance) {
		//TODO Will be created later
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

	public LargeEngine getEngine() {
		return engine;
	}
	
	public void setEngine(LargeEngine engine) {
		this.engine = engine;
	}

	public int getOdometer() {
		return odometer;
	}
}
