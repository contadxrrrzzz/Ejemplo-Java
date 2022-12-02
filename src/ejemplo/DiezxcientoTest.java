package ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiezxcientoTest {

	@Test
	public void testSacarAhorros() throws Exception{
		assertEquals (20000, Diezxciento.sacarAhorros(200000));
		assertEquals (10000, Diezxciento.sacarAhorros(5100000));
		assertEquals (0, Diezxciento.sacarAhorros(1));
		assertEquals (1, Diezxciento.sacarAhorros(0));

		
		
	}

}
