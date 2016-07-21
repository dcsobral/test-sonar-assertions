package com.rr.sonartest;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author dsobral
 * @since 7/20/16
 */
public class WorkingAssertionsFailTest {
  @Test
  public void testSonarAssertions() throws Exception {
    SameModuleClass sameModuleClass = new SameModuleClass();

    Assert.fail(); // this one is recognized
  }
}
