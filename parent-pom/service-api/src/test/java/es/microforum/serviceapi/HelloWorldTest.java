package es.microforum.serviceapi;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		assertTrue(HelloWorld.hello("pepe").equals("hello pepe"));
	}

}
