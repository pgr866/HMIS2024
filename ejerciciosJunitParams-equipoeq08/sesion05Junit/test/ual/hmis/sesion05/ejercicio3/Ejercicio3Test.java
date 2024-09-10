package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase de pruebas para el método password de la clase Ejercicio3.
 * Utiliza datos parametrizados provenientes de un archivo CSV.
 */
public class Ejercicio3Test {

    private final Ejercicio3 ejercicio3 = new Ejercicio3();

    /**
     * Método de prueba para evaluar la funcionalidad del método password de Ejercicio3.
     * Utiliza datos parametrizados de un archivo CSV que contiene entradas y salidas esperadas.
     * @param input Cadena de entrada para el método password.
     * @param expectedOutput Cadena esperada como salida del método password.
     */
    @ParameterizedTest
    @CsvFileSource(files = "resources/Ejercicio3Test.csv")
    void testPassword(String input, String expectedOutput) {
        String result = ejercicio3.password(input);
        assertEquals(expectedOutput, result);
    }
}
