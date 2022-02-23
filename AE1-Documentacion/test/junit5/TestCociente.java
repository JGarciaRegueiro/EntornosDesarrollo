package junit5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
		int num1= 8;
		int num2 = 4;
		double valorEsperado = 2;
		double valorObtenido = Cociente.divisionDosEnteros(num1,num2);
		assertFalse(valorEsperado!=valorObtenido);
		
	}
	
	/**
	 * Método para probar si el cálculo del inverso se hace correctamente.
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
