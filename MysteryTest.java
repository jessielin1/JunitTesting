import static org.junit.Assert.*;

import org.junit.Test;


public class MysteryTest {

	@Test
	public void testmystery1(){
		Mystery t = new Mystery("object");
		assertEquals(10,t.mystery1(10,70) );
		assertEquals(2,t.mystery1(8,6) );
		assertEquals(3,t.mystery1(6,9) );
		assertEquals(7,t.mystery1(42,49) );
		assertEquals(7,t.mystery1(21,7) );
		assertEquals(4,t.mystery1(20,12) );
		assertEquals(6,t.mystery1(24,18) );
		assertEquals(4,t.mystery1(8,4) );
		assertEquals(5,t.mystery1(10,15) );
		assertEquals(16,t.mystery1(32,16) );
}
	@Test
	public void testmystery2(){
		Mystery t = new Mystery("object2");
		assertEquals(-1.0, t.mystery2(1.0, 2.0, 1.0), 0.0);
		assertEquals(-0.2,t.mystery2(5.0,6.0,1.0),-1);
		assertEquals(3.0,t.mystery2(1.0,4.0,-21.0),-7);
		assertEquals(3.0,t.mystery2(1.0,-5.0,6.0),2.0);
		assertEquals(3.0,t.mystery2(1.0,-5.0,6.0),4.0);
		assertEquals(-0.5,t.mystery2(2.0,7.0,3.0),-3.0);
		assertEquals(2.0,t.mystery2(1.0,2.0,-8.0),-4.0);
		assertEquals(2.0,t.mystery2(1.0,-4.0,4.0),2.0);
		assertEquals(1.0,t.mystery2(1.0,4.0,-5.0),-5.0);
		assertEquals(1.0,t.mystery2(1.0,2.0,-3.0),-3.0);
		

}
}