package ual.hmis.sesion05.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * La clase Ejercicio4 proporciona métodos para mezclar dos conjuntos de elementos comparables.
 */
public class Ejercicio4 {
	
	/**
     * Mezcla dos conjuntos de elementos comparables y devuelve una lista ordenada sin duplicados.
     *
     * @param <T>        el tipo de elementos en los conjuntos, debe ser comparable
     * @param conjuntoA  el primer conjunto de elementos a mezclar
     * @param conjuntoB  el segundo conjunto de elementos a mezclar
     * @return           una lista ordenada que contiene todos los elementos de los conjuntos sin duplicados
     */
	public static <T extends Comparable<T>> List<T> mezclarConjuntos(List<T> conjuntoA, List<T> conjuntoB) {
		Set<T> conjuntoOrdenado = new TreeSet<>(conjuntoA);
        conjuntoOrdenado.addAll(conjuntoB);
        return new ArrayList<>(conjuntoOrdenado);
    }
}
