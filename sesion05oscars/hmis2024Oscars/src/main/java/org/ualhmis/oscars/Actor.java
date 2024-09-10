package org.ualhmis.oscars;

/**
 * Esta clase representa un actor en la base de datos de los premios Oscar.
 * Extiende la clase ActorOActriz para incluir información específica de los
 * actores.
 */
class Actor extends ActorOActriz {

	/**
	 * Constructor de la clase Actor.
	 * 
	 * @param nombre          El nombre del actor.
	 * @param sexo            El sexo del actor.
	 * @param fechaNacimiento La fecha de nacimiento del actor.
	 */
	public Actor(String nombre, String sexo, String fechaNacimiento) {
		super(nombre, sexo, fechaNacimiento);
	}
}
