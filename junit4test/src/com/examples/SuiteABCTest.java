package com.examples;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.experimental.categories.*;

@RunWith(Categories.class)
@Categories.IncludeCategory(PerformanceTest.class)
//        <- this is 9/11
@Suite.SuiteClasses({
		FunTest.class,
		FunTest2.class
})

public class SuiteABCTest {

}  








//        <- this is 26/11
