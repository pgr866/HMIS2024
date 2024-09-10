package org.ualhmis.oscars;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa un premio en la base de datos de los premios Oscar.
 */
class Premio {

	/**
     * El nombre del premio.
     */
    private String nombre;

    /**
     * La lista de películas nominadas para el premio.
     */
    private List<Pelicula> nominadas;

    /**
     * La película ganadora del premio.
     */
    private Pelicula ganadora;

	/**
	 * Constructor de la clase Premio.
	 * 
	 * @param nombre El nombre del premio.
	 */
	public Premio(String nombre) {
		this.nombre = nombre;
		this.nominadas = new ArrayList<>();
	}

	/**
	 * Obtiene el nombre del premio.
	 * 
	 * @return El nombre del premio.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene la lista de películas nominadas para el premio.
	 * 
	 * @return La lista de películas nominadas para el premio.
	 */
	public List<Pelicula> getNominadas() {
		return nominadas;
	}

	/**
	 * Obtiene la película ganadora del premio.
	 * 
	 * @return La película ganadora del premio.
	 */
	public Pelicula getGanadora() {
		return ganadora;
	}

	/**
	 * Añade una película a la lista de nominadas para el premio.
	 * 
	 * @param pelicula La película a añadir como nominada.
	 */
	public void addNominada(Pelicula pelicula) {
		nominadas.add(pelicula);
	}

	/**
	 * Establece una película como ganadora del premio.
	 * 
	 * @param pelicula La película ganadora del premio.
	 */
	public void setGanadora(Pelicula pelicula) {
		ganadora = pelicula;
	}
}
