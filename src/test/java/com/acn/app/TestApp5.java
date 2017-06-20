package com.acn.app;

import junit.framework.Assert;
import org.junit.Test;

public class TestApp5 {

	@Test
	public void testPrintHelloWorld5() {

		Assert.assertEquals(App.getHelloWorld5(), "Hello World 5");

	}

}