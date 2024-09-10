package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Esta clase es una prueba unitaria para la clase Actriz.
 */
class ActrizTest {

	/**
	 * Prueba el método equals de la clase Actriz.
	 */
	@Test
	void testEqualsObject() {
		Actriz a1 = new Actriz("Maria", "m", "01/01/2000");
		Actriz a2 = new Actriz("Maria", "m", "01/01/2000");

		assertEquals(a1, a2);
	}
}
