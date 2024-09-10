package org.ualhmis.oscars;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa una película en la base de datos de los premios Oscar.
 */
class Pelicula {

	/** El título de la película. */
	private String titulo;

	/** El director de la película. */
	private Director director;

	/** El actor protagonista de la película. */
	private Actor actorProtagonista;

	/** La actriz protagonista de la película. */
	private Actriz actrizProtagonista;

	/** La lista de actores secundarios de la película. */
	private List<Actor> actoresSecundarios;

	/** La lista de actrices secundarias de la película. */
	private List<Actriz> actricesSecundarias;
	
	/**
	 * Constructor de la clase Pelicula.
	 * 
	 * @param titulo   El título de la película.
	 * @param director El director de la película.
	 */
	public Pelicula(String titulo, Director director) {
		this.titulo = titulo;
		this.director = director;
		this.actoresSecundarios = new ArrayList<>();
		this.actricesSecundarias = new ArrayList<>();
	}

	/**
	 * Obtiene el título de la película.
	 * 
	 * @return El título de la película.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Obtiene el director de la película.
	 * 
	 * @return El director de la película.
	 */
	public Director getDirector() {
		return director;
	}

	/**
	 * Obtiene el actor protagonista de la película.
	 * 
	 * @return El actor protagonista de la película.
	 */
	public Actor getActorProtagonista() {
		return actorProtagonista;
	}

	/**
	 * Establece el actor protagonista de la película.
	 * 
	 * @param actorProtagonista El actor protagonista de la película.
	 */
	public void setActorProtagonista(Actor actorProtagonista) {
		this.actorProtagonista = actorProtagonista;
	}

	/**
	 * Obtiene la actriz protagonista de la película.
	 * 
	 * @return La actriz protagonista de la película.
	 */
	public Actriz getActrizProtagonista() {
		return actrizProtagonista;
	}

	/**
	 * Establece la actriz protagonista de la película.
	 * 
	 * @param actrizProtagonista La actriz protagonista de la película.
	 */
	public void setActrizProtagonista(Actriz actrizProtagonista) {
		this.actrizProtagonista = actrizProtagonista;
	}

	/**
	 * Obtiene la lista de actores secundarios de la película.
	 * 
	 * @return La lista de actores secundarios de la película.
	 */
	public List<Actor> getActoresSecundarios() {
		return actoresSecundarios;
	}

	/**
	 * Obtiene la lista de actrices secundarias de la película.
	 * 
	 * @return La lista de actrices secundarias de la película.
	 */
	public List<Actriz> getActricesSecundarias() {
		return actricesSecundarias;
	}

	/**
	 * Añade un actor secundario a la película.
	 * 
	 * @param actorSecundario El actor secundario a añadir.
	 */
	public void addActorSecundario(Actor actorSecundario) {
		actoresSecundarios.add(actorSecundario);
	}

	/**
	 * Añade una actriz secundaria a la película.
	 * 
	 * @param actrizSecundaria La actriz secundaria a añadir.
	 */
	public void addActrizSecundaria(Actriz actrizSecundaria) {
		actricesSecundarias.add(actrizSecundaria);
	}
}
