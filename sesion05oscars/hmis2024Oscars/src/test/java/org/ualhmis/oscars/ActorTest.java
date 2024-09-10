package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Esta clase es una prueba unitaria para la clase Actor.
 */
class ActorTest {

	/**
	 * Prueba el método equals de la clase Actor.
	 */
	@Test
	void testEqualsObject() {
		Actor a1 = new Actor("Pepe", "h", "01/01/2000");
		Actor a2 = new Actor("Pepe", "h", "01/01/2000");

		assertEquals(a1, a2);
	}
}
