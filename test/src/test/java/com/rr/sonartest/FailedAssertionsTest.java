package com.rr.sonartest;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author dsobral
 * @since 7/20/16
 */
public class FailedAssertionsTest {
  @Test
  public void testSonarAssertions() throws Exception {
    SameModuleClass sameModuleClass = new SameModuleClass();

    Assert.assertNull(sameModuleClass);
    Assert.assertNotNull(sameModuleClass);
    Assert.assertEquals(null, sameModuleClass);
    Assert.assertNotEquals(null, sameModuleClass);
    Assert.assertThat(sameModuleClass, CoreMatchers.nullValue());
    Assert.assertThat(sameModuleClass, CoreMatchers.notNullValue());
    Assert.assertThat(sameModuleClass, CoreMatchers.is((SameModuleClass) null));
    Assert.assertThat(sameModuleClass, CoreMatchers.is(CoreMatchers.not((SameModuleClass) null)));
    MatcherAssert.assertThat(sameModuleClass, CoreMatchers.nullValue());
  }
}
