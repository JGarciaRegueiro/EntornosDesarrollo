package junit5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import programa.Cociente;
/**
 * @author Daniel Jim�nez Ballesteros
 * @version 1.0
 * Clase que realiza las pruebas de los m�todos de la clase Cociente.
 */
class TestCociente  {
	
	/**
	 * M�todo para probar que la divisi�n de dos n�meros reales se hace correctamente.
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
	 * M�todo para probar que la divisi�n de dos n�meros enteros se hace correctamente.
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
