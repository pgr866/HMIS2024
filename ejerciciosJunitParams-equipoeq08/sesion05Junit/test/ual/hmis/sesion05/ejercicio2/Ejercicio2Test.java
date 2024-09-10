package ual.hmis.sesion05.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * Clase de prueba para el método login de la clase Ejercicio2.
 * Se utiliza una fuente de datos CSV para proporcionar casos de prueba.
 */
class Ejercicio2Test {
	
	/**
     * Método de prueba parametrizado que utiliza un archivo CSV como fuente de datos.
     * Comprueba si el método login de la clase Ejercicio2 devuelve el resultado esperado.
     *
     * @param username El nombre de usuario.
     * @param password La contraseña del usuario.
     * @param result El resultado esperado de la operación de inicio de sesión.
     */
	@ParameterizedTest
	@CsvFileSource(files = "resources/Ejercicio2Test.csv")
	void testLogin_parametrized(String username, String password, String result) {
		// Arrange
		Ejercicio2 e2 = new Ejercicio2();
		// Act
		// Assert
		assertEquals(Boolean.parseBoolean(result), e2.login(username, password));
	}
}
