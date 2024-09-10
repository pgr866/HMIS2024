package org.ualhmis.oscars;

/**
 * Esta clase representa un director en la base de datos de los premios Oscar.
 * Extiende la clase Persona para incluir información específica de los
 * directores.
 */
class Director extends Persona {

	/**
	 * Constructor de la clase Director.
	 * 
	 * @param nombre          El nombre del director.
	 * @param sexo            El sexo del director.
	 * @param fechaNacimiento La fecha de nacimiento del director.
	 */
	public Director(String nombre, String sexo, String fechaNacimiento) {
		super(nombre, sexo, fechaNacimiento);
	}
}
