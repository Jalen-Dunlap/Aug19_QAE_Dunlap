package basics;

public class Convertible extends Car {
	private String top = "Up";

	public Convertible(String string, IEngine engine) {
		super(string,engine);
	}

	public void lowerTop() {
		System.out.println("Top was lowered.");
		this.top = "Down";
	}

	public void raiseTop() {
		System.out.println("Top was raised.");
		this.top = "Up";
	}

	public String getTopStatus() {
		return top;
	}
}
