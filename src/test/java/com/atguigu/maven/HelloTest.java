package com.atguigu.maven;

import org.junit.Test;

public class HelloTest {

	@Test
	public void test() {
		Hello hello = new Hello();
		String mavenString ="Hello Maven!";
		System.out.println(hello.outPut(mavenString));
	}
}
