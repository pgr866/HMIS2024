package ual.hmis.sesion05.ejercicio2;

/**
 * Clase que proporciona funcionalidades para el proceso de inicio de sesión.
 */
public class Ejercicio2 {
	
	/**
     * Método para verificar las credenciales de inicio de sesión.
     *
     * @param username Nombre de usuario.
     * @param password Contraseña del usuario.
     * @return True si las credenciales son válidas, false en caso contrario.
     */
	public boolean login (String username, String password){
		username = username.replace("'", "");
		password = password.replace("'", "");
		// comprobar que sean distintos de vacio
		if (username.isEmpty() || password.isEmpty())
			return false;
		// comprobar que la longitud sea < 30
		if (username.length()>= 30 || password.length()>=30)
			return false;
		// llamar al método de la bbdd
		return compruebaLoginEnBD(username, password);
	}

	/**
     * Método para simular la comprobación de inicio de sesión en la base de datos.
     *
     * @param username Nombre de usuario.
     * @param password Contraseña del usuario.
     * @return True si las credenciales coinciden con las almacenadas en la base de datos, false en caso contrario.
     */
	public boolean compruebaLoginEnBD (String username, String password){
		// método mock (simulado)
		if (username.equals("user") && password.equals("pass"))
			return true;
		else
			return false;
	}
}
