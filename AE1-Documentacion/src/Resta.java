/**
	 * Esta clase implementará todos los métodos que están relacionados 
	 * con la resta de la calculadora.
	 * Además la clase contará con un atributo, donde se guardará el valor acumulado,
	 * el cual será privado y de tipo double, y le inicializaremos a 0
	 *
	 * @author Marta Aparicio && Daniel Jiménez && Jorge García
	 * @version 1.0
	 */

public class Resta {
	
	private double valorAcumulado=0;
	
	/**
	 * Método que realiza la operación de restar dos números reales.
	 * @param num1 representa el primer numero de tipo double
	 * @param num2 representa el segundo numero de tipo double
	 * @return devuelve el resultado de la operación num1-num2, y será de tipo double.
	 */
	public double Resta2Reales(double num1, double num2) {
		return 0;
	}
	
	/**
	 * Método que calcula el resultado de restar dos números enteros
	 * @param num1 representa el primer numero de tipo entero.
	 * @param num2 representa el segundo numero de tipo entero.
	 * @return devuelve el resultado de la operación num1-num2, y será de tipo entero
	 */
	public int Resta2Enteros(int num1, int num2) {
		return 0;
	}

	/**
	 * Método que devuelve la resta de 3 números reales
	 * @param num1 primer número para realizar la resta
	 * @param num2 número que se restará a num1
	 * @param num3 número que se restará al resultado de la resta de num1 menos num2
	 * @return devuelve el resultado de la operación num1-num2-num3, y será de tipo double
	 */
	public double Resta3Reales(double num1, double num2, double num3) {
		return 0;
	}

	/**
	 * Este metodo calculará el valor acumulado, el cual se guardará en un atributo
	  creado en la clase resta.
	 * @param num representa valor numerico a acumular
	 */
	public void RestaAcumulada(double num) {
		valorAcumulado=valorAcumulado - num;
	}
}
