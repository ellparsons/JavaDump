package parametersOperatorsTest;

import static org.junit.Assert.*;
import org.junit.Test;
import parametersOperators.ParametersOperators;

public class ParametersOperatorsTest {

	@Test
	public void testAddition()
	{
	assertEquals("This doesnt equal the corect amount", 12, ParametersOperators.Addition(5,7));
	}

}
