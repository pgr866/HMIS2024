package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Esta clase es una prueba unitaria para la clase Película.
 */
class PeliculaTest {
	/**
	 * Prueba los métodos de la clase Película.
	 */
	@Test
	void testEqualsObject() {
		Director d1 = new Director("Christopher Nolan", "Masculino", "30/07/1970+");
		Pelicula p1 = new Pelicula("Inception", d1);
		assertTrue(p1.getTitulo().equals("Inception"));
		assertTrue(p1.getDirector().equals(d1));

		Actor actor1 = new Actor("pepe", "h", "01/01/2001");
		Actriz actriz1 = new Actriz("pepa", "m", "01/01/2001");
		p1.setActorProtagonista(actor1);
		p1.setActrizProtagonista(actriz1);
		assertTrue(p1.getActorProtagonista().equals(actor1));
		assertTrue(p1.getActrizProtagonista().equals(actriz1));

		Actor actor2 = new Actor("Jose", "h", "01/01/2001");
		Actriz actriz2 = new Actriz("Josefa", "m", "01/01/2001");
		p1.addActorSecundario(actor2);
		p1.addActrizSecundaria(actriz2);
		assertTrue(p1.getActoresSecundarios().contains(actor2));
		assertTrue(p1.getActricesSecundarias().contains(actriz2));
	}
}