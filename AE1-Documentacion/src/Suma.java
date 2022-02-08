/**
 * Esta clase implementará diferentes métodos que están relacionados 
 * con la sumas de la calculadora.
 * Además la clase contará con un atributo, donde se guardará el valor acumulado,
 * el cual será privado y de tipo double, y le inicializaremos a 0
 * 
 * @author Marta Aparicio && Daniel Jiménez && Jorge García
 * @version  1.0
 */

public class Suma {
	
	private double valorAcumulado=0;
      
	/**
	 * Metodo que calculará la suma de dos números reales 
	 * @param num1 representa el primer numero de tipo double.
	 * @param num2 representa el segundo numero de tipo double.
	 * @return devuelve el resultado de tipo double, dado de la operación num1+num2
	 */
    public double Suma2Reales(double num1, double num2){
    	return 0;
    } 
    
	/**
	 * Método que realizará la suma de dos números de tipo enteros 
	 * @param num1 representa el primer numero de tipo entero.
	 * @param num2 representa el segundo numero de tipo entero.
	 * @return devuelve el resultado de tipo entero, dado de la operación num1+num2
	 */
    public int Suma2Enteros(int num1, int num2){
    	return 0;
    } 
    
	/**
	 * Método el cual sumará tres valores numerico de tipo real. 
	 * @param num1 representa el primer numero de tipo double.
	 * @param num2 representa el segundo numero de tipo double.
	 * @param num3 representa el tercer numero de tipo double.
	 * @return devuelve el resultado de tipo double, dado de la operación num1+num2+num3
	 */
    public double Suma3Reales(double num1, double num2, double num3){
        return 0;
    }
    
	 /**
	 * Este metodo calculará el valor acumulado, el cual se guardará en un atributo
	 * creado en la clase suma.
	 * @param num representa valor numerico a acumular 
	 */
    public void acumulado (double num){
    	valorAcumulado= valorAcumulado + num;
    }
}
