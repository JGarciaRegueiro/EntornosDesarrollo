package junit5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
		int num1= 8;
		int num2 = 4;
		double valorEsperado = 2;
		double valorObtenido = Cociente.divisionDosEnteros(num1,num2);
		assertFalse(valorEsperado!=valorObtenido);
		
	}
	
	/**
	 * M�todo para probar si el c�lculo del inverso se hace correctamente.
	 */
	@Test
	public void pruebaInverso() {
		double numero = 2;
		double valorEsperado = 0.5;
		double valorObtenido = Cociente.inverso(numero);
		assertTrue(valorEsperado==valorObtenido);
	}
	
	@Test
	public void pruebaRaiz() {
		double numero = 2;
		double valorEsperado = 1.4142;
		double valorObtenido = Cociente.raiz(numero);
		assertEquals(valorObtenido,valorEsperado,0.0001);
	}

}
