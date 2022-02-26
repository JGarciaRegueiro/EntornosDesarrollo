package programa;


/**
 * Clase que se encarga de la división de números enteros y reales, calcula raíces e inversos de un número.
 * 
 * @author  Marta Aparicio && Daniel Jiménez && Jorge García
 * @version 1.0
 * 
 */
public class Cociente {
	
	private static double resultado=0;
	
	/**
	 * Método que calcula la división de dos números reales. Devuelve otro número real con la solución.
	 * @param numerador representa el número real que se utiliza de numerador en la división.
	 * @param denominador representa el número real que se utiliza de denominador en la división.
	 * @return devuelve un número real con el resultado de la división del numerador/denominador. 
	 * @throws java.lang.ArithmeticException Si el denominador es cero el método dará error y lanzará una excepción.
	 */
	
	public static double divisionDosReales (double numerador, double denominador) {
		try {
			resultado=numerador/denominador;
		}catch(Exception e) {
			System.out.println("Error el denominador añadido es 0");
		}
		
		return resultado;
	}
	
	/**
	 * Método que calcula la división de dos números enteros. Devuelve un número real con la solución para evitar desbordamientos.
	 * @param num1 representa el número real que se utiliza de numerador en la división.
	 * @param denom1 representa el número real que se utiliza de denominador en la división, no puede ser cero.
	 * @return devuelve un número real con el resultado de la división del num1/denom1. Se almacenará el resultado en un double, por tanto
	 * se soportan resultados con números no exactos.
	 * @throws java.lang.ArithmeticException Si el denominador es cero el método dará error y lanzará una excepción.
	 */
	public static double divisionDosEnteros (int num1, int denom1) {
		try {
			resultado=(double)num1/denom1;//daba error porque no lo estabamos haciendo un cast a double
		}catch(Exception e) {
			System.out.println("Error el denominador añadido es 0");
		}
		
		return resultado ;
	}
	
	/**
	 * Método que calcula el inverso de un número.
	 * @param numero representa el número real sobre el que se calcula el inverso, no puede ser cero.
	 * @return devuelve un número real con el inverso de numero (1/numero). 
	 * @throws java.lang.ArithmeticException Si el numero es cero el método dará error y lanzará una excepción.
	 */
	public static double inverso (double numero) {
		try {
			resultado=1/numero;
		}catch(Exception e) {
			System.out.println("Error el denominador añadido es 0");
		}
		
		return resultado ;
	}
	
	/**
	 * Método que calcula la raíz de un número.
	 * @param numero representa el número real sobre el que se calcula la raíz, no puede ser negativo.
	 * @return devuelve un número real con el resultado de la raíz. El resultado podría dar error en caso de que la calculadora admitiera números negativos.
	 * @throws java.lang.ArithmeticException Si calculadora admite números negativos, dará un error al ejecutar y se lanzará una excepción.
	 */
	public static double raiz (double numero) {
		resultado=Math.sqrt(numero);
		return resultado ;
	}
}