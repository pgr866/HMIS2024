package ual.hmis.sesion05.ejercicio1;

/**
 * Clase que contiene un método para transformar un número siguiendo ciertas reglas.
 */
public class Ejercicio1{
	
	/**
     * Transforma un número siguiendo las siguientes reglas:
     * - Si el número es par, se divide por 2 y se vuelve a llamar a este método con el resultado.
     * - Si el número es divisible por 3 pero no por 2, se divide por 3 y se vuelve a llamar a este método con el resultado.
     * - Si el número es divisible por 5 pero no por 2 ni por 3, se divide por 5 y se vuelve a llamar a este método con el resultado.
     * - Si ninguna de las condiciones anteriores se cumple, el número se devuelve sin modificar.
     * 
     * @param x El número que se va a transformar.
     * @return El resultado de la transformación.
     */
	public int transformar (int x) {
		int resultado = 0;
		if (x % 2 == 0) // % Resto de una división entre enteros (mod)
			resultado = transformar (x/2);
		else if (x % 3 == 0)
			resultado = transformar (x/3);
		else if (x % 5 == 0)
			resultado = transformar (x/5);
		else return x;
		return resultado;
	}
}
