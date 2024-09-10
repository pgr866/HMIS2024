package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Esta clase es una prueba unitaria para la clase Director.
 */
class DirectorTest {

	/**
	 * Prueba el método equals de la clase Director.
	 */
	@Test
	void testEqualsObject() {
		Director d1 = new Director("Pepe", "h", "01/01/2000");
		Director d2 = new Director("Pepe", "h", "01/01/2000");

		assertEquals(d1, d2);
	}
}
