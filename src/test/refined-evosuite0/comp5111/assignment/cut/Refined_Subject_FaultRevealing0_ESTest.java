package comp5111.assignment.cut;

import static org.junit.Assert.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class Refined_Subject_FaultRevealing0_ESTest extends Subject_FaultRevealing0_ESTest {

	@Test
	public void myTest01() throws Throwable{

        // Expected: false | Actual: true (fault_1732)
        boolean boolean1 = Subject.GregorianTasks.isLeapYear(1900);

        // Expected: false | Actual: true (fault_416)
        boolean boolean2 = Subject.StringTasks.isNumeric("a");

        // Expected: "fT" | Actual: "Tf"
        String string3 = Stream.of(boolean1, !boolean2).map(x -> (x ? "T" : "f")).collect(Collectors.joining());

        // Expected: {"f", "T"} | Actual: {"Tf"} (fault_563)
        String[] strArray4 = Subject.StringTasks.splitByCharacterType(string3);

        assertArrayEquals(new String[] { "f", "T" }, strArray4);
	}

}
