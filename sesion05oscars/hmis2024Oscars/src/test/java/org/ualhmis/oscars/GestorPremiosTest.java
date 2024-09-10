package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

/**
 * Esta clase es una prueba unitaria para el gestor de premios.
 */
class GestorPremiosTest {
	/**
	 * Prueba los métodos del gestor de premios.
	 */
	@Test
	void testEqualsObject() {
		GestorPremios gp1 = new GestorPremios();
		gp1.crearPremio("Oscars");
		gp1.crearPremio("Goya");

		Map<String, Premio> premios = new HashMap<>();
		premios.put("Oscars", new Premio("Oscars"));
		premios.put("Goya", new Premio("Goya"));

		Director director = new Director("Christopher Nolan", "Masculino", "30/07/1970");
		Pelicula pelicula = new Pelicula("Inception", director);
		gp1.nominarPelicula("Goya", pelicula);
		gp1.nominarPelicula("Bafta", pelicula);

		gp1.asignarGanadora("Goya", pelicula);
		gp1.asignarGanadora("Bafta", pelicula);

		assertTrue(gp1.getPremios().containsKey("Oscars"));
		assertTrue(gp1.getPremios().containsKey("Goya"));
		assertTrue(gp1.getPremios().get("Goya").getNominadas().contains(pelicula));
		assertEquals(gp1.getPremios().get("Goya").getGanadora(), pelicula);

	}
}
