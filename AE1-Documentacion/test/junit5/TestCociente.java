package junit5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import programa.Cociente;
/**
 * @author Daniel Jiménez Ballesteros
 * @version 1.0
 * Clase que realiza las pruebas de los métodos de la clase Cociente.
 */
class TestCociente  {
	
	@BeforeAll
	public static void empezarPruebas() {
		System.out.println("Empiezan las pruebas de los métodos de la clase Cociente:");
		System.out.println("");
		System.out.println("---Si no se verifica un método es que ha saltado una excepción en ese método---");
		System.out.println("");
	}
	/**
	 * Método para probar que la división de dos números reales se hace correctamente.
	 */
	@Test
	public void pruebaDivision2Reales(){
		double num1= 3.3;
		double num2 = 2.4;
		double valorEsperado = 1.375;
		double valorObtenido = Cociente.divisionDosReales(num1,num2);
		assertEquals(valorObtenido,valorEsperado,0);
		System.out.println("La prueba del método pruebaDivision2Reales se ha finalizado correctamente");//si no aparece en pantalla es que ha saltado una excepción
	}
	
	/**
	 * Método para probar que la división de dos números enteros se hace correctamente.
	 */
	@Test
	public void pruebaDivisionDosEnteros(){
		int num1= 5;
		int num2 = 2;
		double valorEsperado = 2.5;
		double valorObtenido = Cociente.divisionDosEnteros(num1,num2);	
		assertFalse(valorEsperado!=valorObtenido);
		System.out.println("La prueba del método pruebaDivisionDosEnteros se ha finalizado correctamente");//si no aparece en pantalla es que ha saltado una excepción
	}
	
	/**
	 * Método para probar si el cálculo del inverso se hace correctamente.
	 */
	@Test
	public void pruebaInverso(){
		double numero = 2;
		double valorEsperado = 0.5;
		double valorObtenido = Cociente.inverso(numero);
		assertTrue(valorEsperado==valorObtenido);
		System.out.println("La prueba del método pruebaInverso se ha finalizado correctamente");//si no aparece en pantalla es que ha saltado una excepción
	}
	
	@Test
	public void pruebaRaiz() {
		double numero = 2;
		double valorEsperado = 1.4142;
		double valorObtenido = Cociente.raiz(numero);
		assertEquals(valorObtenido,valorEsperado,0.0001);
		System.out.println("La prueba del método pruebaRaiz se ha finalizado correctamente");//si no aparece en pantalla es que ha saltado una excepción
	}
	
	/**
	 * Método que imprime por pantalla que las pruebas se han finalizado.
	 */
	@AfterAll
	public static void pruebasFinalizadas(){
		System.out.println("Pruebas Finalizadas");
		
	}
	

}
