package junitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestCirc.class,
	TestRec.class,
	TestTri.class
})
public class AllTests {

}
