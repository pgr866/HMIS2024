package ual.hmis.sesion05.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * Clase de prueba para el método transformar de la clase Ejercicio1.
 * Se utiliza una fuente de datos CSV para proporcionar casos de prueba.
 */
class Ejercicio1Test {

	/**
     * Método de prueba parametrizado que utiliza un archivo CSV como fuente de datos.
     * Comprueba si el método transformar de la clase Ejercicio1 produce el resultado esperado.
     *
     * @param input El número de entrada a transformar.
     * @param expected El resultado esperado después de la transformación.
     */
	@ParameterizedTest
	@CsvFileSource(files = "resources/Ejercicio1Test.csv")
	void testTransformar(int input, int expected) {
		Ejercicio1 c = new Ejercicio1();
		assertEquals(expected, c.transformar(input));
		// assertTrue(c.transformar(input)==expected);
	}
}
