package com.acn.app;

import junit.framework.Assert;
import org.junit.Test;

public class TestApp3 {

	@Test
	public void testPrintHelloWorld3() {

		Assert.assertEquals(App.getHelloWorld3(), "Hello World 3");

	}

}