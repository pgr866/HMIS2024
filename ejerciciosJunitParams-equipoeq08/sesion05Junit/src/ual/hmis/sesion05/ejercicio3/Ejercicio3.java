package ual.hmis.sesion05.ejercicio3;

/**
 * Esta clase proporciona un método para enmascarar contraseñas de acuerdo con su longitud.
 */
public class Ejercicio3 {
	
	/**
     * Enmascara una contraseña según su longitud.
     * 
     * @param password la contraseña a enmascarar
     * @return una cadena enmascarada de acuerdo con la longitud de la contraseña:
     *         - Si la longitud es menor que 5, devuelve "password demasiado corto".
     *         - Si la longitud es de 5 a 8 (inclusive), devuelve "********".
     *         - Si la longitud es de 12 a 40 (inclusive), devuelve "************".
     *         - Si la longitud es mayor que 40, devuelve "password demasiado largo".
     *         - En otros casos, devuelve una cadena con tantos caracteres '*' como la longitud de la contraseña.
     */
	public String password (String password){
		int l = password.length();
		if (l < 5)
			return  "password demasiado corto";
		else if (l <= 8)
			return "********";
		else if (l >= 12 && l <= 40)
			return "************";
		else if (l > 40)
			return "password demasiado largo";
		return "*".repeat(password.length());
	}
}
