package com.rr.sonartest;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author dsobral
 * @since 7/20/16
 */
public class WorkingAssertionsOtherModuleTest {
  @Test
  public void testSonarAssertions() throws Exception {
    ExternalClass externalClass = new ExternalClass();

    Assert.assertNull(externalClass);
    // Any of the following works too:
    // Assert.assertNotNull(externalClass);
    // Assert.assertEquals(null, externalClass);
    // Assert.assertNotEquals(null, externalClass);
    // Assert.assertThat(externalClass, CoreMatchers.nullValue());
    // Assert.assertThat(externalClass, CoreMatchers.notNullValue());
    // Assert.assertThat(externalClass, CoreMatchers.is((ExternalClass) null));
    // Assert.assertThat(externalClass, CoreMatchers.is(CoreMatchers.not((ExternalClass) null)));
    // MatcherAssert.assertThat(externalClass, CoreMatchers.nullValue());
  }
}
