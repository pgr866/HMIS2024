package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

/**
 * Esta clase es una prueba unitaria para la aplicación PremiosCineApp.
 */
class TestPremiosCineApp {

	/**
	 * Prueba el método main de la aplicación PremiosCineApp.
	 */
	@Test
	void testMainMethod() {
		PrintStream originalOut = System.out;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bos));

		// Acción
		PremiosCineApp p = new PremiosCineApp(); // Para llegar al 100%: creación de objeto y llamada al constructor por
													// defecto
		PremiosCineApp.main(null);

		// Aserción
		String salida = "La película ganadora del Oscar a la Mejor Película es: Inception";
		assertEquals(salida + System.lineSeparator(), bos.toString(),
				"La salida por consola no es exactamente igual a la esperada.");

		// Deshacer el enlace en System
		System.setOut(originalOut);
	}
}
