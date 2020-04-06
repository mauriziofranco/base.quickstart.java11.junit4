package centauri.academy.base.quickstart.java11.junit4;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private App testApp ;
	
	@Before
	public void init () {
		testApp = new App () ;
	}
	
    /**
     * Rigourous Test :-)
     */
	@Test
    public void testApp()
    {
        assertTrue(testApp.getCondition());
    }
}
