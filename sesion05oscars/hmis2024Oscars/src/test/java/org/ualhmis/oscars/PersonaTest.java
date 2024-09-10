package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Esta clase es una prueba unitaria para la clase Persona.
 */
class PersonaTest {

	/**
	 * Prueba los métodos equals y getters de la clase Persona.
	 */
	@Test
	void testEqualsObject() {
		Persona p1 = new Persona("Pepe", "h", "01/01/2000");
		Persona p2 = new Persona("Pepe", "h", "01/01/2000");
		Persona p3 = p1;
		Persona p4 = null;
		Director d1 = new Director("Dire", "m", "01/01/2000");
		Pelicula peli1 = new Pelicula("Maven mola !!!", d1);

		assertTrue(p1.equals(p2));
		assertTrue(p1.equals(p3));
		assertFalse(p1.equals(p4));
		assertEquals(false, p1.equals(p4), "El parametro no es null.");

		assertFalse(p1.equals(peli1));
	}

	/**
	 * Prueba los métodos equals y hashCode de la clase Persona con valores nulos.
	 */
	@Test
	void testEqualsNull() {
		Persona p1 = new Persona("Pepe", "h", null);
		Persona p2 = new Persona("Juan", "h", null);
		Persona p3 = new Persona(null, "h", "01/01/2000");
		Persona p4 = new Persona(null, "m", "01/01/2000");
		Persona p5 = new Persona("Pepe", null, "01/01/2000");
		Persona p6 = new Persona("Pepe", null, "01/01/2000");
		Persona p7 = new Persona("Pepe", "h", "01/01/2000");

		assertFalse(p1.equals(p2));
		assertFalse(p1.equals(p3));
		assertFalse(p4.equals(p2));
		assertFalse(p3.equals(p4));
		assertFalse(p3.equals(p5));
		assertTrue(p5.equals(p6));
		assertFalse(p5.equals(p7));
	}

	/**
	 * Prueba los métodos getters y hashCode de la clase Persona.
	 */
	@Test
	void testGetters() {
		Persona p1 = new Persona("Pepe", "h", "01/01/2000");
		Persona p2 = new Persona("Pepe", "h", "01/01/2000");
		Persona p3 = new Persona(null, null, null);
		Persona p4 = new Persona(null, null, null);

		assertEquals(p1.getNombre(), p2.getNombre());
		assertEquals(p1.getSexo(), p2.getSexo());
		assertEquals(p1.getFechaNacimiento(), p2.getFechaNacimiento());
		assertEquals(p1.hashCode(), p2.hashCode());
		assertEquals(p3.hashCode(), p4.hashCode());
	}
}
