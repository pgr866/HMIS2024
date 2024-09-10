package org.ualhmis.oscars;

/**
 * Esta clase representa una actriz en la base de datos de los premios Oscar.
 * Extiende la clase ActorOActriz para incluir información específica de las
 * actrices.
 */
class Actriz extends ActorOActriz {

	/**
	 * Constructor de la clase Actriz.
	 * 
	 * @param nombre          El nombre de la actriz.
	 * @param sexo            El sexo de la actriz.
	 * @param fechaNacimiento La fecha de nacimiento de la actriz.
	 */
	public Actriz(String nombre, String sexo, String fechaNacimiento) {
		super(nombre, sexo, fechaNacimiento);
	}
}
