import static org.junit.Assert.*;

import org.junit.Test;


public class DepositoCombustibleTest {

	DepositoCombustible tank = new DepositoCombustible(40.0,00.0);
	
	//1
	@Test
	public final void testGetDepositoNivel() throws Exception{
		assertEquals(0.0,tank.getDepositoNivel(),0);
	}
	
	//2
	@Test
	public final void testGetDepositoMax() throws Exception{
		assertEquals(40.0, tank.getDepositoMax(),0);
	}

	//3
	@Test
	public final void testEstaVacio() throws Exception{
		assertTrue(tank.estaVacio());
	}
	
	//4
	@Test
	public final void testEstaLleno() throws Exception{
		tank.fill(20.0);
		
		double a = tank.getDepositoMax();
		double b = tank.getDepositoNivel();
		double c = a/2;
		
		assertEquals(c, b, 0);
	}

	//5
	@Test
	public final void testConsumir() throws Exception{
		tank.fill(100);
		tank.consumir(50);
		assertEquals(50.0, tank.getDepositoNivel(), 0);
	}

	//6
	@Test
	public final void testFill() throws Exception{
		tank.fill(100);
		assertEquals(100.0, tank.getDepositoNivel(), 0);
	}
}
