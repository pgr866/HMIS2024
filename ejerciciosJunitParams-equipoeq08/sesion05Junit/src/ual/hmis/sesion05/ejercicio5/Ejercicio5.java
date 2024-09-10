package ual.hmis.sesion05.ejercicio5;

import java.io.IOException;
import java.util.*;

/**
 * Clase que proporciona métodos para obtener palabras ordenadas alfabéticamente y por ocurrencias.
 */
public class Ejercicio5 {

	/**
     * Obtiene una lista de palabras ordenadas alfabéticamente a partir de una línea de texto.
     * @param linea La línea de texto de la que se extraen las palabras.
     * @return Una lista de palabras ordenadas alfabéticamente.
     * @throws IOException Si ocurre un error de entrada/salida durante el procesamiento.
     */
    public List<String> obtenerPalabrasOrdenAlfabetico(String linea) throws IOException {
    	List<String> palabras = Arrays.asList(linea.split("\\s+"));
        Collections.sort(palabras);
        return palabras;
    }

    /**
     * Obtiene una lista de palabras ordenadas por ocurrencias a partir de una línea de texto.
     * @param linea La línea de texto de la que se extraen las palabras.
     * @return Una lista de palabras ordenadas por ocurrencias.
     * @throws IOException Si ocurre un error de entrada/salida durante el procesamiento.
     */
    public List<String> obtenerPalabrasOrdenOcurrencias(String linea) throws IOException {
        List<String> palabras = Arrays.asList(linea.split("\\s+"));
        Map<String, Integer> contadorPalabras = new HashMap<>();
        for (String palabra : palabras)
            contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0) + 1);

        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(contadorPalabras.entrySet());
        listaOrdenada.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        List<String> resultado = new ArrayList<>();
        for (Map.Entry<String, Integer> entrada : listaOrdenada)
            resultado.add(entrada.getKey());
        return resultado;
    }
}
