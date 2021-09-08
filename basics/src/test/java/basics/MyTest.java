package basics;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTest {
	@Test
	public void test() {
		boolean isBooleanOverlimit = !(2*10<11);
		System.out.println(isBooleanOverlimit);
	}
}
