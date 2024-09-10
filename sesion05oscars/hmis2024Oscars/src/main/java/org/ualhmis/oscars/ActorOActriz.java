package org.ualhmis.oscars;

/**
 * Esta clase representa un actor o actriz en la base de datos de los premios
 * Oscar. Extiende la clase Persona para incluir información específica de los
 * actores o actrices.
 */
public class ActorOActriz extends Persona {

	/**
	 * Constructor de la clase ActorOActriz.
	 * 
	 * @param nombre          El nombre del actor o actriz.
	 * @param sexo            El sexo del actor o actriz.
	 * @param fechaNacimiento La fecha de nacimiento del actor o actriz.
	 */
	public ActorOActriz(String nombre, String sexo, String fechaNacimiento) {
		super(nombre, sexo, fechaNacimiento);
	}
}
