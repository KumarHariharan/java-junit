package com.acn.app;

import junit.framework.Assert;
import org.junit.Test;

public class TestApp4 {

	@Test
	public void testPrintHelloWorld4() {

		Assert.assertEquals(App.getHelloWorld4(), "Hello World 4");

	}

}