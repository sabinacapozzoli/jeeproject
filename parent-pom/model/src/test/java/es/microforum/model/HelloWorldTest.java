package es.microforum.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import es.microforum.model.HelloWorld;

public class HelloWorldTest {

	@Test
	public void test() {
		assertTrue(HelloWorld.hello("pepe").equals("hello pepe"));
	}

}
