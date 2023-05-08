package comp5111.assignment.cut;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Refined_Regression_1_Test2 extends Regression_1_Test2 {

	@Test
	public void myTest01() throws Throwable{
		// 1732: Expected false | Actual true 
		boolean isLeapBool = Subject.GregorianTasks.isLeapYear(1900);
		
		// 416: Expected false | Actual True
		boolean isNumericBool = Subject.StringTasks.isNumeric("a123");
		
		// 563: Expected S, S | Actual SS	
		String[] actualSplitResult = Subject.StringTasks.splitByCharacterType("SS");

		String[] expectedSplitResult = {"S", "S"};
		
		assertAll( "Refined tests", 
				() -> Assertions.assertEquals(isLeapBool, false),
				() -> Assertions.assertEquals(isNumericBool, false),
				() -> Assertions.assertEquals(actualSplitResult, expectedSplitResult)
		);
		
	}

}
