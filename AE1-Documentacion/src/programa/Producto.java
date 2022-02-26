package programa;
/**
	 * Esta clase implementará todos los métodos que están relacionados 
	 * con el producto y cáclulo de la potencia de un número.
	 *
	 * @author Marta Aparicio && Daniel Jiménez && Jorge García
	 * @version 1.0
	 */

public class Producto {
	
	
	/**
	 * Metodo que calcula el producto de dos números reales. Devuelve otro número real con la solución.
	 * @param num1 representa el primer número real que se utiliza para calcular el producto.
	 * @param num2 representa el segundo número real que se utiliza para calcular el producto.
	 * @return devuelve un número real con el resultado del producto de num1xnum2.
	 */
	public static double producto2Reales(double num1, double num2) {
		double resultado = 0;
		
		resultado = num1 * num2;
		return resultado;
	}
	
	/**
	 * Método que calcula el producto de dos números enteros. Devuelve otro número entero con la solución.
	 * @param num1 representa el primer número entero que se utiliza para calcular el producto.
	 * @param num2 representa el segundo número entero que se utiliza para calcular el producto.
	 * @return devuelve un número entero con el resultado del producto de num1xnum2.
	 */
	public static int producto2Enteros(int num1, int num2) {
		int resultado = 0;
		
		resultado = num1 * num2;
		return resultado;
	}

	/**
	 * Método que calcula el producto de tres números reales. Devuelve otro número real con la solución.
	 * @param num1 representa el primer número real que se utiliza para calcular el producto.
	 * @param num2 representa el segundo número real que se utiliza para calcular el producto.
	 * @param num3 representa el tercer número real que se ultiliza para calcular el producto.
	 * @return devuelve un número real con el resultado del producto de num1xnum2xnum3.
	 * @throws java.lang.ArithmeticException Si son números muy grandes, dará error el programa y lanzará una excepción.
	 */
	public static double producto3Reales(double num1, double num2, double num3) {
		double resultado = 0 ;
		try {
		resultado = num1 * num2 * num3;
		}catch(Exception e) {
			System.out.println("Error: los números a multiplicar son demasiado grandes");
		}
		
		return resultado;
	}

	/**
	 * Método que calcula la potencia de un número. Devuelve un número real con el resultado de la potencia.
	 * @param base representa el número base sobre el que se va a calcular la potencia.
	 * @param exponente representa el exponente al que se va a elevar la base para obtener la potencia.
	 * @return devuelve un número real con el resultado de la potencia (base^exponente).  
	 * @throws java.lang.ArithmeticException Si base y exponente son números muy grandes, dará error el programa y lanzará una excepción . 
	 */
	public static double potencia(double base, double exponente) {
		double resultado= 0 ;
		resultado = Math.pow(base, exponente);
		return resultado;
	}
}
