package programa;
/**
 * Esta clase implementará diferentes métodos que están relacionados 
   con la sumas de la calculadora.
   Además la clase contará con un atributo, donde se guardará el valor acumulado,
   el cual será privado y de tipo double, y le inicializaremos a 0
 * 
 * @author Marta Aparicio
 * @version  
 */

public class Suma {
	/**
	 *  valorAcumuladoSuma es el valor real de la suma acumulada
	 */
	public static double valorAcumuladoSuma=0;
     
 /**
 * Método que calculará la suma de dos números reales 
 * @param num1 representa el primer numero de tipo double.
 * @param num2 representa el segundo numero de tipo double.
 * @return devuelve el resultado de tipo double, dado de la operación num1+num2
 */
    public  static double Suma2Reales(double num1, double num2){
    	
       double resultado= num1+num2;
	return resultado;
  } 
/**
 * Método que realizará la suma de dos números de tipo enteros 
 * @param num1 representa el primer numero de tipo entero.
 * @param num2 representa el segundo numero de tipo entero.
 * @return devuelve el resultado de tipo entero, dado de la operación num1+num2
 */
    public  static int Suma2Enteros(int num1, int num2){
        int resultado= num1+num2;
	return resultado;
  } 
/**
 * Método el cual sumará tres valores numerico de tipo real. 
 * @param num1 representa el primer numero de tipo double.
 * @param num2 representa el segundo numero de tipo double.
 * @param num3 representa el segundo numero de tipo double.
 * @return devuelve el resultado de tipo double, dado de la operación num1+num2+num3
 */
    public static double Suma3Reales(double num1, double num2, double num3){
       double resultado= num1+num2+num3;
        return resultado;
    }
 /**
 * Este metodo calculará el valor acumulado, el cual se guardará en un atributo
  creado en la clase suma.
 * @param num representa valor numerico a introducir 
 */
    public static void acumulado (double num){
	valorAcumuladoSuma= valorAcumuladoSuma + num;
    }
}
