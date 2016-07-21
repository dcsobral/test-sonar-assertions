package com.rr.sonartest;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author dsobral
 * @since 7/20/16
 */
public class AssertionsTest {
  @Test
  public void testSonarAssertions() throws Exception {
    Assertions assertions = new Assertions();

    Assert.assertNull(assertions);
    Assert.assertEquals(null, assertions);
    Assert.assertThat(assertions, CoreMatchers.nullValue());
    Assert.assertThat(assertions, CoreMatchers.is((Assertions) null));
  }
}
