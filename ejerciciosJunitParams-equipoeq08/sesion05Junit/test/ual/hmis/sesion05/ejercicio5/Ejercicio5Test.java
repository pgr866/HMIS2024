package ual.hmis.sesion05.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Esta clase contiene casos de prueba parametrizados para la clase Ejercicio5,
 * que prueba los métodos de obtenerPalabrasOrdenAlfabetico y obtenerPalabrasOrdenOcurrencias.
 */
class Ejercicio5Test {

	/**
     * Prueba el método obtenerPalabrasOrdenAlfabetico y obtenerPalabrasOrdenOcurrencias
     * con casos de prueba cargados desde un archivo CSV.
     *
     * @param entrada la cadena de entrada
     * @param esperado_alfabetico la cadena esperada ordenada alfabéticamente
     * @param esperado_ocurrencias la cadena esperada ordenada por ocurrencias
     * @throws IOException si ocurre un error de lectura del archivo
     */
    @ParameterizedTest
    @CsvFileSource(files = "resources/Ejercicio5Test.csv")
    public void testObtenerPalabrasOrdenAlfabeticoOcurrencias(String entrada, String esperado_alfabetico, String esperado_ocurrencias) throws IOException {
    	Ejercicio5 contador = new Ejercicio5();
    	List<String> resultado_alfabetico = contador.obtenerPalabrasOrdenAlfabetico(entrada);
    	assertEquals(Arrays.asList(esperado_alfabetico.split("\\s+")), resultado_alfabetico);
        List<String> resultado_ocurrencias = contador.obtenerPalabrasOrdenOcurrencias(entrada);
        assertEquals(Arrays.asList(esperado_ocurrencias.split("\\s+")), resultado_ocurrencias);
    }
}
