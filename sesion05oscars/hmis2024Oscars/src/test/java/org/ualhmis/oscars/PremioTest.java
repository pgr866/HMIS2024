package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Esta clase es una prueba unitaria para la clase Premio.
 */
class PremioTest {

	/**
	 * Prueba los atributos de la clase Premio.
	 */
	@Test
	void testEqualsAtributosPremio() {
		Premio p1 = new Premio("Mejor pelicula");
		assertTrue(p1.getNombre().equals("Mejor pelicula"));

		Director d1 = new Director("Christopher Nolan", "Masculino", "30/07/1970+");
		Pelicula peli1 = new Pelicula("Inception", d1);

		assertTrue(p1.getNominadas().isEmpty() == true);

		p1.addNominada(peli1);
		assertTrue(p1.getNominadas().contains(peli1));
		p1.setGanadora(peli1);
		assertTrue(p1.getGanadora().equals(peli1));
	}
}