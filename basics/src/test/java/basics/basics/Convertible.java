package basics.basics;

public class Convertible extends Car {
	private boolean isTopDown;

	public Convertible(String string, IEngine engine) {
		super(string,engine);
	}

	public void lowerTop() {
		System.out.println("Top was lowered.");
		this.isTopDown = true;
	}

	public void raiseTop() {
		System.out.println("Top was raised.");
		this.isTopDown = false;
	}

	public boolean getTopStatus() {
		return isTopDown;
	}
}
