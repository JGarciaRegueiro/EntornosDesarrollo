package junit5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import programa.Cociente;
/**
 * @author Daniel Jiménez Ballesteros
 * @version 1.0
 * Clase que realiza las pruebas de los métodos de la clase Cociente.
 */
class TestCociente  {
	
	/**
	 * Método para probar que la división de dos números reales se hace correctamente.
	 */
	@Test
	public void pruebaDivision2Reales() {
		double num1= 3.3;
		double num2 = 2.4;
		double valorEsperado = 1.375;
		double valorObtenido = Cociente.divisionDosReales(num1,num2);
		assertEquals(valorObtenido,valorEsperado,0);
	}
	
	/**
	 * Método para probar que la división de dos números enteros se hace correctamente.
	 */
	@Test
	public void pruebaDivisionDosEnteros() {
		int num1= 5;
		int num2 = 2;
		double valorEsperado = 2.5;
		double valorObtenido = Cociente.divisionDosEnteros(num1,num2);
		assertEquals(valorObtenido,valorEsperado,0);
		
	}

}
