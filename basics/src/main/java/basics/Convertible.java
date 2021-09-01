package basics;

public class Convertible extends Car {

	Convertible(String model) {
		super(model);
	}

	public Convertible(String string, IEngine engine) {
		super(string,engine);
	}

	
}
