package com.ccaspers.hellofaces;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HelloFacesBeanTest {
	HelloFacesBean bean = new HelloFacesBean();
	
	@Test
	public void testThatBeanGreetsTheWorldByDefault() {
		assertThat(bean.getGreeting(), is(equalTo("Hello World!")));
	}
	
	@Test
	public void testThatAudienceCanBeChanged() {
		bean.setAudience("Everybody");
		assertThat(bean.getGreeting(), is(equalTo("Hello Everybody!")));
	}

}
