package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a operadores matematicos. La clase
 * "Math"
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030103 extends Apartado {

	protected String obtenerPractica() {
		return "P-VAR";
	}

	protected String obtenerBloque() {
		return "Operadores matematicos - Clase <<Math>>";
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio1.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo
	 * necesario para realizar la operacion: obtener la raiz cuadrada de 256
	 */
	public void ejercicio01() {
		cabecera("01", "Calcular la raiz cuadrada de un numero");

		// Inicio modificacion
		//256
		
		double raiz=256.0;
		System.out.println(" la raiz cuadrada de "+raiz+" es: "+Math.sqrt(raiz));
		
		// Fin modificacion
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio2.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo
	 * necesario para realizar la operacion: obtener el resultado de elevar al
	 * cubo el numero 9
	 */
	public void ejercicio02() {
		cabecera("02", "Calcular potencias");

		// Inicio modificacion
		
		int potencia=9;
		System.out.println(" El cubo de "+potencia+" es: "+Math.pow(9,3));
		
		// Fin modificacion
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio3.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo
	 * necesario para generar un numero aleatorio contenido entre 5 y 10
	 */
	public void ejercicio03() {
		cabecera("03", "Generar numeros aleatorios");

		// Inicio modificacion
		double rando;
		rando=Math.random()*5 +5;
		System.out.println(rando);
		// Fin modificacion
	}

	/**
	 * Operadores matematicos - Clase <<Math>> - Ejercicio4.
	 *
	 * </br>
	 *
	 * Consultar la clase <<Math>> del API de Java y programar el codigo necesario
	 * para conocer la superficie de un circulo de diez unidades de radio.
	 */
	public void ejercicio04() {
		cabecera("04", "Calcular la superficie de un circulo");

		// Inicio modificacion
		double result;
		result=Math.PI * 100;
		System.out.println("El area del circulo de radio 10 unidades es: "+result);
		
		// Fin modificacion
	}
}
