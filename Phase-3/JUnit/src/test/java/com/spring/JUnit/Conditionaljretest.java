package com.spring.JUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("Conditionals Test")
@RunWith(JUnitPlatform.class)
public class Conditionaljretest {

	@Test
	@EnabledOnJre(JRE.JAVA_8)
	public void runOnlyOnJRE8()
	{
		System.out.println("This runs  only on JRE8");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_11)
	public void runOnlyOnJRE11()
	{
		System.out.println("This runs  only on JRE11");
	}
	@Test
	@EnabledIfSystemProperty(named = "os.version",matches = ".*10.*")
	public void runOnlyOnWindows10()
	{
		System.out.println("Windows 10 version");
	}
	@Test
	@EnabledIf("myCondition")
	public void condition1()
	{
		System.out.println("Execute test is it returns true");
	}
	@DisabledIf("myCondition")
	public void condition2()
	{
		System.out.println("Execute if it returns false");
	}
	boolean myCondition()
	{
		return true;
	}
}