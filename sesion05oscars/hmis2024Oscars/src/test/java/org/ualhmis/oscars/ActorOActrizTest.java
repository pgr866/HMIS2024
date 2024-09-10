package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Esta clase es una prueba unitaria para la clase ActorOActriz.
 */
class ActorOActrizTest {

	/**
	 * Prueba el método equals de la clase ActorOActriz.
	 */
	@Test
	void testEqualsObject() {
		ActorOActriz a1 = new ActorOActriz("Pepe", "h", "01/01/2000");
		ActorOActriz a2 = new ActorOActriz("Pepe", "h", "01/01/2000");
		assertEquals(a1, a2);
	}
}
