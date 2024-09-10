package org.ualhmis.oscars;

import java.util.HashMap;
import java.util.Map;

/**
 * Esta clase gestiona los premios en la base de datos de los premios Oscar.
 */
class GestorPremios {

	/**
	 * Mapa que contiene los premios y sus respectivos objetos Premio.
	 */
	private Map<String, Premio> premios;

	/**
	 * Constructor de la clase GestorPremios. Inicializa el mapa de premios.
	 */
	public GestorPremios() {
		this.premios = new HashMap<>();
	}

	/**
	 * Obtiene el mapa de premios.
	 * 
	 * @return El mapa de premios.
	 */
	public Map<String, Premio> getPremios() {
		return premios;
	}

	/**
	 * Crea un nuevo premio con el nombre especificado.
	 * 
	 * @param nombre El nombre del premio a crear.
	 */
	public void crearPremio(String nombre) {
		premios.put(nombre, new Premio(nombre));
	}

	/**
	 * Nominar una película para un premio específico.
	 * 
	 * @param nombrePremio El nombre del premio al que se desea nominar la película.
	 * @param pelicula     La película que se desea nominar.
	 */
	public void nominarPelicula(String nombrePremio, Pelicula pelicula) {
		if (premios.containsKey(nombrePremio)) {
			premios.get(nombrePremio).addNominada(pelicula);
		} else {
			System.out.println("El premio '" + nombrePremio + "' no existe.");
		}
	}

	/**
	 * Asigna una película como ganadora de un premio específico.
	 * 
	 * @param nombrePremio El nombre del premio al que se desea asignar la película
	 *                     ganadora.
	 * @param pelicula     La película que se desea asignar como ganadora.
	 */
	public void asignarGanadora(String nombrePremio, Pelicula pelicula) {
		if (premios.containsKey(nombrePremio)) {
			premios.get(nombrePremio).setGanadora(pelicula);
		} else {
			System.out.println("El premio '" + nombrePremio + "' no existe.");
		}
	}
}
