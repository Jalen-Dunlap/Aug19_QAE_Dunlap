package basics.basics;

public class LargeEngine implements IEngine{
	private final int cylinderCount = 8;
	
	public void start() {
		System.out.println("Engine Started.");
	}

	public int getCylinderCount() {
		return this.cylinderCount;
	}
}
