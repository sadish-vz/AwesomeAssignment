import junit.framework.TestCase;

public class InitialTests extends TestCase {
Box m_box;
	protected void setUp() throws Exception {
		super.setUp();
		m_box = new Box(10,15);
	}
	
	public void testPrintArea()
	{
int area = m_box.GetArea();
assertEquals(150, area);
	}

}
