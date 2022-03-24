package com.selenium.Testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SimpleTest {
  @Test
  public void testFalse() {
	  assertEquals(false, true);
  }
  @Test
  public void testTrue() {
	  assertEquals(true, true);
  }
}
