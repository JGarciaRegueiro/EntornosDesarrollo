package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import programa.Producto;

class TestProducto {

	@BeforeAll
	public static void empezarPruebas() {
		System.out.println("Empiezan las pruebas de los métodos de la clase Producto:");
		System.out.println("");
		System.out.println("---Si no se verifica un método es que ha saltado una excepción en ese método---");
		System.out.println("");
	}

	/**
	 * Método para probar que el producto de dos números reales se hace
	 * correctamente.
	 */
	@Test
	public void pruebaProducto2Reales() {
		double num1 = 4.3;
		double num2 = 2.6;

		double valorEsperado = 11.18;
		double valorObtenido = Producto.producto2Reales(num1, num2);
		assertEquals(valorEsperado, valorObtenido,0);
		System.out.println("Pruebas finalizadas del método pruebaProducto2Reales");
	}

	/**
	 * Método para probar que el producto de dos números enteros se hace
	 * correctamente.
	 */
	@Test
	public void pruebaProducto2Enteros() {
		int num1 = 10;
		int num2 = 7;

		int valorEsperado = 70;
		int valorObtenido = Producto.producto2Enteros(num1, num2);
		assertTrue(valorEsperado ==valorObtenido);
		System.out.println("Pruebas finalizadas del método pruebaProducto2Enteros");
	}

	/**
	 * Método para probar que el producto de tres números reales se hace
	 * correctamente.
	 */
	@Test
	public void pruebaProducto3Reales() {
		double num1 = 4.3;
		double num2 = 2.6;
		double num3 = 5.7;

		double valorEsperado = 63.7;
		double valorObtenido = Producto.producto3Reales(num1, num2, num3);
		assertEquals(valorObtenido, valorEsperado, 0.1);
		System.out.println("Pruebas finalizadas del método pruebaProducto3Reales");
	}

	/**
	 * Método para probar la potencia de un número.
	 */
	@Test
	public void pruebaPotencia() {
		double base=2;
		double exponente=5;
		double valorEsperado= 32;
		double valorObtenido = Producto.potencia(base, exponente);
		assertEquals(valorObtenido, valorEsperado, 0);
		
		System.out.println("Pruebas finalizadas del método pruebaPotencia");
	}

	/**
	 * Método que imprime por pantalla que las pruebas se han finalizado.
	 */
	@AfterAll
	public static void pruebasFinalizadas() {
		System.out.println("Pruebas Finalizadas");

	}
	

}
