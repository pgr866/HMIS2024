package org.ualhmis.oscars;

/**
 * Esta clase representa una persona en la base de datos de los premios Oscar.
 * Puede ser utilizada para actores, actrices y directores.
 */
class Persona {

	/** El nombre de la persona. */
	private String nombre;
	
	/** El sexo de la persona. */
	private String sexo;
	
	/** La fecha de nacimiento de la persona en formato "dd/mm/aaaa". */
	private String fechaNacimiento;
	
	/**
	 * Constructor de la clase Persona.
	 * 
	 * @param nombre          El nombre de la persona.
	 * @param sexo            El sexo de la persona.
	 * @param fechaNacimiento La fecha de nacimiento de la persona en formato
	 *                        "dd/mm/aaaa".
	 */
	public Persona(String nombre, String sexo, String fechaNacimiento) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Obtiene el nombre de la persona.
	 * 
	 * @return El nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene el sexo de la persona.
	 * 
	 * @return El sexo de la persona.
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * Obtiene la fecha de nacimiento de la persona.
	 * 
	 * @return La fecha de nacimiento de la persona en formato "dd/mm/aaaa".
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Calcula el valor hash para esta persona.
	 * 
	 * @return El valor hash para esta persona.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}

	/**
	 * Compara esta persona con otro objeto para determinar si son iguales.
	 * 
	 * @param obj El objeto a comparar con esta persona.
	 * @return true si el objeto es igual a esta persona, false en caso contrario.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}
}
