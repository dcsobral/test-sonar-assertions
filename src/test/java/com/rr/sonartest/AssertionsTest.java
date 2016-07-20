package com.rr.sonartest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author dsobral
 * @since 7/20/16
 */
public class AssertionsTest {
  @Test
  public void testSonarAssertions() throws Exception {
    Assertions assertions = new Assertions();

    assertNotNull(assertions);
  }
}
