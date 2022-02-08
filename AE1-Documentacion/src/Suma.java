/**
 * Esta clase implementar� diferentes m�todos que est�n relacionados 
 * con la sumas de la calculadora.
 * Adem�s la clase contar� con un atributo, donde se guardar� el valor acumulado,
 * el cual ser� privado y de tipo double, y le inicializaremos a 0
 * 
 * @author Marta Aparicio && Daniel Jim�nez && Jorge Garc�a
 * @version  1.0
 */

public class Suma {
	
	private double valorAcumulado=0;
      
	/**
	 * Metodo que calcular� la suma de dos n�meros reales 
	 * @param num1 representa el primer numero de tipo double.
	 * @param num2 representa el segundo numero de tipo double.
	 * @return devuelve el resultado de tipo double, dado de la operaci�n num1+num2
	 */
    public double Suma2Reales(double num1, double num2){
    	return 0;
    } 
    
	/**
	 * M�todo que realizar� la suma de dos n�meros de tipo enteros 
	 * @param num1 representa el primer numero de tipo entero.
	 * @param num2 representa el segundo numero de tipo entero.
	 * @return devuelve el resultado de tipo entero, dado de la operaci�n num1+num2
	 */
    public int Suma2Enteros(int num1, int num2){
    	return 0;
    } 
    
	/**
	 * M�todo el cual sumar� tres valores numerico de tipo real. 
	 * @param num1 representa el primer numero de tipo double.
	 * @param num2 representa el segundo numero de tipo double.
	 * @param num3 representa el tercer numero de tipo double.
	 * @return devuelve el resultado de tipo double, dado de la operaci�n num1+num2+num3
	 */
    public double Suma3Reales(double num1, double num2, double num3){
        return 0;
    }
    
	 /**
	 * Este metodo calcular� el valor acumulado, el cual se guardar� en un atributo
	 * creado en la clase suma.
	 * @param num representa valor numerico a acumular 
	 */
    public void acumulado (double num){
    	valorAcumulado= valorAcumulado + num;
    }
}
