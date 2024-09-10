package ual.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Pruebas para la clase Ejercicio4 utilizando parámetros de entrada desde un archivo CSV.
 */
public class Ejercicio4Test {
	
	/**
     * Método privado para parsear una cadena de conjunto en una lista de cadenas.
     * 
     * @param conjunto La cadena que representa el conjunto.
     * @return Una lista de cadenas que representa el conjunto.
     */
    private List<String> parsearConjunto(String conjunto) {
    	conjunto = conjunto.replace("'", "");
        List<String> lista = new ArrayList<>();
        if (!conjunto.isEmpty()) {
            for (String elemento : conjunto.split(";")) {
                lista.add(elemento);
            }
        }
        return lista;
    }

    /**
     * Prueba la función de mezclar conjuntos de la clase Ejercicio4.
     * 
     * @param conjuntoA         Cadena que representa el primer conjunto.
     * @param conjuntoB         Cadena que representa el segundo conjunto.
     * @param expectedResult    Cadena que representa el resultado esperado de la mezcla.
     */
    @ParameterizedTest
    @CsvFileSource(files = "resources/Ejercicio4Test.csv")
    void testMezclarConjuntos(String conjuntoA, String conjuntoB, String expectedResult) {
        List<String> conjuntoAList = parsearConjunto(conjuntoA);
        List<String> conjuntoBList = parsearConjunto(conjuntoB);
        List<String> expectedResultList = parsearConjunto(expectedResult);
        Ejercicio4 e4 = new Ejercicio4();
        List<String> result = Ejercicio4.mezclarConjuntos(conjuntoAList, conjuntoBList);
        assertEquals(expectedResultList, result);
    }
}
